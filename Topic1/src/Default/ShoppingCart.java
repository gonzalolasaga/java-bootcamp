package Default;

import java.util.*;
import Mails.MailAddItem;
import Mails.MailTransaction;
import Pays.*;

/**
 * This class you contain a list of products that a customer wants to buy stored
 * in a treemap. Also contains methods to obtain relevant information about
 * these products
 * 
 * @author GONZALO L
 */

public class ShoppingCart {
	Map<Double, List<Item>> items;
	double total;
	int id;
	private static int payCounter = 0;

	public ShoppingCart() {
		items = new TreeMap<Double, List<Item>>();
		this.total = 0;
	}

	public void addProduct(Item product) {
		double price = product.getPrice();
		if (!items.containsKey(price)) {
			List<Item> listProduct = new ArrayList<Item>();
			listProduct.add(product);
			items.put(price, listProduct);
		} else {
			List<Item> aux = new ArrayList<Item>();
			aux = items.get(price);
			aux.add(product);
			items.put(price, aux);
		}
		this.total += product.getPrice();
		MailAddItem nm = new MailAddItem(product.itemName);
		nm.notif();
	}

	public double getTotal() {
		return this.total;
	}

	public double getCheapest() {
		return ((TreeMap<Double, List<Item>>) items).firstKey();
	}

	public double getMoreExpensive() {
		return ((TreeMap<Double, List<Item>>) items).lastKey();
	}

	public double actionPay(Payment typeOfPayment) {
		this.payCounter++;
		this.id = payCounter;
		MailTransaction nm = new MailTransaction(this.id);
		nm.notify();
		return typeOfPayment.pay(this);

	}

	public void showItems() {
		Iterator it = items.keySet().iterator();
		while (it.hasNext()) {
			Double key = (Double) it.next();
			List<Item> aux = new ArrayList<Item>();
			aux = items.get(key);
			for (int i = 1; i < aux.size(); i++) {
				System.out.println("Item " + (aux.get(i).itemName) + " $ "
						+ (key));
			}
		}
	}
}
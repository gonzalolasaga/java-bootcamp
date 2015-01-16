import java.util.*;

/**
 * this class
 * 
 * @author GONZALO L
 *
 */

public class ShoppingCart {
	Map<Double, List<Item>> items;
	double total;
	int id;
	private static int payCounter = 0;

	public ShoppingCart() {
		Map<Double, List<Item>> items = new TreeMap<Double, List<Item>>();
		this.total = 0;
	}

	public void addProduct(Item product, Double price) {
		if (items.containsKey(price) == false) {
			List<Item> listProduct = new ArrayList<Item>();
			listProduct.add(product);
			items.put(price, listProduct);
		} else {
			List<Item> aux = new ArrayList<Item>();
			aux = items.get(price);
			aux.add(product);
			items.put(price, aux);
		}
		this.total += price;
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

	public void actionPay(Payment typeOfPayment) {
		typeOfPayment.pay(this);
		this.id = payCounter;
		this.payCounter++;
	}

	public void showItems() {
		Iterator it = items.keySet().iterator();
		while (it.hasNext()) {
			Double key = (Double) it.next();
			List<Item> aux = new ArrayList<Item>();
			aux = items.get(key);
			for (int i = 1; i < aux.size(); i++) {
				System.out.println("Item " + (aux.get(i).itemName) + " $ "+ (key));
			}
		}
	}
}
package topic4;

import java.util.ArrayList;
import java.util.List;

import notify.Notifier;
import offers.Item;
import offers.Offer;
import pays.Pay;

public class ShoppingCart {
	List<Item> products;
	List<Item> items;
	Item itm;
	Counter c;
	String aux;
	List<Offer> offers;

	public ShoppingCart() {
		products = new ArrayList<Item>();
		items = new ArrayList<Item>();
		items.add(new Item("sugar", 6.0));
		items.add(new Item("milk", 8.5));
		items.add(new Item("coffe", 15.0));
		this.c = Counter.getInstance();
		offers = new ArrayList<Offer>();
	}

	public void buy(String name) {
		itm = getItem(name);
		if (itm != null) {
			products.add(itm);
		}
	}

	public Double payNow(Pay p) {
		Double result = p.actionPay(this);
		c.getSecuense();
		Notifier n = new Notifier();
		n.notifyObservers();
		return result;
	}

	public Double getTotal() {
		Double total = 0.0;
		for (int i = 0; i < products.size(); i++) {
			total += products.get(i).getPrice();
		}
		return total;
	}

	public void addItem(Item i) {
		items.add(i);
		Notifier n = new Notifier();
		n.notifyObservers();
	}

	public Item getItem(String name) {
		Item aux = null;
		for (int i = 0; i < items.size(); i++) {
			if ((items.get(i).getName()) == name) {
				aux = items.get(i);
				break;
			}
		}
		return aux;
	}

	public void deleteProduct(String name) {
		for (int i = 0; i < products.size(); i++) {
			if ((products.get(i).getName()) == name) {
				products.remove(i);
				break;
			}
		}
	}

	public Item getMoreCheapest() {
		itm = products.get(0);
		for (int i = 1; i < products.size(); i++) {
			if (products.get(i).getPrice() < itm.getPrice()) {
				itm = products.get(i);
			}
		}
		return itm;
	}

	public Item getMostExpensive() {
		itm = products.get(0);
		for (int i = 1; i < products.size(); i++) {
			if (products.get(i).getPrice() > itm.getPrice()) {
				itm = products.get(i);
			}
		}
		return itm;
	}

	public String displayItem() {
		aux = "";
		for (int i = 0; i < items.size(); i++) {
			aux += items.get(i).getName() + "," + items.get(i).getPrice() + " ";
		}
		return aux;
	}

	public void addOffer(Offer o) {
		offers.add(o);
		Notifier n = new Notifier();
		n.notifyObservers();
	}

	public String displayOffer(Offer o) {
		return o.showOffer();
	}
}

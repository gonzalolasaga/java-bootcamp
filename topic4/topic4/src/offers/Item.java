package offers;

import notify.Notifier;

public class Item extends Offer {
	Double price;

	public Item(String name, Double price) {
		super(name);
		this.price = price;
	}

	public String getName() {
		return super.name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setName(String name) {
		super.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
		Notifier n=new Notifier();
		n.notifyObservers();
		
	}

	@Override
	public String showOffer() {
		String aux = super.name + "," + this.price + " ";
		return aux;
	}
}
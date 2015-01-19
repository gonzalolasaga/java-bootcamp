package Default;
/**
 * This class is responsible for the actions of the simplest offers and is part of the "composite pattern".
 * @author GONZALO L
 *
 */
public class SimpleOffer extends Offer {
	Item it;
	double price;

	public SimpleOffer(Item it, double price, String n) {
		super(n);
		this.it = it;
		this.price = price;
		this.it.setOffert(true, this.price);
	}

	public void showOffer() {
		System.out.print(super.name);
		System.out.println(this.price);
	}

	public double getPrice() {
		return price;
	}
}

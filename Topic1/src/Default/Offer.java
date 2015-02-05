package Default;

/**
 * This is an abstract class that is used to implement a composition pattern with OfferComposite and Item.
 * 
 * @author GONZALO L
 *
 */
public abstract class Offer {
	String name;
	double price;

	public Offer(String n) {
		this.name = n;
	}

	public abstract double getPrice();

	public abstract void showOffer();
}

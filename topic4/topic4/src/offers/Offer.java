package offers;

public abstract class Offer {
	String name;
	double price;

	public Offer(String n) {
		this.name = n;
	}

	public abstract Double getPrice();

	public abstract String showOffer();

}

package Default;


/**
 * This class contains information about a product and important functionality
 * to the system.
 * 
 * @author GONZALO L
 *
 */
public class Item extends Offer {
	String itemName;
	int id;
	double price;

	public Item(String itemName, int id, Double price) {
		super(itemName);
		this.itemName = itemName;
		this.id = id;
		this.price = price;
	}

	public void showOffer() {
		System.out.print(this.name+" = ");
		System.out.println(this.price);
	}

	public String getName() {
		return this.itemName;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double p) {
		this.price = p;
		//notify changed price
		String changePrice=("the price of "+this.itemName+" product was changed to "+p );
		Notify nI= new Notify();
		nI.addObserver(new Mail());
		nI.notif(changePrice);
		}

	public int getId() {
		return this.id;
	}
}

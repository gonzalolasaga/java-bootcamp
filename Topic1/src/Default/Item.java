package Default;
import Mails.MailChangePrice;
/**
 * This class contains information about a product and important functionality to the system.
 * @author GONZALO L
 *
 */
public class Item {
	String itemName;
	int id;
	double price;
	boolean offerState = false;

	public Item(String itemName, int id, Double price) {
		this.itemName = itemName;
		this.id = id;
		this.price = price;
	}

	public String getName() {
		return this.itemName;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
		MailChangePrice nm = new MailChangePrice(this.itemName, this.price);
		nm.notif();
	}

	public void setOffert(boolean state, double p) {
		this.offerState = state;
		this.setPrice(p);
	}

	public int getId() {
		return this.id;
	}
}

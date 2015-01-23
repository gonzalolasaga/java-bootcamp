package Mails;
/**
 * This class implements the interface "Mail", its function is to alert when a price is changed.
 * @author GONZALO L
 *
 */
public class MailChangePrice implements Mail {
	String name;
	Double price;

	public MailChangePrice(String name, Double newPrice) {
		this.name = name;
		this.price = newPrice;

	}

	public void notif() {
		System.out.println("The price of item" + this.name + "is" + this.price);
	}
}

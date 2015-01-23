package Mails;
/**
 *  This class implements the interface "Mail", its function is to alert when a new product is added.
 * @author GONZALO L
 *
 */
public class MailAddItem implements Mail {
	String name;

	public MailAddItem(String name) {
		this.name = name;
	}

	public void notif() {
		System.out.println("The item " + this.name + " was added");
	}
}

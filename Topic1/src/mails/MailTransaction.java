package Mails;
/**
 * This class implements the interface "Mail", its function is to alert when a transaction was made.
 * @author GONZALO L
 *
 */
public class MailTransaction implements Mail {

	int id;

	public MailTransaction(int id2) {
		this.id = id2;

	}

	public void notif() {
		System.out
				.println("The transaction " + this.id + " has been completed");
	}
}

package Pays;
import Default.ShoppingCart;
/**
 * This class implements the interface "Payment", its function is implement the pay method "PayPal".
 * @author GONZALO L
 *
 */
public class PaymentPP implements Payment {
	String users;
	String pass;

	public PaymentPP(String users, String pass) {
		this.users = users;
		this.pass = pass;
	}

	public double pay(ShoppingCart cart) {
		double totalToPay = cart.getTotal() - cart.getCheapest();
		return totalToPay;
		// payment is documented here
	}
}

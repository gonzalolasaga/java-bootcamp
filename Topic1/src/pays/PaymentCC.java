package Pays;
import Default.*;
/**
 * This class implements the interface "Payment", its function is implement the pay method "Credit Card".
 * @author GONZALO L
 *
 */
public class PaymentCC implements Payment {
	double cardn;
	String cardName;
	double discount;

	public PaymentCC(double cardNumber, String cardName, double discount) {
		this.cardn = cardNumber;
		this.cardName = cardName;
		this.discount = discount;
	}

	public double pay(ShoppingCart cart) {
		double totalToPay = 0;
		totalToPay = cart.getTotal() - (cart.getTotal() * this.discount);
		return totalToPay;

		// payment is documented here
	}

	public void setDiscount(double dis) {
		this.discount = dis;
	}
}

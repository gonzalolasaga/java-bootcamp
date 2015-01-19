package Pays;
import Default.ShoppingCart;
/**
 * This class implements the interface "Payment", its function is implement the pay method "Cash".
 * @author GONZALO L
 *
 */

public class PaymentCash implements Payment {
	double discount;

	public PaymentCash(double discount) {
		this.discount = discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double pay(ShoppingCart cart) {
		double totalToPay = cart.getTotal()
				- (cart.getMoreExpensive() * this.discount);
		return totalToPay;

		// payment is documented here
	}

}

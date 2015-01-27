package pays;

import Default.*;
/**
 *  This class is used to apply a discount on the the shopping cart.
 * @author GONZALO L
 *
 */
public class Payment {
	Discount d;

	public Payment(Discount d) {
		this.d = d;
	}

	public double pay(ShoppingCart cart) {
		double totalToPay = cart.getTotal() - (d.getDiscount(cart));
		System.out.println("Total neto"+totalToPay);
		return totalToPay;
	}

	public void setDiscount(Discount disc) {
		this.d = disc;
	}

}

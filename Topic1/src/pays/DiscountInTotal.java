package pays;

import Default.ShoppingCart;
/**
 * This class is used to create a discount on the total price of the shopping cart
 * @author GONZALO L
 *
 */
public class DiscountInTotal implements Discount {
	double discount;

	public DiscountInTotal(double d) {
		this.discount = d;
	}

	public double getDiscount(ShoppingCart cart) {
		return cart.getTotal()* this.discount;
	}

	public void setDiscount(double d) {
		this.discount = d;
	}
}

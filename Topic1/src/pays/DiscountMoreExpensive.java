package pays;

import Default.ShoppingCart;
/**
 * This class is used to create a discount on the more expensive product of the shopping cart
 * @author GONZALO L
 *
 */
public class DiscountMoreExpensive implements Discount {
	double discount;

	public DiscountMoreExpensive(double d) {
		this.discount = d;
	}

	public double getDiscount(ShoppingCart cart) {
		return cart.getMoreExpensive() * this.discount;
	}

	public void setDiscount(double d) {
		this.discount = d;
	}
}
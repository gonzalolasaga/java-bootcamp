package pays;

import Default.ShoppingCart;
/**
 * This class is used to create a discount on the more cheapest product of the shopping cart.
 * @author GONZALO L
 *
 */
public class DiscountMoreCheapest implements Discount {
	double discount;

	public DiscountMoreCheapest(double d) {
		this.discount = d;
	}

	public double getDiscount(ShoppingCart cart) {
		return cart.getCheapest() * this.discount;
	}

	public void setDiscount(double d) {
		this.discount = d;
	}
}
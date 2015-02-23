package discounts;

import topic4.ShoppingCart;

public class DiscountTotal  implements Discount{

	Double discount;
	public DiscountTotal(double d) {
		this.discount = d;
	}

	public double getDiscount(ShoppingCart cart) {
		return cart.getTotal()* this.discount;
	}

	public void setDiscount(double d) {
		this.discount = d;
	}

}

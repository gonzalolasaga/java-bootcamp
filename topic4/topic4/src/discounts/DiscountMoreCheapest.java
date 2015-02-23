package discounts;

import topic4.ShoppingCart;

public class DiscountMoreCheapest implements Discount {
	double discount;

	public DiscountMoreCheapest(double d) {
		this.discount = d;
	}

	public double getDiscount(ShoppingCart cart) {
		return cart.getMoreCheapest().getPrice() * this.discount;
	}

	public void setDiscount(double d) {
		this.discount = d;
	}
}
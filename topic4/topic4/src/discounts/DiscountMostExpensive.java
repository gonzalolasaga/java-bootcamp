package discounts;

import topic4.ShoppingCart;

public class DiscountMostExpensive implements Discount {
	
	Double discount;
	
	public DiscountMostExpensive(Double d){
		this.discount = d;
	}

	public double getDiscount(ShoppingCart cart) {
		return cart.getMostExpensive().getPrice() * this.discount;
	}

	public void setDiscount(double d) {
		this.discount = d;
	}
}

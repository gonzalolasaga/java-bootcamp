package pays;

import discounts.Discount;
import topic4.ShoppingCart;

public class Cash implements Pay {
	Discount d;

	public Cash() {
		d = null;
	}

	public Cash(Discount d) {
		this.d = d;
	}

	@Override
	public Double actionPay(ShoppingCart cart) {
		if (d != null) {
			return cart.getTotal() - d.getDiscount(cart);
		}
		return cart.getTotal();
	}
}

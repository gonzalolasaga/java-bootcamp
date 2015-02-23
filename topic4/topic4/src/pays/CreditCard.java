package pays;

import discounts.Discount;
import topic4.ShoppingCart;

public class CreditCard implements Pay {
	String name;
	int creditNumber;
	Discount d;
	public CreditCard(String name, int creditNumber) {
		this.name = name;
		this.creditNumber = creditNumber;
		this.d=null;
	}
	public CreditCard(String name, int creditNumber, Discount d) {
		this.name = name;
		this.creditNumber = creditNumber;
		this.d=d;
	}

	@Override
	public Double actionPay(ShoppingCart cart) {
		if (d!=null){
			return cart.getTotal()-d.getDiscount(cart);
		}
		return cart.getTotal();
	}
}

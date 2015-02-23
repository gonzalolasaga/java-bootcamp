package pays;

import discounts.Discount;
import topic4.ShoppingCart;

public class PayPal implements Pay {
	String mail;
	String pass;
	Discount d;

	public PayPal(String mail, String pass) {
		this.mail = mail;
		this.pass = pass;
		this.d=null;
	}
	public PayPal(String mail, String pass,Discount d) {
		this.mail = mail;
		this.pass = pass;
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

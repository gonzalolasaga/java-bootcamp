public class PaymentCC {
	double cardn;
	String cardName;
	double discount;

	public PaymentCC(double cardNumber, String cardName, double discount) {
		this.cardn = cardNumber;
		this.cardName = cardName;
		this.discount = discount;
	}

	public void pay(ShoppingCart cart) {
		double totalToPay = 0;
		totalToPay = cart.getTotal();
		// payment is documented here
	}

	public void setDiscount(double dis) {
		this.discount = dis;
	}
}

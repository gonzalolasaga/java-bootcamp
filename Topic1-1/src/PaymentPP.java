public class PaymentPP {
	String users;
	String pass;

	public PaymentPP(String users, String pass) {
		this.users = users;
		this.pass = pass;
	}

	public void pay(ShoppingCart cart) {
		Double totalToPay = cart.getTotal()- cart.getCheapest();
		// payment is documented here
	}
}

public class PaymentCash {
	Double discount;
	public PaymentCash (Double discount){
		this.discount=discount;
	}
	public void pay(ShoppingCart cart) {
		Double totalToPay = cart.getTotal()- (cart.getMoreExpensive()*this.discount);
		// payment is documented here
	}

}

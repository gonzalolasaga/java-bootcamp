import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<String> items;
	double total;

	public ShoppingCart() {
		ArrayList<String> items = new ArrayList<String>();
		this.total = 0;
	}

	public void addProduct(String product, double price) {
		this.items.add(product);
		this.total += price;
	}

	public void actionPay(Payment typeOfPayment) {
		typeOfPayment.pay(total);

	}
}

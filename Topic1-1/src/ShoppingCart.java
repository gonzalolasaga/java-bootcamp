import java.util.*;

public class ShoppingCart {
	Map<Double, List<String>> items;
	double total;

	public ShoppingCart() {
		Map<Double, List<String>> items = new TreeMap<Double, List<String>>();
		this.total = 0;
	}

	public void addProduct(String product, Double price) {
		if (items.containsKey(price) == false) {
			List<String> listProduct = new ArrayList<String>();
			listProduct.add(product);
			items.put(price, listProduct);
		} else {
			List<String> aux = new ArrayList<String>();
			aux = items.get(price);
			aux.add(product);
			items.put(price, aux);
		}
		this.total += price;
	}

	public double getTotal(){
		return this.total;}

	public double getCheapest (){
		return((TreeMap<Double, List<String>>) items).firstKey();
	}
	public double getMoreExpensive (){
		return((TreeMap<Double, List<String>>) items).lastKey();
	}
	public void actionPay(Payment typeOfPayment) {
		typeOfPayment.pay(this);

	}
}

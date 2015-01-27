package Default;
import pays.Payment;
import pays.*;

public class Main {
	public static void main(String[] args) {
		ShoppingCart s1 = new ShoppingCart();
		ShoppingCart s2 = new ShoppingCart();

		Item it1 = new Item("leche", 1, 10.0);
		Item it2 = new Item("agua", 2, 5.0);
		Item it3 = new Item("baso", 3, 15.0);
		
		s1.addProduct(it1);
		s1.addProduct(it2);
		s1.addProduct(it3);
		s2.addProduct(it3);
		
		DiscountMoreExpensive d=new DiscountMoreExpensive(0.1);
		d.setDiscount(0.2);
		Payment CC = new Payment(d);
		s1.actionPay(CC);
		s1.showItems();
		s2.actionPay(CC);
		it3.setPrice(20);
		/*		
		OfferComposite of1 = new OfferComposite("Canasta");
		OfferComposite of = new OfferComposite("Canasta Basica");
		
		of.addOffer(it1);
		of.addOffer(it2);
		of.addOffer(it1);
		of.showOffer();
		of1.addOffer(of);
		of1.addOffer(it3);
		of1.addOffer(it4);
		of1.showOffer();
		
		*/
	}
}

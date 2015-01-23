package Default;
import java.util.ArrayList;
import java.util.List;

import Pays.Payment;
import Pays.PaymentPP;

public class Main {
	public static void main(String[] args) {
		ShoppingCart s1 = new ShoppingCart();
		Item it1 = new Item("leche", 1, 10.0);
		Item it2 = new Item("agua", 2, 5.0);
		s1.addProduct(it1);
		s1.addProduct(it2);
		Payment pc = new PaymentPP("", "");
		s1.actionPay(pc);
		// System.out.println(s1.actionPay(pc));
		SimpleOffer so = new SimpleOffer(it1, 9.0, "Leche");
		SimpleOffer s2 = new SimpleOffer(it1, 9.0, "Agua");
		List<Offer> items = new ArrayList<Offer>();
		items.add(s2);
		OfferComposite of = new OfferComposite("Canasta Basica", items);

		List<Offer> item2 = new ArrayList<Offer>();
		item2.add(of);
		item2.add(so);
		OfferComposite o2 = new OfferComposite("Cuidados", item2);
		o2.showOffer();
	}

}

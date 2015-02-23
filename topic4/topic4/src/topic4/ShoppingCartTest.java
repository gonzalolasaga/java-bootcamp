package topic4;

import static org.junit.Assert.*;
import notify.Mail;
import notify.Notifier;
import offers.Item;
import offers.OfferComp;

import org.junit.Test;

import discounts.Discount;
import discounts.DiscountMoreCheapest;
import discounts.DiscountMostExpensive;
import discounts.DiscountTotal;
import pays.Cash;
import pays.CreditCard;
import pays.Pay;
import pays.PayPal;

public class ShoppingCartTest {

	ShoppingCart cart = new ShoppingCart();
	Double result;
	Item i;
	Discount d;
	Pay p;

	@Test
	public void testPayCash() {
		cart.buy("sugar");
		result = cart.payNow(new Cash());
		assertEquals(result, 6, 0);
	}

	@Test
	public void testPayPal() {
		cart.buy("sugar");
		result = cart.payNow(new PayPal("juan", "1234"));
		assertEquals(result, 6, 0);
	}

	@Test
	public void testCreditCard() {
		cart.buy("sugar");
		result = cart.payNow(new CreditCard("juan", 3456));
		assertEquals(result, 6, 0);
	}

	@Test
	public void testAddDiscountMoreCheapest() {
		cart.buy("sugar");
		cart.buy("milk");
		d = new DiscountMoreCheapest(1.0);
		result = cart.payNow(new CreditCard("juan", 3456, d));
		assertEquals(result, 8, 5);
	}

	@Test
	public void testAddDiscountTotal() {
		cart.buy("sugar");
		cart.buy("milk");
		d = new DiscountTotal(0.5);
		result = cart.payNow(new CreditCard("juan", 3456, d));
		assertEquals(result, 7, 25);
	}

	@Test
	public void testAddDiscountMostExpensive() {
		cart.buy("sugar");
		cart.buy("milk");
		cart.buy("coffe");
		d = new DiscountMostExpensive(0.1);
		result = cart.payNow(new CreditCard("juan", 3456, d));
		assertEquals(result, 28, 0);
	}

	@Test
	public void testGetInstance() {
		int resu = cart.c.getSecuense();
		assertEquals(6, resu);

	}

	@Test
	public void testDisplayAboutItem() {
		String resul = cart.displayItem();
		assertEquals(resul, "sugar,6.0 milk,8.5 coffe,15.0 ");
	}

	@Test
	public void testOffer() {
		OfferComp o1 = new OfferComp("combo1");
		o1.addOffer(cart.getItem("sugar"));
		o1.addOffer(cart.getItem("coffe"));
		OfferComp o2 = new OfferComp("combo2");
		o2.addOffer(o1);
		o2.addOffer(cart.getItem("milk"));
		String resul = cart.displayOffer(o1);
		assertEquals(resul, "combo1,21.0: (sugar,6.0 coffe,15.0 ) ");
		String resul2 = cart.displayOffer(o2);
		assertEquals(resul2,
				"combo2,29.5: (combo1,21.0: (sugar,6.0 coffe,15.0 ) milk,8.5 ) ");

	}

	@Test
	public void testNotifier(){
		Notifier n=new Notifier();
		n.attach(new Mail());
		
	}

}

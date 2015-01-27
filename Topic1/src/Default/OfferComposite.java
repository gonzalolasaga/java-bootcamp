package Default;
import java.util.*;
/**
 * This class is responsible for recursively compose different types of offers within the "composite pattern".
 * @author GONZALO L
 *
 */

public class OfferComposite extends Offer {
	String offerName;
	List<Offer> itemInOffer;

	public OfferComposite(String name) {
		super(name);
		itemInOffer=new ArrayList<Offer>();
	}
	public void addOffer(Offer o){
		itemInOffer.add(o);
	}
	public void showOffer() {
		System.out.print(super.name+"  ");
		System.out.println(this.getPrice());
		for (int i = 0; i < itemInOffer.size(); i++) {
			itemInOffer.get(i).showOffer();
		}
	}
	public double getPrice() {
		double counter = 0;
		for (int i = 0; i < itemInOffer.size(); i++) {
			counter += itemInOffer.get(i).getPrice();
		}
		return counter;
	}
}

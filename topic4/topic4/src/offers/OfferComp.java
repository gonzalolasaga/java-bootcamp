package offers;

import java.util.ArrayList;
import java.util.List;

public class OfferComp extends Offer {

	List<Offer> itemInOffer;

	public OfferComp(String name) {
		super(name);
		itemInOffer = new ArrayList<Offer>();
	}

	public void addOffer(Offer o) {
		itemInOffer.add(o);
	}
	public String getName(){
		return super.name;
	}

	public String showOffer() {
		String aux = "";
		aux+=this.getName()+"," + this.getPrice()+": (";
		for (int i = 0; i < itemInOffer.size(); i++) {
			aux +=itemInOffer.get(i).showOffer();
		}
		aux+=") ";
		return aux;
	}

	public Double getPrice() {
		Double counter = 0.0;
		for (int i = 0; i < itemInOffer.size(); i++) {
			counter += itemInOffer.get(i).getPrice();
		}
		return counter;
	}
}

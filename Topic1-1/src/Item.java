public class Item {
	String itemName;
	int id;

	public Item(String itemName, int id) {
		this.itemName = itemName;
		this.id = id;
	}

	public String getName() {
		return this.itemName;
	}

	public int getId() {
		return this.id;
	}
}

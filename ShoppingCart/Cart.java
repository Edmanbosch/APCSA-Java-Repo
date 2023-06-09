import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> items = new ArrayList<Item>();

	public Cart() {}

	public void addItem(String name, float price) {
		items.add(new Item(name, price));
	}

	public void removeItem(int index) {
		items.remove(index);
	}

	public String toString() {
		String result = "";

		for (int i = 0; i < items.size(); i++) {
			result += ((i + 1) + ". " + items.get(i) + "\n");
		}

		return result;
	}
	
}
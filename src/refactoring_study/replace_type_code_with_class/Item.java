package refactoring_study.replace_type_code_with_class;

public class Item {
	private ItemType itemType;
	private final String title;
	private final int price;
	
	public Item(ItemType itemType, String title, int price) {
		this.itemType = itemType;
		this.title= title;
		this.price= price;
	}
	
	public int getTypecode() {
		return itemType.getTypecode();
	}
	public String getTitle() {
		return title; 
	}
	public int getPrice() {
		return price; 
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", getTypecode(), title, price);
	}
}

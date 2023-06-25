package Springs_XML_cart_Has_a;

public class Cart {
	String name;
	int size;
	Item item;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Cart [name=" + name + ", size=" + size + ", item=" + item + "]\n";
	}
	
}

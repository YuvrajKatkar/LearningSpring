package Springs_XML_cart_Has_a;

public class Item {
	String name;
	double cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", cost=" + cost + "]\n";
	}
	
}

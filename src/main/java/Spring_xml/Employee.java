package Spring_xml;

public class Employee {
	String name;
	long phone;
	String address;
	public Employee(String name, long phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
}

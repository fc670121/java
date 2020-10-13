package fc.demo;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Francis");
		some(c1);
		System.out.println(c1.name);

		Customer c2 = new Customer("Francis");
		other(c2);
		System.out.println(c2.name);
	}

	static void some(Customer c) {
		c.name = "Aliy";
	}

	static void other(Customer c) {
		c = new Customer("John");
	}

}

class Customer {
	String name;

	Customer(String name) {
		this.name = name;
	}
}

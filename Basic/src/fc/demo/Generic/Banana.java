package fc.demo.Generic;

public class Banana extends Fruit {
	public Banana() {
	}

	public Banana(int price, int weight) {
		super(price, weight);
	}

	@Override
	public String toString() {
		return "Banana";
	}
}
package fc.demo.Generic;

public class Apple extends Fruit {
	public Apple() {
	}

	public Apple(int price, int weight) {
		super(price, weight);
	}

	@Override
	public String toString() {
		return "Apple";
	}
}
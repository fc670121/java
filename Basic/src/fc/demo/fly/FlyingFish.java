package fc.demo.fly;

import fc.demo.swim.*;

public class FlyingFish extends Fish implements Flyer {
	public FlyingFish(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println("������a");
	}

	@Override
	public void fly() {
		System.out.println("�����|��");
	}
}

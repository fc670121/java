package fc.demo.fly;

import fc.demo.swim.*;

public class Seaplane extends Airplane implements Swimmer {
	public Seaplane(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.print("���W");
		super.fly();
	}

	@Override
	public void swim() {
		System.out.printf("���W���� %s ������%n", name);
	}
}

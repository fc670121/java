package fc.demo.fly;

public class Airplane implements Flyer {
	protected String name;

	public Airplane(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.printf("���� %s �b��%n", name);
	}
}

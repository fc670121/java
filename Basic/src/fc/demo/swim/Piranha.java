package fc.demo.swim;

public class Piranha extends Fish {
	public Piranha(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.printf("���H�� %s ��a%n", name);
	}
}

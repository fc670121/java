package fc.demo.swim;

public class Shark extends Fish {
	public Shark(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.printf("�T�� %s ��a%n", name);
	}
}
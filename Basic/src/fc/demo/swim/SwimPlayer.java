package fc.demo.swim;

public class SwimPlayer extends Human implements Swimmer {
	public SwimPlayer(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.printf("´åªa¿ï¤â %s ´åªa%n", name);
	}
}

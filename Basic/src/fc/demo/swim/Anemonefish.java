package fc.demo.swim;

public class Anemonefish extends Fish {
	public Anemonefish(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.printf("¤p¤¡³½ %s ´åªa%n", name);
	}
}

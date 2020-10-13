package fc.demo.RPG;

public class SwordsMan extends Role {
	public void fight() {
		System.out.println("´§¼C§ðÀ»");
	}

	@Override
	public String toString() {
		return "¼C¤h : " + super.toString();
	}
}

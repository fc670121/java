package fc.demo.RPG;

public class SwordsMan extends Role {
	public void fight() {
		System.out.println("���C����");
	}

	@Override
	public String toString() {
		return "�C�h : " + super.toString();
	}
}

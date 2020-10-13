package fc.demo;
import fc.demo.RPG.*;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoSwordsMan();
		demoMagician();
	}

    static void demoSwordsMan() {
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("Francis");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        System.out.println(swordsMan.toString());
        System.out.printf("¼C¤h¡G(%s, %d, %d)%n", swordsMan.getName(), 
                swordsMan.getLevel(), swordsMan.getBlood());
    }

    static void demoMagician() {
        Magician magician = new Magician();
        magician.setName("Aliy");
        magician.setLevel(1);
        magician.setBlood(100);
        System.out.println(magician.toString());
        System.out.printf("Å]ªk®v¡G(%s, %d, %d)%n", magician.getName(), 
                magician.getLevel(), magician.getBlood());
    }
}

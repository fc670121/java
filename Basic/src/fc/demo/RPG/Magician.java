package fc.demo.RPG;

public class Magician extends Role {    
    public void fight() {
        System.out.println("�]�k����");
    }
    
    public void cure() {
        System.out.println("�]�k�v��");
    }
    
    @Override
    public String toString() {
    	return "�]�k�v : "+super.toString();
    }
} 
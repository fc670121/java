package fc.demo;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner userInput = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        int guess;
        
        do {
            System.out.print("�q�Ʀr�]0 ~ 9�^:");
            guess = userInput.nextInt();
        } while(guess != number);
        
        System.out.println("�q���F...XD");
        userInput.close();
	}

}

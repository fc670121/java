package fc.demo;
import java.math.BigDecimal;
import java.util.Scanner;
import fc.demo.util.*;

public class ClassExercise {

	public static void main(String[] args) {
		CashCard[] cards = {
				new CashCard("A001",500,0),
				new CashCard("A002",300,0),
				new CashCard("A003",1000)
		};
		
		var scanner = new Scanner(System.in);
        for(CashCard card : cards) {
            System.out.printf("�� (%s, %d, %d) �x�ȡG", 
                    card.GetNumber(), card.GetBalance(), card.GetBonus());
            card.store(scanner.nextInt());
            System.out.printf("���� (%s, %d, %d)%n",
                    card.GetNumber(), card.GetBalance(), card.GetBonus());
        }
        scanner.close();
        
        System.out.printf("Company Name : %s\n\r", CashCard.GetCompanyName());
        
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = a;
        System.out.println(a == b);        // ���false
        System.out.println(a == c);        // ���true
        System.out.println(a.equals(b));  // ���true
	}
}

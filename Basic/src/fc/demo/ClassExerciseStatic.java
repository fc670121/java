package fc.demo;
import fc.demo.util.*;

public class ClassExerciseStatic {

	public static void main(String[] args) {
		
		CashCard[] cards = {
				new CashCard("A001",500,0),
				new CashCard("A002",300,0),
				new CashCard("A003",1000)
		};
		
        for(CashCard card : cards) {
            System.out.printf("(%s, %d, %d)%n",
                    card.GetNumber(), card.GetBalance(), card.GetBonus());
        }

        System.out.printf("Company Name : %s", CashCard.GetCompanyName());
	}
}

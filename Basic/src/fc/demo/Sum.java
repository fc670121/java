package fc.demo;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		long sum = 0;
		long number = 0;
		do {
			System.out.print("��J�Ʀr�G");
			number = Long.parseLong(scanner.nextLine());
			sum += number;
		} while (number != 0);
		System.out.println("�`�X�G" + sum);
		scanner.close();
	}

}

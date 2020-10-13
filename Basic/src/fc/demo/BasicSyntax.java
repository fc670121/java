package fc.demo;

import fc.demo.util.Console;
import fc.demo.util.Final;

public class BasicSyntax {
	public static void main(String[] args) {
		System.out.println("HelloWorld!!!!");
		Console.writeLine("Show util.Console");

		// 篈
		// byteshortintlong 絛瞅
		System.out.printf("%d ~ %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("%d ~ %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("%d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		long longVariable = 9223372036854775807L;
		// 俱计璶L
		System.out.printf("%d ~ %d, Variable : %d%n", Long.MIN_VALUE, Long.MAX_VALUE, longVariable);
		// floatdouble 弘絛瞅
		System.out.printf("%d ~ %d%n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
		System.out.printf("%d ~ %d%n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
		// char ボ Unicode 絛瞅
		System.out.printf("%h ~ %h%n", Character.MIN_VALUE, Character.MAX_VALUE);
		// boolean ㄢ
		System.out.printf("%b ~ %b%n", Boolean.TRUE, Boolean.FALSE);

		// if
		int input = 10;
		int remain = input % 2;
		if (remain == 1) { // 緇计1碞琌计
			System.out.printf("%d 计%n", input);
		} else {
			System.out.printf("%d 案计%n", input);
		}

		// else
		int score = 88;
		char level;
		if (score >= 90) {
			level = 'A';
		} else if (score >= 80 && score < 90) {
			level = 'B';
		} else if (score >= 70 && score < 80) {
			level = 'C';
		} else if (score >= 60 && score < 70) {
			level = 'D';
		} else {
			level = 'E';
		}
		System.out.printf("眔だ单%c%n", level);

		// switch case
		int quotient = score / 10;
		switch (quotient) {
		case 10:
		case 9:
			level = 'A';
			break;
		case 8:
			level = 'B';
			break;
		case 7:
			level = 'C';
			break;
		case 6:
			level = 'D';
			break;
		default:
			level = 'E';
		}
		System.out.printf("眔だ单%c%n", level);

		// for
		// sample 1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// sample 2
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.printf("%d*%d=%2d ", i, j, i * j);
			}
			System.out.println();
		}
		// sample 3
		for (int i = 2, j = 1; j < 10; i = (i == 9) ? ((++j / j) + 1) : (i + 1)) {
			System.out.printf("%d*%d=%2d%c", i, j, i * j, (i == 9 ? '\n' : ' '));
		}

		// while
		short count = 0;
		while (true) {
			int number = (int) (Math.random() * 10);
			System.out.println(number);
			if (number == 5 || count == 20) {
				break;
			}
			count++;
		}
		System.out.println("I hit 5....Orz");

		int number = 0;
		count = 0;
		do {
			number = (int) (Math.random() * 10);
			System.out.println(number);
			count++;
		} while (number != 5 || count == 20);
		System.out.println("I hit 5....Orz");

		// break
		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.printf("i = %d%n", i);
		}

		// continue
		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.printf("i = %d%n", i);
		}

		Final f = new Final();
		System.out.println(f.SKB_DATA + " " + f.SKB_NAME);
	}
}

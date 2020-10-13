package fc.demo;

import java.util.Scanner;
import fc.demo.util.ArrayList;
import static java.lang.System.out;

public class Guest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		collectNameTo(names);
		out.println("訪客名單：");
		printUpperCase(names);
	}

	static void collectNameTo(ArrayList<String> names) {
		Scanner scanner = new Scanner(System.in);
		String name;
		while (true) {
			out.print("訪客名稱(離開請輸quit)：");
			name = scanner.nextLine();
			if (name.equals("quit")) {
				break;
			}
			names.add(name);
		}
		scanner.close();
	}

	static void printUpperCase(ArrayList<String> names) {
		for (int i = 0; i < names.size(); i++) {
			String name = (String) names.get(i);
			out.println(name.toUpperCase());
		}
	}

}

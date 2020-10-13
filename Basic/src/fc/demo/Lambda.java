package fc.demo;

import java.util.Arrays;
//import java.util.Comparator;

public class Lambda {

	public static void main(String[] args) {
		String[] names = { "Justin", "caterpillar", "Bush" };
		/*
		 * Arrays.sort(names, new Comparator<String>() { public int compare(String
		 * name1, String name2) { return name1.length() - name2.length(); } });
		 */
		/*
		 * Comparator<String> byLength = (String name1, String name2) -> name1.length()
		 * - name2.length();
		 */
		/*
		 * Comparator<String> byLength = (name1, name2) -> name1.length() -
		 * name2.length();
		 */

		Arrays.sort(names, (name1, name2) -> name1.length() - name2.length());

		for (String str : names)
			System.out.println(str);

		String[] name1 = { "Justin", "caterpillar", "Bush" };
		Arrays.sort(name1, String::compareTo);

		for (String str : names)
			System.out.println(str);

		String[] name2 = { "Justin", "caterpillar", "Bush" };
		Arrays.sort(name2, String::compareToIgnoreCase);
		
		for (String str : names)
			System.out.println(str);

	}
}

package fc.demo;

import java.util.*;

class ReversedStringOrder implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
}

public class ReversedStringOrderClass {

	public static void main(String[] args) {
		String[] words = { "B", "X", "A", "M", "F", "W", "O" };
		Arrays.sort(words, new ReversedStringOrder());
		for (String word : words) {
			System.out.println(word);
		}

		System.out.println();

		ArrayList<String> arrLt = UtilClass.<String>asList("B", "X", "A", "M", "F", "W", "O");
		for (String word : arrLt) {
			System.out.println(word);
		}
	}

}

class UtilClass {
	@SuppressWarnings("unchecked")
	public static <T> ArrayList<T> asList(T... a) {
		ArrayList<T> arrLt = new ArrayList<>();
		for (T t : a) {
			arrLt.add(t);
		}
		return arrLt;
	}
}
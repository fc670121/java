package fc.demo;

import java.util.*;

//¹ê§@Comparator
public class Sort2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
		Collections.sort(words);
		System.out.println(words);
	}
}
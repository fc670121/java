package fc.demo;

public class ExtendsDemo {
	public static void main(String[] args) {
		String[] words = { "B", "X", "A", "M", "F", "W", "O" };
		Util.sort(words);

		for (int i = 0; i < words.length; i++) {
			if (i + 1 == words.length) {
				System.out.printf("%s", words[i]);
			} else {
				System.out.printf("%s, ", words[i]);
			}
		}
	}
}

class Util {
	@SuppressWarnings("rawtypes")
	public static <T extends Comparable> void sort(T[] array) {
		sort(array, 0, array.length - 1);
	}

	@SuppressWarnings("rawtypes")
	private static <T extends Comparable> void sort(T[] array, int left, int right) {
		if (left < right) {
			int q = partition(array, left, right);
			sort(array, left, q - 1);
			sort(array, q + 1, right);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static <T extends Comparable> int partition(T[] array, int left, int right) {
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (array[j].compareTo(array[right]) <= 0) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, right);
		return i + 1;
	}

	private static <T> void swap(T[] array, int i, int j) {
		T t = array[i];
		array[i] = array[j];
		array[j] = t;
	}
}
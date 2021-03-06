package fc.demo;

public class StackTrace {

	private static String text;

	public static void main(String[] args) {
		try {
			c();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}

	static void c() {
		try {
			b();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			Throwable t = ex.fillInStackTrace();
			throw (NullPointerException) t;
		}
	}

	static void b() {
		a();
	}

	static String a() {
		text = null;
		return text.toUpperCase();
	}

}

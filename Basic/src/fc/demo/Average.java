package fc.demo;

public class Average {

	public static void main(String[] args) {

		long sum = 0;

		for (String arg : args) {
			try {
				sum += Long.parseLong(arg);
			} catch (NumberFormatException | ClassCastException ex) {
				System.out.println(ex);
				System.out.printf("略過非整數1 : %s%n", arg);
			} catch (RuntimeException ex) {
				System.out.println(ex);
				System.out.printf("略過非整數2 : %s%n", arg);				
			}
		}
		System.out.println("平均：" + (float) sum / args.length);
	}
}

package fc.demo.util;

public class SomeClass {	
	public SomeClass() {
		System.out.println("呼叫Some()");
	}

	public SomeClass(int i) {
		System.out.println("呼叫Some(int i)");		
	}
	
	//內部類別
	public class Other1 {
		public Other1() {
			System.out.println("呼叫Other1()");
		}
	}

	//內部類別靜態用法
	public static class Other2 {
		public static int value = 1;

		public Other2() {
			System.out.println("呼叫Other2()");
		}
	}

	// 方法重載讓程式設計人員不用苦惱方法名稱的設計，可用一致的名稱來呼叫類似功能的方法-->重載
	public double someMethod() {
		return 1;
	}

	public double someMethod(int i) {
		return i;
	}

	public double someMethod(float f) {
		return (double) f;
	}

	public double someMethod(int i, float f) {
		return (double) (i * f);
	}
}

package fc.demo.util;

public class SomeClass {	
	public SomeClass() {
		System.out.println("�I�sSome()");
	}

	public SomeClass(int i) {
		System.out.println("�I�sSome(int i)");		
	}
	
	//�������O
	public class Other1 {
		public Other1() {
			System.out.println("�I�sOther1()");
		}
	}

	//�������O�R�A�Ϊk
	public static class Other2 {
		public static int value = 1;

		public Other2() {
			System.out.println("�I�sOther2()");
		}
	}

	// ��k�������{���]�p�H�����έW�o��k�W�٪��]�p�A�i�Τ@�P���W�٨өI�s�����\�઺��k-->����
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

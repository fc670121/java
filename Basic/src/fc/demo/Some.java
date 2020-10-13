package fc.demo;

import fc.demo.util.SomeClass;

public class Some {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeClass someClass = new SomeClass();

		System.out.printf("A: %s\n", someClass.someMethod());
		System.out.printf("B: %s\n", someClass.someMethod(12));
		System.out.printf("C: %s\n", someClass.someMethod((float) 12.3));
		System.out.printf("D: %s\n", someClass.someMethod(12, (float) 1213.1));

		System.out.printf("E: %s\n", someClass.new Other1().toString());
		System.out.printf("F: %s\n", SomeClass.Other2.value);

	}
}

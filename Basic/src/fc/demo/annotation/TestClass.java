package fc.demo.annotation;

public @interface TestClass {
	@SuppressWarnings("rawtypes")
	Class[] value();
}

package fc.demo.annotation;

public @interface Test5 {
	@SuppressWarnings("rawtypes")
	Class expected() default Default.class;

	class Default {
	}
}

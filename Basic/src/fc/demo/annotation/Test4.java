package fc.demo.annotation;

public @interface Test4 {
	int timeout() default 0;
	String message() default "";
}

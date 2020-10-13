package fc.demo.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ ElementType.TYPE_USE })
public @interface Email {
}
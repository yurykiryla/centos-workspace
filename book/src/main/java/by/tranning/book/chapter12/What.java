package by.tranning.book.chapter12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_PARAMETER)
public @interface What {
	String description();
}

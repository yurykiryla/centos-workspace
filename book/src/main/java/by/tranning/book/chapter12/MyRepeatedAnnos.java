package by.tranning.book.chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatedAnnos {
	MyAnno[]value();
}

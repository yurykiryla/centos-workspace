package by.tranning.book.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnno(str = "Meta2", val = 99)
public class Meta2 {

	@MyAnno(str = "Testing", val = 100)
	public static void myMeth() {
		Meta2 ob = new Meta2();

		try {
			Annotation[] annos = ob.getClass().getAnnotations();

			System.out.println("All annotations for class Meta2:");

			for (Annotation a : annos) {
				System.out.println(a);
			}

			System.out.println();

			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();

			System.out.println("All annotations for method myMeth():");

			for (Annotation a : annos) {
				System.out.println(a);
			}
		} catch (NoSuchMethodException a) {
			a.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}

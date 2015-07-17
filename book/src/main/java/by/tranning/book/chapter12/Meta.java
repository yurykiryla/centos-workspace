package by.tranning.book.chapter12;

import java.lang.reflect.Method;

public class Meta {
	@MyAnno
	public static void myMeth(String str, int i) {
		Meta ob = new Meta();

		try {
			Class<?> c = ob.getClass();

			Method m = c.getMethod("myMeth", String.class, int.class);

			MyAnno anno = m.getAnnotation(MyAnno.class);

			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		myMeth("test", 1);
	}

}

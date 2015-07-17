package by.tranning.book.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
	@MyAnno(str = "First Annotation", val = -1)
	@MyAnno(str = "Second Annotation", val = 100)
	public static void myMeth(String str, int i) {
		RepeatAnno ob = new RepeatAnno();

		Class<?> c = ob.getClass();

		try {
			Method m = c.getMethod("myMeth", String.class, int.class);

			Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);

			System.out.println(anno);
			
			Annotation[] annos = m.getAnnotationsByType(MyAnno.class);
			for(Annotation a : annos){
				System.out.println(a);
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth("test", 10);

	}

}

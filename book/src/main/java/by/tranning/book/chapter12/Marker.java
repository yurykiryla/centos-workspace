package by.tranning.book.chapter12;

import java.lang.reflect.Method;

public class Marker {

	@MyMarker
	public static void myMeth() {
		Marker ob = new Marker();
		
		try {
			Method m = ob.getClass().getMethod("myMeth");
			
			if (m.isAnnotationPresent(MyMarker.class)){
				System.out.println("Annotation-Marker is present");
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}

package by.tranning.book.chapter15;

public class ConstructorRefDemo3 {

	static <R, T> R myClassFactory(MyFunc6<R, T> cons, T v){
		return cons.func(v);
	}
	
	public static void main(String[] args) {
		MyFunc6<MyClass1<Double>, Double> myClassCons = MyClass1<Double>::new;
		
		MyClass1<Double> mc = myClassFactory(myClassCons, 100.1);
		
		System.out.println("val in mc: " + mc.getVal());
		
		MyFunc6<MyClass2, String> myClassCons2 = MyClass2::new;
		
		MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");
		
		System.out.println("str in mc2: " + mc2.getStr());

	}

}

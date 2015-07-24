package by.tranning.book.chapter15;

public class ConstructorRefDemo {

	public static void main(String[] args) {
		MyFunc4 myClassCons = MyClass::new;

		MyClass mc = myClassCons.func(100);

		System.out.println(mc.getVal());

	}

}

package by.tranning.book.chapter15;

public class ConstructorRefDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFunc5<Integer> myClassCons = MyClass1<Integer>::new;

		MyClass1<Integer> mc = myClassCons.func(100);

		System.out.println(mc.getVal());
	}

}

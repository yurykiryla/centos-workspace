package by.tranning.book.chapter15;

public class GenericMethodRefDemo {
	static <T> int myOp(MyFunc2<T> f, T[] vals, T v) {
		return f.func(vals, v);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
		String[] strs = { "One", "Two", "Three", "Two" };
		
		int count;
		
		count = myOp(MyArrayOps::countMatching, vals, 4);
		System.out.println("Vals contains " + count + " of 4");
		
		count = myOp(MyArrayOps::countMatching, strs, "Two");
		System.out.println("Strs contains " + count + " of 2");
	}

}

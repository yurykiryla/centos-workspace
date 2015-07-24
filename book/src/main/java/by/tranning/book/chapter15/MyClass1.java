package by.tranning.book.chapter15;

public class MyClass1<T> {
	private T val;

	public MyClass1(T val) {
		super();
		this.val = val;
	}

	public MyClass1() {
		super();
		val = null;
	}

	public T getVal() {
		return val;
	}
}

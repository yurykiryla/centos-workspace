package by.tranning.book.chapter11;

public class A {
	synchronized void foo(B b) throws InterruptedException {
		String name = Thread.currentThread().getName();

		System.out.println(name + " entered to method A.foo()");

		Thread.sleep(1000);

		System.out.println(name + " try to call method B.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("B is in the method A.last()");
	}

}

package by.tranning.book.chapter11;

public class B {
	synchronized void bar(A a) throws InterruptedException{
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " entered to method B.bar()");
		
		Thread.sleep(1000);
		
		System.out.println(name + " try to call method A.last()");
		a.last();
	}
	
	synchronized void last(){
		System.out.println("A is in the method B.last()");
	}
}

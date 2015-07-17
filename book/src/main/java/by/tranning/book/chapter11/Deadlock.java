package by.tranning.book.chapter11;

public class Deadlock implements Runnable {

	A a = new A();
	B b = new B();
	
	public Deadlock() throws InterruptedException {
		Thread.currentThread().setName("Main thread");
		Thread t = new Thread(this, "Concurrent thread");
		t.start();
		
		a.foo(b);
		
		System.out.println("Back to main thread");
	}
			
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			b.bar(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Back to concurrent thread");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Deadlock();
	}

}

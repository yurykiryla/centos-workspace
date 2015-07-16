package by.tranning.book.chapter11;

public class DemoJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
		
		System.out.println("Thread one started: " + ob1.t.isAlive());
		System.out.println("Thread two started: " + ob2.t.isAlive());
		System.out.println("Thread three started: " + ob3.t.isAlive());
		
		try{
			System.out.println("Waiting threads finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch (InterruptedException e)
		{
			System.out.println("Main Thread was interrupted");
		}
		
		System.out.println("Thread one started: " + ob1.t.isAlive());
		System.out.println("Thread two started: " + ob2.t.isAlive());
		System.out.println("Thread three started: " + ob3.t.isAlive());
		
		System.out.println("Main Thread finished");
	}

}

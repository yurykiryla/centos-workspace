package by.tranning.book.chapter11;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new NewThread("One");
		new NewThread("Two");
		new NewThread("Three");
		
		try
		{
			
			Thread.sleep(10000);
		}
		catch (InterruptedException e)
		{
			System.out.println("Main thread was interrupted");
		}
		
		System.out.println("Main thread finished");
	}

}

package by.tranning.book.chapter11;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new NewThread();
		
		try
		{
			for (int i = 5; i > 0; i--)
			{
				System.out.println("Main thread: " + i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Main thread was interrupted");
		}
		
		System.out.println("Main thread finished");
	}

}

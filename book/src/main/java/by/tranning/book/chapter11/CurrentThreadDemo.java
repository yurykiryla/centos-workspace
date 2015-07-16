package by.tranning.book.chapter11;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Current Thread: " + t);
		
		t.setName("My Thread");
		System.out.println("After change thread name:" + t);
		
		try
		{
			for (int n = 5; n > 0; n--)
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Main thread is interrupted");
		}
	}

}

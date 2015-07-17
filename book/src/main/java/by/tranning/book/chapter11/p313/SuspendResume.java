package by.tranning.book.chapter11.p313;

public class SuspendResume {

	public static void main(String[] args) {
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");

		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspend thread One");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resume thread One");
			ob2.mysuspend();
			System.out.println("Suspend thread Two");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Resume thread Two");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Waiting finish of threads");
		try {
			ob1.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ob2.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main thread finished");
	}

}

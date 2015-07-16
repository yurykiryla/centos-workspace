package by.tranning.book.chapter11;

public class NewThread implements Runnable {

	Thread t;
	
	public NewThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Demo thread has created:" + t);
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		try{
			for (int i = 5; i > 0; i--){
				System.out.println("Demo thread: " + i);
				Thread.sleep(500);
			}
		}catch (InterruptedException e){
			System.out.println("Demo thread was interrupted");
		}
		System.out.println("Demo thread finished");
	}

}

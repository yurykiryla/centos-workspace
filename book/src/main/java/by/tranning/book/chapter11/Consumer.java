package by.tranning.book.chapter11;

public class Consumer implements Runnable {
	
	Q q;
	
	Consumer(Q q){
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			q.get();
		}

	}

}

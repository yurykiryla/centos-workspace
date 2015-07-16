package by.tranning.book.chapter11;

public class Synch {

	public static void main(String[] args) {
		Callme target = new Callme();
		
		Caller ob1 = new Caller("Welcome ", target);
		Caller ob2 = new Caller("to synchronize ", target);
		Caller ob3 = new Caller("world", target);

		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}catch (InterruptedException e){
			System.out.println("Interrupted");
		}
	}

}

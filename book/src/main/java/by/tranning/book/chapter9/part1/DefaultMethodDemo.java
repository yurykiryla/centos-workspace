package by.tranning.book.chapter9.part1;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		MyIF obj = new MyIFImp();
		
		System.out.println(obj.getNumber());
		
		System.out.println(obj.getString());

	}

}

package by.tranning.book.chapter15;

public class LambdaDemo {

	public static void main(String[] args) {
		MyNumber myNum;
		
		myNum = () -> 123.45;
		
		System.out.println("Fixed value: " + myNum.getValue());
		
		myNum = () -> Math.random() * 100;
		
		System.out.println("Ramdom value: " + myNum.getValue());
		System.out.println("Ramdom value: " + myNum.getValue());
		
		//myNum = () -> "123.03";

	}

}

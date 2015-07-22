package by.tranning.book.chapter15;

public class LambdaDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumericTest2 isFactor = (n, d) -> (n % d) == 0;
		
		if (isFactor.test(10, 2)){
			System.out.println("Number 2 is factor of number 10");
		}
	}

}

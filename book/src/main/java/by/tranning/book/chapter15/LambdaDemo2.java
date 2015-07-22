package by.tranning.book.chapter15;

public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumericTest isEven = (n) -> (n % 2) == 0;

		if (isEven.test(10)) {
			System.out.println("Number 10 is even");
		}

		if (!isEven.test(9)) {
			System.out.println("Number 9 isn't even");
		}

		NumericTest isNotNeg = (n) -> n >= 0;

		if (isNotNeg.test(1)) {
			System.out.println("Number 1 is not negative");
		}

		if (!isNotNeg.test(-1)) {
			System.out.println("Number -1 is negative");
		}
	}

}

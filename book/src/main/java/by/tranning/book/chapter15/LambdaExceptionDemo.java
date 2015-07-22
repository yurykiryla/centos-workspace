package by.tranning.book.chapter15;

public class LambdaExceptionDemo {

	public static void main(String[] args) throws EmptyArrayException {
		double[] values = { 1.0, 2.0, 3.0, 4.0 };

		DoubleNumericArrayFunc average = n -> {
			double sum = 0;

			if (n.length == 0) {
				throw new EmptyArrayException();
			}

			for (double d : n) {
				sum += d;
			}
			return sum / n.length;
		};

		System.out.println("Average is: " + average.func(values));

		System.out.println("Average is: " + average.func(new double[0]));
	}

}

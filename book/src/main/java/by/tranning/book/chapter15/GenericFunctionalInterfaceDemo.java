package by.tranning.book.chapter15;

public class GenericFunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SomeFunc<String> reverse = str -> {
			String result = "";
			int i;

			for (i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};

		System.out.println("Lambda: " + reverse.func("Lambda"));

		SomeFunc<Integer> factorial = n -> {
			int result = 1;

			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};

		System.out.println("5 factorial: " + factorial.func(5));
	}

}

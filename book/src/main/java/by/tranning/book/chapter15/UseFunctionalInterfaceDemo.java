package by.tranning.book.chapter15;

import java.util.function.Function;

public class UseFunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, Integer> factorial = n -> {
			int result = 1;

			for (int i = 1; i <= n; i++) {
				result = i * result;
			}

			return result;
		};
		
		System.out.println(factorial.apply(10));
	}

}

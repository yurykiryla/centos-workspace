package by.tranning.book.chapter15;

public class BlockLambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringFunc reverse = str -> {
			String result = "";
			int i;

			for (i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};

		System.out.println("Lambda: " + reverse.func("Lambda"));
	}

}

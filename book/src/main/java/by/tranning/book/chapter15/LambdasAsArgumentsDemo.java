package by.tranning.book.chapter15;

public class LambdasAsArgumentsDemo {

	static String strimgOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "Lambda increase java effectivity";
		String outStr;

		System.out.println("This is base String: " + inStr);

		outStr = strimgOp(str -> str.toUpperCase(), inStr);
		System.out.println("String in upeer case: " + outStr);

		outStr = strimgOp(str -> {
			String result = "";
			int i;

			for (i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ')
					result += str.charAt(i);
			}
			return result;
		} , inStr);
		System.out.println("String without spaces: " + outStr);

		StringFunc reverse = str -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println("Reverse String: " + strimgOp(reverse, inStr));
	}

}

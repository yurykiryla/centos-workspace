package by.tranning.book;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String[] test = new String[5];
		test[3] = "sdfsdf";

		List<String> strings = Arrays.asList(test);
		for (String s : strings) {
			System.out.println(s);
		}

	}
}

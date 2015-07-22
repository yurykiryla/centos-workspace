package by.tranning.book.chapter15;

public class MethodRefDemo2 {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inStr = "test line";
		String outStr;

		MyStringOps2 strOps = new MyStringOps2();
		
		outStr = stringOp(strOps::strReverse, inStr);
		
		System.out.println(inStr);
		System.out.println(outStr);

	}
}

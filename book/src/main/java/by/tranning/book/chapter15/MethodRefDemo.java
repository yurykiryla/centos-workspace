package by.tranning.book.chapter15;

public class MethodRefDemo {
	
	static String stringOp(StringFunc sf, String s){
		return sf.func(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inStr = "test line";
		String outStr;
		
		outStr = stringOp(MyStringOps::strReverse, inStr);
		System.out.println(inStr);
		System.out.println(outStr);

	}

}

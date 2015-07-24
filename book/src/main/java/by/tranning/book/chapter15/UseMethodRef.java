package by.tranning.book.chapter15;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {

	static int compareMC(MyClass a, MyClass b){
		return a.getVal() - b.getVal();
	}
	
	public static void main(String[] args) {
		ArrayList<MyClass> a1 = new ArrayList<>();
		
		a1.add(new MyClass(1));
		a1.add(new MyClass(4));
		a1.add(new MyClass(2));
		a1.add(new MyClass(9));
		a1.add(new MyClass(3));
		a1.add(new MyClass(7));
		
		MyClass maxValObj = Collections.max(a1, UseMethodRef::compareMC);
		
		System.out.println("Max is: " + maxValObj.getVal());
	}

}

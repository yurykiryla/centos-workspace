package by.tranning.book.chapter12;

public class TypeAnnoDemo<@What(description = "Data of generic type") T> {

	public @Unique TypeAnnoDemo() {

	}

	@TypeAnno
	String str;

	@EmptyOK
	String test;

	public int f(@TypeAnno TypeAnnoDemo<T>this,int x) {
		return 10;
	}

	public @TypeAnno Integer f2(int j, int k) {
		return j + k;
	}

	public @Recommended Integer f3(String str) {
		return str.length();
	}

	public void f4() throws @TypeAnno NullPointerException {

	}

	String @MaxLen(10) [] @NotZeroLen [] w;

	@TypeAnno
	Integer[] vec;

	public static void myMeth(int i) {
		TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<>();

		@Unique
		TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<>();

		Object x = new Integer(i);

		Integer y;

		y = (@TypeAnno Integer) x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth(10);
	}

	class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {
	}

}

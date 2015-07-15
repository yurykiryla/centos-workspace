package by.tranning.book.chapter7;

public class VarArgTst {

	private static void mtd1(int ... elements)
	{
		for (int i : elements)
		{
			System.out.println(i);
		}
	}
	
	private static void mtd1(int el)
	{
		System.out.println(el + "  dfvf ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mtd1(1);
	}

}

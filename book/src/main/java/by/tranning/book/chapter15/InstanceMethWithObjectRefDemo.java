package by.tranning.book.chapter15;

public class InstanceMethWithObjectRefDemo {

	static <T> int counter(T[] vals, MyFunc1<T> f, T v) {
		int count = 0;

		for (T t : vals) {
			if (f.func(t, v)) {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {
		int count;

		HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82),
				new HighTemp(90), new HighTemp(89), new HighTemp(89),
				new HighTemp(91), new HighTemp(84), new HighTemp(83) };
		
		count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
		
		System.out.println("Days with temperature 89: " + count);
		
		HighTemp[] weekDayHighs2 = { new HighTemp(32), new HighTemp(12),
				new HighTemp(24), new HighTemp(19), new HighTemp(18),
				new HighTemp(12), new HighTemp(-1), new HighTemp(13) };
		
		count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));

		System.out.println("Days with temperature 12: " + count);
		
		
	}

}

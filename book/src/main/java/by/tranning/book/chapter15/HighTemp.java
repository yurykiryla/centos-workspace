package by.tranning.book.chapter15;

public class HighTemp {

	private int hTemp;

	public HighTemp(int temp) {
		super();
		this.hTemp = temp;
	}

	boolean sameTemp(HighTemp ht2) {
		return hTemp == ht2.hTemp;
	}

	boolean lessThanTemp(HighTemp ht2) {
		return hTemp < ht2.hTemp;
	}
}

package by.tranning.book.chapter9.part1;

import javax.swing.DefaultBoundedRangeModel;

public interface MyIF {

	int getNumber();
	
	default String getString(){
		return "Default implemantation";
	}
}

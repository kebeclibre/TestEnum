package model.comparators;

import java.util.Comparator;

import model.Police;

public class GradeComparator implements Comparator<Police>{

	@Override
	public int compare(Police o1, Police o2) {
		if (o2.getRank().compareTo(o1.getRank()) == 0 ){
			return o1.compareTo(o2);
		}
		return o2.getRank().compareTo(o1.getRank());
	}
	
	

}

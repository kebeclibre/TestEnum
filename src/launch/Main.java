package launch;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import model.Police;
import model.comparators.GradeComparator;
import model.enumPerso.Rank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Police> celebs = new TreeSet<Police>(new GradeComparator());
		
		Police biales = new Police("Maurice", "Biales", Rank.COMM);
		Police donJohnson = new Police ("Don", "Johnson", Rank.INSPEC);
		Police kurtWallander = new Police ("Kurt", "Wallander", Rank.COMM_DIV);
		
		celebs.add(biales);
		celebs.add(donJohnson);
		celebs.add(kurtWallander);
		

		
		System.out.println(celebs.toString());
		

	}

}

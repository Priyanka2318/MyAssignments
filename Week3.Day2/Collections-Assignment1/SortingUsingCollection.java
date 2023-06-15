package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] company = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> sortcom = new ArrayList<String> ();
		for(String s: company) {
			sortcom.add(s);
		}
		Collections.sort(sortcom);
		//System.out.println(sortcom);
		Collections.reverse(sortcom);
		System.out.println(sortcom);

	}
}

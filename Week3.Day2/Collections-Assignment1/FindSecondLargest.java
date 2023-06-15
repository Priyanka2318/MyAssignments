package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};

		Set<Integer> arrayset = new TreeSet<Integer>();
		for (Integer num: data) 
		{
			arrayset.add(num);
		}
		//System.out.println(arrayset);

		List<Integer> output = new ArrayList<Integer>(arrayset);
		for(int i=output.size()-2;i>0;i--) {
			System.out.println(output.get(i));
			break;
		}


	}
}


package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] a = {1,3,8,10,9,2,4,3,2,5,8,6};
		Set<Integer> arrayset = new TreeSet<Integer>();
		for(Integer number: a) 
		{
			arrayset.add(number);
		}
		List<Integer> output = new ArrayList<Integer>(arrayset);
		for(int i=0;i<output.size();i++) {
			if(output.get(i)!=i+1) {
				System.out.println(i+1);
				break;
			}
		}

	}

}

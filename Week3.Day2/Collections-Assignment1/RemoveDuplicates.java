package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "PayPal India";
		String case1 = text.toLowerCase();
		char[] charArray = case1.toCharArray();
	    
		Set<Character> charSet = new TreeSet<Character>();
		
		for(Character c:charArray) {
			charSet.add(c);
		}
		
		System.out.println(charSet);

	}


}



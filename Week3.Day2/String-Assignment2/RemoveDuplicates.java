package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "PayPal India";
		char[] charArray = text.toCharArray();
		
		Set<Character> charSet = new TreeSet<Character>();
		Set<Character> dupCharSet = new TreeSet<Character>();
		
		for(Character c:charArray) {
			charSet.add(c);
		}

	}

}

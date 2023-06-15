package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "Priyanka";
		char[] charArray = name.toCharArray();
		
		Set<Character> unique = new HashSet<Character> ();
		for(Character sname:charArray) {
			unique.add(sname);
		}
		System.out.println(unique);
		

	}

}

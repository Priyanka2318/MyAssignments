package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		String rev = "";
		int length = s.length();
		for(int i=length-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}

		if(s.equalsIgnoreCase(rev)) {
			System.out.println("The given string is a Palindrome");
		}else {
			System.out.println("The given string is not a Palindrome");
		}

	}
}

import java.util.*;

public class Palindrome {
	
	static void isPalindrome(String word) {
		String reverse = ""; 
		for(int i = word.length()-1;0<i+1;i--) {
			reverse += word.charAt(i);
		}
		System.out.println(word + " " + reverse);
		if(reverse.equals(word)) {
			System.out.println(word + " is Palindrome");
		}else {
			System.out.println(word + " is not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word = input.nextLine();
		isPalindrome(word);
	}

}

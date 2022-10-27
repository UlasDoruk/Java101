import java.util.Scanner;
import java.util.Arrays;

public class Capitalize {
	
		public static String FirstLetter(String str) {
			String [] newStr = new String[str.length()];
			newStr = str.split(" ");
			String space = " "; 
			String newLetter = "";
			for(int i = 0 ;i<newStr.length;i++) {
				 	newLetter += newStr[i].substring(0,1).toUpperCase()+ newStr[i].substring(1)+" ";
				}
		 return	newLetter;
		}
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter your sentences : ");
			String str = input.nextLine();
			System.out.println(FirstLetter(str));
	}
	
	}
	
	


import java.util.*;

public class RecursiveFibonacci {

	static int pow(int x,int y) {
		int result = 1 ; 
		if(y == 1) {
			return x;
		}else if(y ==0 ) {
			return 1 ;
		}
		result =x * pow(x,y-1);
		return result;
		
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number : ");
		int number = input.nextInt();
		System.out.println("Please enther the second number : ");
		int number2 = input.nextInt();
		System.out.println(pow(number,number2));
	}
}

import java.util.*;

public class Calculator{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1,number2,number3;
		System.out.println("Give the first number : ");
		number1 = input.nextInt();
		System.out.println("1 + \n2 -\n3 /\n4 *\n");
		number3 = input.nextInt();
		System.out.println("Give the second number : ");
		number2 = input.nextInt();
		switch(number3) {
		case 1:
			int sum = number1 + number2 ;
			System.out.println("Sum = " + sum);
			break;
		case 2 : 
			int subtraction = number1 - number2 ; 
			System.out.println("Subtraction : " + subtraction);
			break ;
		case 3 : 
			int divide  = number1/number2;
			System.out.println("Division : " + divide);
			break;
		case 4 :
			int multi = number1 * number2 ;
			System.out.println("Multiplication : " + multi);
			break ;
		default : System.out.println("Invalid Number !"); break;
		
		}
		
	}
}

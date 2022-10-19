import java.util.*;

public class MinMax {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Number of numbers -> ");
		int min = 1 , max = 1;
		int number1 = input.nextInt();
		for (int i = 1 ;i<number1+1;i++) {
			System.out.println("Enter the " + i + ". number -> ");
			int number2 = input.nextInt();
			if(i == 1 ) {
				max = number2;
				min = number2;
			}
			else if(number2 > max) {
				max = number2;
			}else if(number2 < min) {
				min = number2;
			}
		}
		System.out.println("Max number is -> " + max);
		System.out.println("Min number is -> " + min);
	}
}

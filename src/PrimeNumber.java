import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		boolean flag = false;
		for (int i = 2 ; i<number;i++) {
			if(number % i == 0 ) {
				flag = true;
			}
		}
		if(flag == true) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime -> " + number);
		}
	}
}

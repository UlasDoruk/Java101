import java.util.Arrays;
import java.util.*;

public class PredicToNumber {

	public static void main(String[] args) {
		System.out.println("You have 5 guess rights");
		int number = (int) (Math.random()*100);
		Scanner input = new Scanner(System.in);
		
		for (int i = 1;i<6;i++) {
			System.out.println(i +".change " +"Enter your guess : ");
			int guess = input.nextInt();
			if( guess <=0) {
				System.out.println("Invalid number");
				break;
			}else if(guess == number) {
				System.out.println("You win the game ");
				System.out.println("The number -> " + number );
			}else if(i<5 && guess > number) {
				System.out.println("Your guess is higher than the number");
			}else if(i < 5 && guess < number) {
				System.out.println("Your guess is lower than the number");
			}
			else if(i==5) {
				System.out.println("LOSE" + " Number is -> " + number);
			}
		}
	}

}

import java.util.Arrays;
import java.util.*;

public class PredicToNumber {

	public static void main(String[] args) {
		System.out.println("You have 5 guess rights");
		int number = (int) (Math.random()*100);
		Scanner input = new Scanner(System.in);
		int [] guessArr = new int[5];
		
		for (int i = 0;i<5;i++) {
			System.out.println(i+1 +".change " +"Enter your guess : ");
			int guess = input.nextInt();
			if( guess <=0 || guess >100) {
				System.out.println("Invalid number");
				break;
			}else if(guess == number) {
				System.out.println("You win the game ");
				System.out.println("The number -> " + number );
				guessArr[i] = guess;
			}else if(i < 4 && guess > number) {
				System.out.println("Your guess is higher than the number");
				guessArr[i] = guess;
			}else if(i < 4 && guess < number) {
				System.out.println("Your guess is lower than the number");
				guessArr[i] = guess;
			}
			else if(i==4) {
				guessArr[i] = guess;
				System.out.println("LOSE" + " Number is -> " + number);
				System.out.println("Your guesses -> " + Arrays.toString(guessArr));
			}
		}
	}

}

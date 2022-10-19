import java.util.*;

public class RecursivePower {

	static int pow(int x, int y) {
		int power = 1;
		if(y == 1) {
			return x;
		}else if(y == 0) {
			return 1;
		}
		power =x * pow(x,y-1);
		return power;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int number2 = input.nextInt();
		System.out.println(pow(number,number2));

	}

}

import java.util.*;

public class ForLoopStars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String repeated = new String(new char[(number*2)]).replace("\0", "-");
		for(int i = 0;i<number;i++) {
			System.out.println("");
			for(int x = 0;x<i+1;x++) {
				System.out.print("*");
			}
		}System.out.println("\n" + repeated );
		for(int i = 0;i<number;i++) {
			if(i == 0 ) {
			}else {
				System.out.println(" ");
			}
			for(int x = i;x<number;x++) {
				System.out.print("*");
			}
	}

}}

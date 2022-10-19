import java.util.*;

public class KdvOranı {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double kdv,amount,total;
		System.out.println("Please Enter The Money Amount : ");
		amount = input.nextDouble();
		kdv = 0.18;
		total = amount + (kdv * amount);
		System.out.println("Total Payment : " + total);
	}

}

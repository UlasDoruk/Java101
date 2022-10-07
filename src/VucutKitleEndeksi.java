import java.util.Scanner;

public class VucutKitleEndeksi {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double height,weight,index;
		System.out.println("Please enter your weight : ");
		weight = input.nextDouble();
		System.out.println("Please enter your height : ");
		height = input.nextDouble();
		index = weight / (height *height);
		System.out.println("Your index is : " + index);
		
	}
}

import java.util.Arrays;

public class MinMaxForArrays {
	
	static void MinMax(int [] arr) {
		int min=arr[0],max=0;
		for(int i = 0 ;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("\n" + "Max -> " + max + " Min -> " + min);
		}

	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() *10);
		System.out.println("Range of Array -> " + randomNumber + "\n");
		int [] list = new int[randomNumber];
		for(int i = 0;i<list.length;i++) {
			list[i] = (int) (Math.random()*100);
		}
		System.out.println(Arrays.toString(list));

		MinMax(list);
		
	}
}

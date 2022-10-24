import java.util.Arrays;

public class Repeating {
	
	static void isRepeating (int [] arr) {
		int repeatingNumbers = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j] && arr[j] %2 ==0 && arr[j] != 0 && arr[j] != repeatingNumbers ) {
					repeatingNumbers = arr[j];
					System.out.println("Repeating Even Number -> " + repeatingNumbers);
				}
			}
		}
	}

	public static void main(String[] args) {
//		int [] arr = {3,2,2,2,4,4,78,78,12,2,78,12,4};
		int [] arr = new int[10];
		for(int i =0;i<arr.length;i++) {
			arr[i] = (int) (Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		isRepeating(arr);
	}

}

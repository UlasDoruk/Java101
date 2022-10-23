import java.util.Arrays;

public class MainForArrays {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,89,7,8,55};
		ArrayClass.copyToArray(arr, 2, 7);
		int [] arr_1 =  Arrays.copyOfRange(arr, 2,7);
		System.out.println(Arrays.toString(arr_1));
	}
}

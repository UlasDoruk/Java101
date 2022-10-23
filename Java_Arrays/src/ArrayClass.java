import java.util.Arrays;

public class ArrayClass {
	
	static void copyToArray(int [] arr,int x,int y) {
		int [] newArr = new int[y-x];
		for(int i = 0;x<y;i++,x++) {
			newArr[i] = arr[x];
//			System.out.println(newArr[i]);
		}
		System.out.println(Arrays.toString(newArr));
	}

}


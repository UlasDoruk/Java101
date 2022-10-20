
public class Arrays {
	
	static void addToArr(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			arr[i] = i*10;
			System.out.println(arr[i]);
		}
	}
	
	static void reverse(int[] arr) {
		for(int i = arr.length-1;i>=0;i--) {
			arr[i] = i*10;
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
//		addToArr(arr);
		reverse(arr);
		System.out.println("---");
		addToArr(arr);
	}

}


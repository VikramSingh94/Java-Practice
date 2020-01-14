
public class ArrayMin {

	public static void main(String[] args) {
		int[] arr=new int[] {2,4,6,1,8};
		int min = arr[0];
		
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] < min ) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
	}
}

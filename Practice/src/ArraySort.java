/**
 * Array Selection Sort 
 * One Array item is taken and compared to all of the array elements
 */
public class ArraySort {

	public static void main(String[] args) {
		int arr[]=new int[] {9,3,5,2,7,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
			}
		}
		System.out.print("{");
		for(int i=0;i<arr.length;i++) {

		System.out.print(arr[i]+",");
		}
		System.out.print("}");
	}
}

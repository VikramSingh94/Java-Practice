/*
 * 0 1 1 2 3 5 8 13 21 34
 * It starts with 0 and 1, and after that two
 * number's sum creates the next number
*/
public class Fibonacci {
	
	static void fibo(int num) {
		int m =0;
		int n = 1;
		int o = 0;
		System.out.println(m);
		System.out.println(n);
		for (int i = 2; i < num; i++) {
			o = m+n;
			m = n;
			n = o;
			System.out.println(o);
		}
		//System.out.println(o);
	}

	public static void main(String[] args) {
		int num =16;
		int arr[] = new int[num];
		arr[0]=0;
		arr[1]=1;
		for (int i = 2; i < num; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for (int i = 0; i < 15; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("with m and n");
		fibo(16);
	}
}

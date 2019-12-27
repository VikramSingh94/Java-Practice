//find highest num among 3 num.
import java.util.Scanner;

public class HighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("A");
			} else {
				System.out.println("C");
			}
		}else if(c>b) {
			System.out.println("C");
		}else {
			System.out.println("B");
		}
	}

}

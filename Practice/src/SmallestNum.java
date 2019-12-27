//find Smallest num among 3 num.

import java.util.Scanner;

public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				if(a>b) {
					if(b<c) {
						System.out.println("B");
					} else {
						System.out.println("C");
					}
				}else if(c<a) {
					System.out.println("C");
				}else {
					System.out.println("A");
				}
	}

}

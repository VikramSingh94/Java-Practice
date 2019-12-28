import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		/*initialize sum  and local variable
		 * while loop,till user press yes
		 * get value from user
		 * add that value to sum and assign to sum
		 * Ask user if he wants to proceed
		 * take user input
		 * end while loop
		 * print sum
		 * average
		 */
		float sum=0;
		int count=0;
		String str="y";
		Scanner sc =new Scanner(System.in);
		while(str.equalsIgnoreCase("y")) {
			count++;
			System.out.print("Please enter value : ");
			sum=sum+sc.nextFloat();
			System.out.println("press yes to continous and no to terminate : ");
			str=sc.next();
		}
		System.out.println("Sum is :" +sum);
		System.out.println("Average is :"+sum/count);
	}
}

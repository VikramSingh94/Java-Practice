// display the user entered values till user presses yes
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerValue {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		String str = "Yes";
		Scanner sc = new Scanner(System.in);
		while (str.equalsIgnoreCase("yes")) {
			list.add(sc.nextInt());
			System.out.println("Press Yes to continue and No to terminate: ");
			str = sc.next();
		}
		System.out.println(list);
	}
}
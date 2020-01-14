
public class Factorial {
	static int fact(int num) {

		if (num == 0 || num == 1) {
			return 1;
		}
		int fact = num;
		for (int i = num - 1; i > 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	static int factRecursion(int num) {

		if (num == 0 || num == 1) {
			return 1;
		}
		int fact = num;
		return fact*factRecursion(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factRecursion(4));
	}
}

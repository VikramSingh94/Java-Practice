// Print different types of inputs
import java.util.Scanner;

public class AllInputDataTypes {

	public static void main(String[] args) {
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		String w;
		String sen;
		Scanner sc=new Scanner(System.in);
		b = sc.nextByte();
		s = sc.nextShort();
		i = sc.nextInt();
		l = sc.nextLong();
		f = sc.nextFloat();
		d = sc.nextDouble();
		
		//This is for taking single word input.
		w = sc.next();
		
		//This is to take input full sentence until new line is there.
		sen = sc.nextLine();
		
		// Type Casting (When you want to assign higher datatype to lower datatype you neeedto cast the higher data type)
		// byte b = (byte) sc.nextInt();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(w);
		System.out.println(sen);
	}

}

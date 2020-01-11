
class A {
	
	int a;
	static int s;
	//final int f;
	
	static {
		
	}

	A(int a) {
		this();
		this.a = a;
		//f = 11;
		//System.out.println("a");
	}

	A() {
		//f =12;
		System.out.println("b");
		

	}

	public void m() {
		m();
		System.out.println("m");

	}

	public void n() {
		System.out.println("n");
		System.out.println(s);
	}
	
	public static void o() {
		System.out.println("o");
		
	}
}

public class ThisKey {
	public static void main(String[] args) {
		
		A a1 = new A(10);
		a1.m();
	}
}

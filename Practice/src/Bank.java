interface Interest{
	float rateOfIntrerest();
}

public class Bank implements Interest {
	public float rateOfIntrerest() {
		System.out.println("hello:");
		return 9.15f;
	}
	}
class Rbi{
public static void main(String[]args) {
	Interest in=new Bank();
	in.rateOfIntrerest();
}}

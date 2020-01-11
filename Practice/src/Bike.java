
public class Bike {
	int id;
	String name;
	Bike(int i,String s){
	id=i;
	name=s;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Bike b=new Bike(10,"Mohan");
		b.display();
	}
}

 abstract class  AbstractDemo {
	abstract void run();
		}
		
 	class Honda extends AbstractDemo{
	 void run() {
		 System.out.println("method call");
		  }
	 public static void main(String[] args) {
		AbstractDemo ad=new Honda();
		ad.run();
	}
 }


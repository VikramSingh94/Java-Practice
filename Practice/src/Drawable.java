
public interface Drawable {
	void draw();
	static int cube(int x) {return x*x*x; }
}

class Draw implements Drawable{
	
	public void draw() {
		
	}
	public static void main(String[] args) {
		Drawable d = new Draw();
	}
}
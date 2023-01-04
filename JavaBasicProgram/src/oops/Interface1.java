package oops;


interface Drawable {
	int salary=25000;//by default---> public static final int salary=25000;
	void draw();//by default---->public abstract void draw();
}

class Rectangle1 implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle implements Drawable {
	public void draw() {
		System.out.println("drawing circle");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		
		System.out.println("Interface variable salary: "+Drawable.salary);
		Rectangle1 r1=new Rectangle1();
		r1.draw();//drawing rectangle
		Circle c1=new Circle();
		c1.draw();//drawing circle
		// In real scenario, object is provided by method e.g. getDrawable()
		Drawable d = new Circle();
		d.draw();//drawing circle
	}

}

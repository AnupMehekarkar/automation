package oops;

class Parent {
	void show() {
		System.out.println("Parent's show()");
	}
}
// Inherited class or child class or sub class
class Child extends Parent {
	// This method overrides show() of Parent
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}
public class Overriding5 {

	public static void main(String[] args) {
		
		Parent obj1 = new Parent();
		obj1.show();//Parent's show()
		Parent obj2 = new Child();
		obj2.show();//Child's show()

	}

}

package oops;

class Parent101{
	// Function
	void show() {
		// Print message for this class
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child101 extends Parent101 {
	void readme() {
		System.out.println("Child readme method is called");
	}
}
public class Upcastingderived1 {

	public static void main(String[] args) {
		
		System.out.println("****************Ref and Object both of child*********************");
		//Object of Child class and reference of child class
		Child101 c1=new Child101();
		c1.readme();
		c1.callme();
		c1.show();
		
		Parent101 p1=new Parent101();
		p1.show();
		p1.callme();	
		
		Parent101 obj = new Child101();//auto-up/implicit up casting
		obj.show();
		obj.callme();
		
	
		Child101 c2=new Child101();
		c2.readme();
		c2.callme();
		c2.show();
		System.out.println("****************Ref parent and Object of child*********************");
		Parent101 p2=(Parent101)c2;//explicit up casting
				//or
		//Parent101 p2=c2;//implicit up casting
				//or
		//Parent101 p2=(Parent)new Child();//explicit up casting
		p2.show();
		p2.callme();
		//p2.readme();
	}

}

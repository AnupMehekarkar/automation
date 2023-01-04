package oops;

class fruit {
	fruit(){
		System.out.println("fruit class cons..");
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
class apple extends fruit {
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("Apple class Cons..");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		apple a1=new apple();// obj of child class
		a1.shape();// call method of parent class
		a1.taste();// call method of child class
		
	}

}

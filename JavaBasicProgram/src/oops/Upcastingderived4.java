package oops;

class AB {
	void test1() {
		System.out.println("Running test1()");
	}
}
class BC extends AB {
	void test2() {
		System.out.println("Running test2()");
	}
}
class CD extends BC {
	void test3() {
		System.out.println("Running test3()");
	}
}
public class Upcastingderived4 {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		CD c1 = new CD();
		BC b1 =(BC)c1;//(B) new C();explicit up-casting
		b1.test1();
		b1.test2();
		//b1.test3();
		System.out.println("Program ends");
	}

}

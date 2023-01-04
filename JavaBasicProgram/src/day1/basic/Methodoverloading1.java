package day1.basic;

public class Methodoverloading1 {
	
	static double res;
	static public void square() {
		System.out.println("Method with no argument");
	}
	static public void square(int number) {
		res= number * number;
		System.out.println("Method with int argument: "+res);	
	}
	static public void square(double number) {
		res=number * number;
		System.out.println("Method with double argument: "+res);	
	}
	
	public static void main(String[] args) {
		
		Methodoverloading1.square(5);
		Methodoverloading1.square(5f);
		Methodoverloading1.square();
		

	}

}

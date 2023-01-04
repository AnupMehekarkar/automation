package day1.basic;

public class Methodoverloading2 {
    
	public static void square() {
		System.out.println("Method with no parameters");	
	}
	public static void add(int number) {
		int add=number+number;
		System.out.println("Method with int argument: "+add);
	}
	public static void square(float number) {
		float square=number*number;
		System.out.println("Method with float argument: "+square);	
	}
	public static void main(String[] args) {
		
		Methodoverloading2 n1=new Methodoverloading2();
				n1.square(9);
				n1.add(5);
				n1.square(5f);
				
	}

}

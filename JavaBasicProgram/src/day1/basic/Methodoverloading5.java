package day1.basic;

public class Methodoverloading5 {

	public static double add(int num1,int num2) {
		int res=num1+num2;
		return (num1+num2);
	}
	
	public static int sub(int num1,int num2) {
		int res=num1-num2;
		return (num1-num2);
	}
	public static void main(String[] args) {
		System.out.println("Addition: "+add(20,100));

		System.out.println("Substraction: "+sub(200,100));

	}

}

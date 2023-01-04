package day1.basic;

public class Method5 {
	float a=15.56f;
	public int add(int num1,int num2) {
		return (num1+num2);
	}
		
	public static void main(String[] args) {
		
			System.out.println("Program Starts");
			Method5 m1=new Method5();
			System.out.println("NSGV a: "+m1.a);
			System.out.println(m1.add(25, 30));
			System.out.println("Program Ends");
		}

}


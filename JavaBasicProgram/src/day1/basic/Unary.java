package day1.basic;

public class Unary {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int K= ++a;
		System.out.println("k= "+K);
		System.out.println("a= "+a);
		
		int r = 21;
		System.out.println("r=: " + r++);//
		System.out.println("r=: " + r);//
		System.out.println("r=: " + ++r);//
		System.out.println("r=: " + r);//

		int x = 105;
		System.out.println("x=: " + --x);// 
		System.out.println("x=: " + x);// 
		System.out.println("x=: " + x--);// 
		System.out.println("x=: " + x);// 
	}

}

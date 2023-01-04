package day1.basic;

public class Unaryoperator {

	public static void main(String[] args) {
	
        int a = 10;
		int b = a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int k = ++a;
		System.out.println("k: " + k);//
		System.out.println("a: " + a);//
		
		int j = k++;//
		System.out.println("k: " + k);//
		System.out.println("j: " + j);//

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

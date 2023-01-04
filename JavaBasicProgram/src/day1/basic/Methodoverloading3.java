package day1.basic;

public class Methodoverloading3 {

	static int add(int a,int b) {
		return  a+b;	
	}
	 static int add(int a, int b,int c) {
		 return a+b+c;	 
	 }
	public static void main(String[] args) {
		
		System.out.println(Methodoverloading3.add(8,8));

		System.out.println(Methodoverloading3.add(10,25,30));
		
	}

}

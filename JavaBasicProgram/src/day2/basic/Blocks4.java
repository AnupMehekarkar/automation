package day2.basic;

public class Blocks4 {

	
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}	
	public static void main(String[] args) {
		
		System.out.println("main() Starts");
		Blocks4 b1=new Blocks4();
		System.out.println("---------------------------------");
		Blocks4 b2=new Blocks4();
		System.out.println("main() ends");

	}

	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}
}

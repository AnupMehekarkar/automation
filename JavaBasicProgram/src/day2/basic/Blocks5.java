package day2.basic;

public class Blocks5 {
	
	static {
		System.out.println("running static-block-1 of class Blocks5..");
	}
	{
		System.out.println("running non-static-block-1 of class Blocks5..");
	}

	public static void main(String[] args) {
	
		System.out.println("main() Starts");
		Blocks5 b1 = new Blocks5();
		System.out.println("---------------------------------");
		Blocks5 b2 = new Blocks5();
		System.out.println("main() ends");

	}

}

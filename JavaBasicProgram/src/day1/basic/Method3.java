package day1.basic;

public class Method3 {

	static double x,y,z;
	public static void main(String[] args) {
	
		System.out.println("first num x = "+x);
		System.out.println("second num y = "+y);
		System.out.println("third num z = "+z);
		
		System.out.println("Average of three number= "+average(10d,20d,30d));
	}

	public static double average(double x,double y,double z)
	{
		return (x+y+z)/3;
	}
}

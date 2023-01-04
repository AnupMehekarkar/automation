package day1.basic;

public class average {

	static double x,y,z;
	public static void main(String[] args) {
		System.out.println("print value for first number: "+x);
		System.out.println("print value for first number: "+y);
		System.out.println("print value for first number: "+z);
		x=10;
		y=20;
		z=30;
		System.out.println("Average value is:"+average(x,y,z));
		System.out.println("The average value is " + average(10,20,30));
		System.out.println("The average value is " + average(54.5,67.5,33));
		System.out.println("The average value is " + average(34.25f,54,76));
		System.out.println("The average value is " + average(123,43l,234));

	}

	public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}


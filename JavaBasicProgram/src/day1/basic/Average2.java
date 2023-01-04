package day1.basic;

public class Average2 {

	static double x=15,y=20,z=50;
	public static void main(String[] args) {
		
		System.out.println("Input first number:" +x);
		System.out.println("Input first number:" +y);
		System.out.println("Input first number:" +z);
        average(x,y,z);
	}

	public static void average(double x,double y,double z) {
		
		double res=(x+y+z)/3;
		System.out.println("average value is:"+res);
	}
}

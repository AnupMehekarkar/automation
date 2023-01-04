package day1.basic;

public class Method4 {

	static double x=10,y=20,z=30;
	public static void main(String[] args) {

        System.out.println("Input the first number: "+x);       
        System.out.println("Input the second number: "+y);      
        System.out.println("Input the third number: "+z);        
        average(x,y,z);
    }

  public static void average(double x, double y, double z)
    {
		double res=(x + y + z) / 3;
        System.out.println("The average value is " + res);
    }

}

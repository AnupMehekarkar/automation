package oops;

public class Array3 {

	public static void main(String[] args) {
		int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
		double sum = 0;
		double average;
		
		
		
		for (int number : numbers) {
			sum = sum + number;//0+2=2+-9=-7+0=-7+5=-2+12=10+-25=-15+22=7+9=16+8=24+12=36
					
			int arrayLength = numbers.length;
			average = sum / arrayLength;
			System.out.println("Sum = " + sum);
			System.out.println("Average = " + average);
		}
	}

}

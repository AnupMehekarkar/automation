package oops;

public class Array0 {

	public static void main(String[] args) {
		
		String[] cars=new String[4];
		cars[0]="Volvo";
		cars[1]="BMW";
		cars[2]="Ford";
     	cars[3]="Mazda";
		
		System.out.println(cars[0]);
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
			
		}
			
			
			for (String i : cars) {
				  System.out.println(i);
				}
		}

}

package day2.basic;

public class Ifelse7 {

	public static void main(String[] args) {
		int number=55;  
		//Check if the number is divisible by 2 or not  
		if(number%2==0){  
			System.out.println("even number");  
		}else{  
			System.out.println("odd number");  
		}  
		
		checkEvenOddNumber(150);
	}
	static void checkEvenOddNumber(int num) {//int num=700;
		if(num%2==0){  
			System.out.println("Given number is even number: "+num);  
		}else{  
			System.out.println("Given number is odd number: "+num);  
		}		

}}	
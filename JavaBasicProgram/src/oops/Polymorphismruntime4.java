package oops;


class Bank100 {
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank100 {
	float getRateOfInterest() {
		return 8.4f;
	}
}
class ICICI extends Bank100 {
	float getRateOfInterest() {
		return 7.3f;
	}
}
class AXIS extends Bank100 {
	float getRateOfInterest() {
		return 9.7f;
	}
}
public class Polymorphismruntime4 {

	public static void main(String[] args) {
		
		Bank100  b = new SBI();//upcasting
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());//
		b = new ICICI();//up casting
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());//
		b = new AXIS();//up casting
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());//
	}

}

package day2.basic;

public class Finalkeyword2 {
	
	final int speedlimit;// blank final variable
	Finalkeyword2() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}

	public static void main(String[] args) {
		Finalkeyword2 f1= new Finalkeyword2();
		System.out.println(f1.speedlimit);
		
	}

}

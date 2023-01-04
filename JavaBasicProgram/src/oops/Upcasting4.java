package oops;


class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class Upcasting4 extends Mumbai {

	void myCity() {
		System.out.println("You in city");
	}
	public static void main(String[] args) {
		
		Upcasting4 u1=new Upcasting4();
		Mumbai m1=new Upcasting4();//auto upcasting or implicit upcasting
		Mumbai m2=u1;//auto upcasting or implicit upcasting
		Pune p1=new Upcasting4();//auto upcasting or implicit upcasting
		Pune p2=u1;//auto upcasting or implicit upcasting
		

		Mumbai m3=(Mumbai)new Upcasting4();//explicit upcasting
		Mumbai m4=(Mumbai)u1;//explicit upcasting
		Pune p3=(Pune) new Upcasting4();//explicit upcasting
		Pune p4=(Pune)u1;//explicit upcasting
	}

}

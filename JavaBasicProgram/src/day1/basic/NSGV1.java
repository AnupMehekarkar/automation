package day1.basic;

public class NSGV1 {

	int empid=1001;
	double salary;
	public static void main(String[] args) {
		
		//local variable
		int age=15;
		System.out.println("local variable age: "+age);
		NSGV1 n1=new NSGV1();
		System.out.println("NSGV empid: "+n1.empid);
		System.out.println("NSGV salary: "+n1.salary);
		//updated NSGV
		n1.empid= 1002;
		n1.salary= 5000;
		System.out.println("Updated NSGV empid: "+n1.empid);
		System.out.println("Updated NSGV salary: "+n1.salary);

	}

}

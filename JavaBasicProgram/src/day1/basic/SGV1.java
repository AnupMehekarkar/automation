

package day1.basic;

public class SGV1 {

	 static int empID=1001;
	 static double salary;
	public static void main(String[] args) {
	
		System.out.println("Program Starts");
		int age=14;
		System.out.println("local variable age:"+ age);
		//System.out.println("SGV empId:"+empId);
		System.out.println("SGV salary:"+salary);
		//SGV access with standard
		System.out.println("SGV empID: "+SGV1.empID);
		System.out.println("SGV salary: "+SGV1.salary);
		System.out.println("Program ends");
		// SGV updated
		empID=1002;
		salary=5000;
		System.out.println("updated SGV empID:"+ empID);
		System.out.println("updated SGV salary:"+ salary);
		
	}

}


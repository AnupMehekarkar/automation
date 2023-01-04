package predefinedpackage;

public class StringImmutable {

	public static void main(String[] args) {
		
		final String name;
		final double salary;
		ImmutableClass(String name,double salary){
			this.name=name;
			this.salary=salary;
		}
		public String getName() {
			return name;
		}
		public double getSalary() {
			return salary;
		}
		ImmutableClass obj=new ImmutableClass("Pune",656535);
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
//		obj.name="nbjh";
//		obj.salary=356565;
		
		ImmutableClass obj2=new ImmutableClass("Mumbai",2454);
		System.out.println(obj2.getName());
		System.out.println(obj2.getSalary());
	}

}
**
* Immutable Class: its value can't be changed, if you change new object will be created
* 1. class and data variable should be declared as final
* 2. constructor should be parameterized, to initialize final data variable
* 3. use only getter method to get final variables value
*/
final class TestImmutableClass{
	final String name;
	final int salary;
	TestImmutableClass(String s1,int num1){
		name=s1;
		salary=num1;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}	
}
public class ImmutableClass {

	public static void main(String[] args) {
		TestImmutableClass t1=new TestImmutableClass("Nitin",25000);
		System.out.println(t1.getName());
		System.out.println(t1.getSalary());
		//change its data variable value create new object
		TestImmutableClass t2=new TestImmutableClass("Nitin2",250003);
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());
	}
}

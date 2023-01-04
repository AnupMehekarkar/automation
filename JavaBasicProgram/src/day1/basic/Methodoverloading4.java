package day1.basic;

public class Methodoverloading4 {

	void disp(int a, double b) {
		System.out.println("Method A");
	}

	void disp(int a, double b, double c) {
		System.out.println("Method B");
	}

	void disp(int a, float b) {
		System.out.println("Method C");
	}


		public static void main(String args[]) {
			Methodoverloading4 n1 = new Methodoverloading4();
			
			n1.disp(100, 20.67);
		}
	}


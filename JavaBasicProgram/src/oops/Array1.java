package oops;

public class Array1 {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50; 
		
		System.out.println(a[0]);  
    	System.out.println(a[1]);  
		System.out.println(a[2]);  
		System.out.println(a[3]);  
		System.out.println(a[4]);

		
		for(int i=0;i<a.length;i++)//length is the property of array  
		{
			System.out.println(a[i]);  
		}
		
		for(int num: a) {
			System.out.println(num);
			
		}
		
			char[] getArray =new char[4];
			getArray[0]='A';
			getArray[1]='B';
			getArray[2]='C';
			getArray[3]='D';
						//or
			char[] getArray2 ={ 'A','B','C','D' };
						//or
			char[] getArray3 =new char[] { 'A','B','C','D' };
						
			System.out.println("**************for-each loop----5*************");
		
			for(char num: getArray3) {
				System.out.println(num);
		}
		
	}

}



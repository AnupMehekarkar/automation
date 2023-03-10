package exceptionhandling;

public class Exceptionthrow1 {

	public static void validateAge(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
	public static void main(String[] args) {
		
		
		try {
    		validateAge(19);
    	}catch(ArithmeticException e) {
    		System.out.println("Exception handled...");
    		System.out.println(e);
    	}
        System.out.println("rest of the code...");
	}

}

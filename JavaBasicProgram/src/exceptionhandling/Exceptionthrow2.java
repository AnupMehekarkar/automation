package exceptionhandling;

public class Exceptionthrow2 {
	//function to check if person is eligible to vote or not   
    public static void signalTimeout(long time) throws InterruptedException  { 
    	System.out.println("Signal started");
        if(time>1000) {  
              Thread.sleep(time);
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
        System.out.println("Signal ends...");
    }  

	public static void main(String[] args) {
		
		//calling the function  
    	System.out.println("I am main....");
    	try {
			signalTimeout(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("rest of the code...");    
  }    

	}



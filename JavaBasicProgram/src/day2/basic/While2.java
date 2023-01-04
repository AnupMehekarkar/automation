package day2.basic;

public class While2 {

	public static void main(String[] args) {
		
		int i=4;
	    while(i>=0){
	    System.out.println("Happy new year");
	    i--;
	    }
	    
	    char c1= 'a';
	    while(c1<='z') {
	    	System.out.println(c1 +"");
	    	c1++;
	    	
	    }
	    
	    char c2='z';
	    while(c2 >='a') {
	    	System.out.println(c2 +"");
	    	c2--;
	    	}
	    
	    
	    int num=1;
	    while(num<=50) {
	    	if(num%2==0) {
	    		System.out.println("Even number" +num);
	    		
	    	}
	        num++;
	    }
	}
	}



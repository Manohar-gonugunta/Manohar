package exceptionhandling;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
		try {
			int a,b,c;
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the 1st number: ");
			a=s.nextInt();
			
			System.out.println("Enter the 2nd number: ");
			b=s.nextInt();
			
			c=a/b;
			System.out.println("Result after dividing: "+c);
			c=s.nextInt();
		}
		
      catch(UnsupportedOperationException e){  
    	  
    	  e.printStackTrace();
      }
	}

}

	

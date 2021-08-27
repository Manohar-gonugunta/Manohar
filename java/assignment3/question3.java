package stringassg;

public class question3 {

	public static void main(String[] args) {
		
		String s= new String("Java String refers to collection of String which is stored in heap memory.");
		String s1= new String("java String refers to collection of String which is stored in heap memory.");
		
		System.out.println(s.toLowerCase()); 
		
		System.out.println(s.toUpperCase());
		
		
		System.out.println(s.replace('a','$'));
		
		
		if( s.contains("collection")) {
			
			System.out.println("String contains the word collection");
			
		}
		else {
			
			System.out.println("String does not contain the given word ");
			
		}
		
		
		
		if(s.equals(s1)) {
			
			System.out.println("Strings s and s1 are equal ");
			
		}
		else {

			System.out.println("Strings s and s1 are not equal ");
			
		}
		
		
		
		if(s.equalsIgnoreCase(s1)) {
					
			System.out.println("Strings s and s1 are equal ");
					
		}
		else {

			System.out.println("Strings s and s1 are not equal ");
					
		}
		
		
		
		if(s.compareTo(s1)==1) {
							
			System.out.println("Strings s and s1 are equal ");
							
		}
		else {

			System.out.println("Strings s and s1 are not equal ");
							
		}
	

	}

}

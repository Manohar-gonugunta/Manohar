package stringassg;

public class question9builder {

	public static void main(String[] args) {
		
		StringBuilder x = new StringBuilder("This method returns the reversed object on which it was called");
		
		System.out.println("Original String:-" +x.toString());
		
		x.reverse();
		
		//StringBuilder revstr=str.reverse();
		//System.out.println("Reversed String:-" revstr.toString());
		
		System.out.println("Reversed String:-" +x.toString());
	}

}

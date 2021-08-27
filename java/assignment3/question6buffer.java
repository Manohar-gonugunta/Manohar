package stringassg;

public class question6buffer {

	public static void main(String[] args) {
		
		StringBuffer x = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println("Original String:-"+x);
		x.reverse();
		System.out.println("Reversed String:-"+x);

	}

}


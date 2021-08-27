package stringassg;

public class question8builder {

	public static void main(String[] args) {
		
		StringBuilder x = new StringBuilder("It is used to  at the specified index location");
		
		x.insert(14, "Insert text");
		
		System.out.println(x.toString());

	}

}
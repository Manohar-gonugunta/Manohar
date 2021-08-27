package javaoops;

class single
{
	public void show()
	{
		System.out.println("hello");
	}
}
class childsingleton extends single      
{
	public void show()
	{
		System.out.println("Amrutha");
	}
}
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childsingleton a =new childsingleton();
		a.show();

	}
	    }       


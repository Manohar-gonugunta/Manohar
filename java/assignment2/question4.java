package javaoops;

abstract class A      
{
	 abstract void show();
}

abstract class B extends A
{
     public void show()
	{
		System.out.println("hi");
	}
}
class C extends A
{
    void show() {              
	System.out.println("hello");
	}
}
public class question4 {

	public static void main(String[] args) {
		
           C obj=new C();
           obj.show();
	}
}

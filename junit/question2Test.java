import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question2test {

	@Test
	void test1() {
		JunitQuestion2 ob= new JunitQuestion2();
		int[] x= {5, 4, 87, 54 ,63 ,41 ,24 ,84 ,91};
		
		assertEquals(new Find(4, 91), ob.findMinMax(x));
	}
	
	@Test
	void test2() {
		JunitQuestion2 ob= new JunitQuestion2();
		int[] x= {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		
		assertEquals(new Find(5, 5), ob.findMinMax(x));
	}
	
	@Test
	void test3() {
		JunitQuestion2 ob= new JunitQuestion2();
		int[] x= {-5, -4, -87, -54, -63, -41, -24, -84, -91};
		
		assertEquals(new Find(-91, -4), ob.findMinMax(x));
	}

}

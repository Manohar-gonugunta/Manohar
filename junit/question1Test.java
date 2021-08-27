import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class Question1test {

	@Test
	void test1() {
		JunitQuestion1 a= new JunitQuestion1();
		int[] x= {56,87,98,100,101};
		int[] res= {56,101};
		assertArrayEquals(res, a.findMinMax(x));
	}
	
	@Test
	void test2() {
		JunitQuestion1 a= new JunitQuestion1();
		int[] x= {20,45,78,90,100};
		int[] res= {20,100};
		assertArrayEquals(res, a.findMinMax(x));
	}
	
	@Test
	void test3() {
		JunitQuestion1 a= new JunitQuestion1();
		int[] x= {2,-1,-91};
		int[] res= {-91,2};
		assertArrayEquals(res, a.findMinMax(x));
	}
}

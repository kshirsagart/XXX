package softassert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _assertequal {
	
	@Test
	public void a() {
		SoftAssert sa=new SoftAssert();
		System.out.println("method 1 start");
		int actual=20;
		int expected=20;
		sa.assertEquals(actual,expected);
		System.out.println("method 1 end");
		sa.assertAll();
		sa.fail();
		
	}
	
	
	@Test
	public void b() {
		SoftAssert sa1=new SoftAssert();
		System.out.println("method 2 start");
		String actual="tushar";
		String expected="tush";
		sa1.assertEquals(actual, expected);
		System.out.println("method 2 end");
		sa1.assertAll();
	}

}

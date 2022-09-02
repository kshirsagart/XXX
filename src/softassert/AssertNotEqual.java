package softassert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNotEqual {

	@Test
	public void a() {
		SoftAssert sa=new SoftAssert();
		System.out.println("method 1 start");
		int actual=20;
		int expected=20;
		sa.assertNotEquals(actual,expected);
		System.out.println("method 1 end");
		sa.assertAll();
		
	}
	
	
	@Test
	public void b() {
		SoftAssert sa=new SoftAssert();
		System.out.println("method 2 start");
		String actual="tushar";
		String expected="tush";
		sa.assertNotEquals(actual, expected);
		System.out.println("method 2 end");
		sa.assertAll();
	}
}

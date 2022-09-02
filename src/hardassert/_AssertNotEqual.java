package hardassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _AssertNotEqual {
	
	
	@Test
	public void a() {
		System.out.println("method 1 start");
		int actual=20;
		int expected=20;
		Assert.assertNotEquals(actual,expected);
		System.out.println("method 1 end");
		
	}
	
	
	@Test
	public void b() {
		System.out.println("method 2 start");
		String actual="tushar";
		String expected="tush";
		Assert.assertNotEquals(actual, expected);
		System.out.println("method 2 end");
	}

}

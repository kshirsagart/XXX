package hardassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _AssertNull {
	

	@Test
	public void a() {
		System.out.println("method 1 start");
		String a=null;
		Assert.assertNull(a);
		System.out.println("method 1 end");
		
	}
	
	
	@Test
	public void b() {
		System.out.println("method 2 start");
		String b="akash";
		Assert.assertNull(b);
		System.out.println("method 2 end");

}



}

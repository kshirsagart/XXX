package hardassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _AssertTrue {

	
		
		@Test
		public void a() {
			System.out.println("method 1 start");
			Assert.assertTrue(true);
			System.out.println("method 1 end");
			
		}
		
		
		@Test
		public void b() {
			System.out.println("method 2 start");
			
			Assert.assertTrue(false);
			System.out.println("method 2 end");
	
	}

}

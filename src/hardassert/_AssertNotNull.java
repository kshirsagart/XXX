package hardassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _AssertNotNull {

	

		@Test
		public void a() {
			System.out.println("method 1 start");
			String a="akash";
			Assert.assertNotNull(a);
			System.out.println("method 1 end");
			
		}
		
		
		@Test
		public void b() {
			System.out.println("method 2 start");
			String b=null;
			Assert.assertNotNull(b);
			System.out.println("method 2 end");
	
	



	}

}

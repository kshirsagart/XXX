package dependsonmethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void a() {
		System.out.println("a");
	}
	

	@Test
	public void b() {
		System.out.println("b");
		Assert.fail();
	}
	

	@Test(dependsOnMethods="a")
	public void c() {
		System.out.println("c");
	}
	

	@Test(dependsOnMethods="b")
	public void d() {
		System.out.println("d");
	}

}

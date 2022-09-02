package dependsonmethod;

import org.testng.annotations.Test;

public class AnotherClass {
	
	@Test
	public void AAA() {
		System.out.println("AAA");
	}
	
	@Test(dependsOnMethods={"AAA","dependsonmethod.DependsOnMethod.b"})
	public void BBB() {
		System.out.println("BBB");
	}

}

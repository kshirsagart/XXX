package basics;

import org.testng.annotations.Test;

public class invocationcount {
	
	@Test
	public void l() {
		System.out.println("l");
		
	}
	
	@Test
	public void b() {
		System.out.println("b");
		
		
	}
	
	@Test(invocationCount=3)
	public void a() {
		System.out.println("a");
		
	}
	
	@Test
	public void z() {
		System.out.println("z");
		
	}

}

package basics;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=3)
	public void l() {
		System.out.println("l");
		
	}
	
	@Test(priority=1)
	public void b() {
		System.out.println("b");
		
		
	}
	
	@Test(priority=0)
	public void a() {
		System.out.println("a");
		
	}
	
	@Test(priority=-2)
	public void z() {
		System.out.println("z");
		
	}

}

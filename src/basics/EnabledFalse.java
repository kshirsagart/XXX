package basics;

import org.testng.annotations.Test;

public class EnabledFalse {
	
	@Test
	public void l() {
		System.out.println("l");
		
	}
	
	@Test(enabled=false)
	public void b() {
		System.out.println("b");
		
		
	}
	
	@Test
	public void a() {
		System.out.println("a");
		
	}
	
	@Test
	public void z() {
		System.out.println("z");
		
	}

}

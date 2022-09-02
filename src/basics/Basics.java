package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basics {

	
	@Test
	public void m1() {
		System.out.println("Hello java");
		//these statement give the output only in console 
		
		Reporter.log("Hello c++",true);
		//if condition is true then these statement give the output in console as well as testing report
		
		Reporter.log("Hello python",false);
		//if condition is false then these statement give the result only in testing report.
		
	}
}

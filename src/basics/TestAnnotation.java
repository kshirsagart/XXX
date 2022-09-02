package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation {
	
	
	@Test
	public void a() {
		System.out.println("a");
	}
	
	@BeforeMethod
	public void m() {
		System.out.println("m");
	}
	
	@AfterMethod
	public void j() {
		System.out.println("j");
	}
	
	@BeforeClass
	public void c() {
		System.out.println("c");
	}
	
	@AfterClass
	public void f() {
		System.out.println("f");
	}
	
	@BeforeTest
	public void g() {
		System.out.println("g");
	}
	
	@AfterTest
	public void h() {
		System.out.println("h");
	}
     
	@BeforeSuite
	public void s() {
		System.out.println("s");
	}
    
	@AfterSuite
	public void v() {
		System.out.println("v");
	}


}

package tectNG;

import org.testng.annotations.Test;

public class dependsTesting {
	
	@Test(enabled = true )
	public void sslc() {
	System.out.println("sslc passed");

	} 
	@Test(dependsOnMethods = "sslc")
	public void higherSecondary() {
		System.out.println("highersecondey passed ");

	}
	@Test(dependsOnMethods = "higherSecondary")
	public void college() {
		System.out.println("college ..enterd..");
	}

}

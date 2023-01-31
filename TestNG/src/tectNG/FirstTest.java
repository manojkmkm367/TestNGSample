package tectNG;

import org.testng.annotations.Test;

import graphql.Assert;





public class FirstTest {
	@Test(priority = 1)
	public  void cycleTest1() {
		System.out.println("cycle ... ()");
		
		
	}

	@Test(priority = 2)
	public void bikeTest2() {
		System.out.println("bike ... ()");
	}

	@Test(priority = 3)
	public void carTest3() {
		System.out.println("car ... ()");

	}

	@Test(enabled = false) // to skip that Test case KEY--> enabled = false
	public void trinTest3() {
		System.out.println("trin ... ()");

	}

	@Test(priority = 5, enabled = false)
	public void flightTest3() {
		System.out.println("flight ... ()");
		
	}
}

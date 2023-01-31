package tectNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class GroupingTest {

	@Test(timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
	private void timeTest() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("timeOut.###########################.");

	}
	
	@Test(groups = "Apple")
	private void apple7() {
		System.out.println("Apple7");
		

	}
	@Test(groups = "Apple")
	private void appleSE() {
		System.out.println("AppleSE");
	}
	@Test(groups = "HTC")
	private void htc820() {
		System.out.println("HTC820");

	}
	@Test(groups = "HTC")
	private void htc760() {
		System.out.println("HTC760");

	}
	@Test(groups = "Moto")
	private void motoG5() {
		System.out.println("MotoG5");

	}
	@Test(groups = "Moto")
	private void motoXplay() {
		System.out.println("MotoXplay");

	}
	@Test(groups = "Nokia")
	private void nokia1100() {
		System.out.println("Nokia1100");

	}
	@Test(groups = "Nokia")
	private void nokia2700() {
		System.out.println("Nokia2700");

	}

}

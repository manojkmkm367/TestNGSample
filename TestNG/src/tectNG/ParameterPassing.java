package tectNG;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing {

//	@Test
//	@Parameters({"EmpName","EmpId"})
//	private void EmpName(String empname ,int Id) {
//		
//		System.out.println(" New Emp Name is : "+ empname +" & id "+ Id);
//		
//	}
	public static void main(String[] args) {
		Assert.assertEquals("empname","empname");
	}
	    	
}

package SeleniumThreePm;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void demo() {
		

		String actualresult="Qspider";
		String expectedresult="jspider";
		SoftAssert sa = new SoftAssert();
	    sa.assertEquals(actualresult, expectedresult);
		System.out.println("assertion is passed");
		
	
	}

}

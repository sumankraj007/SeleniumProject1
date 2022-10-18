package SeleniumThreePm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void demo() {
		
		String actualresult="Qspider";
		String expectedresult="Qspider";
		Assert.assertEquals(actualresult, expectedresult);
		System.out.println("assertion is passed");
	}

}

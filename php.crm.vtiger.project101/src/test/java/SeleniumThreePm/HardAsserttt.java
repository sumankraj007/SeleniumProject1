package SeleniumThreePm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsserttt {
	@Test
public void demo() {
		
		boolean actualresult=false;
		boolean expectedresult=true;
		Assert.assertEquals(actualresult, expectedresult);
		System.out.println("assertion is passed");
	}
	

}

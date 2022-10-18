package SeleniumThreePm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertt {
	@Test
public void demo() {
		
		int actualresult=200;
		int expectedresult=768;
		Assert.assertEquals(actualresult, expectedresult);
		System.out.println("assertion is passed");
	}

}

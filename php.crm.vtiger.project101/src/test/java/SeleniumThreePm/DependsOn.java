package SeleniumThreePm;

import org.testng.annotations.Test;

public class DependsOn {
	@Test
	public void login() {
		System.out.println("login is successful");
	}
	@Test(dependsOnMethods ="login"  )
	public void addToCart() {
		System.out.println("addToCart is successful");
	}
	@Test(dependsOnMethods ="addToCart")
	public void payment() {
		System.out.println("payment is successful");
	}

}

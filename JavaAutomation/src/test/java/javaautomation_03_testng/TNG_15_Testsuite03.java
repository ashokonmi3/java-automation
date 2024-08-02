package javaautomation_03_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TNG_15_Testsuite03 {
	@BeforeClass
	public void login() {
		System.out.println("Login Successful");
	}

	@AfterClass
	public void logout() {
		System.out.println("Logout Successful");
	}

	@Test(priority = 1)
	public void editVendor() {
		System.out.println("Delete Vendor Successful");
	}

	@Test(priority = 2)
	public void editProduct() {
		System.out.println("Delete Product Successful");
	}

	@Test(priority = 3)
	public void editCurrency() {
		System.out.println("Delete Currency Successful");
	}

}

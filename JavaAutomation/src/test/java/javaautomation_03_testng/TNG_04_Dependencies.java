package javaautomation_03_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TNG_04_Dependencies {
	@Test(priority = 1)
	public void methodA() {
		System.out.println("This is method A");
	}

	//
	@Test(dependsOnMethods = { "methodA" }, priority = 4)
	public void methodB() {
		System.out.println("This is method B depends on Method A");

	}// This test will be failed.
		//

	@Test(priority = 2)
	public void methodC() {
		System.out.println("This is method C");
		Assert.assertEquals("Yahoo", "Yahoo1");
	}

	@Test(dependsOnMethods = { "methodC" }, priority = 3)
	public void methodD() {
		System.out.println("This is method D");
	}

	@Test(dependsOnMethods = { "methodC" }, priority = 3, alwaysRun = true)
	public void methodE() {
		System.out.println("This is method E with always run");
	}

	@Test
	public void methodF() {
		System.out.println("This is method F without any dependency");
	}

}

package javaautomation_03_testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TNG_10_BeforeGroup {
	@BeforeGroups(value = "sanity")
	public void beforeGroupsExampleReal() {
		System.out.println("@BeforeGroups for sanity");
	}

	@BeforeGroups(value = "regression")
	public void beforeGroupsExampleDummy() {
		System.out.println("@BeforeGroups for regression");
	}

	/*
	 * after method and after class blocks
	 */
	@Test(groups = "sanity")
	public void openDummy() {
		System.out.println("@Test sanity");
	}

	@Test(groups = "regression")
	public void openReal() {
		System.out.println("@Test regression");
	}

	@AfterGroups(value = "sanity")
	public void afterGroupsExampleReal() {
		System.out.println("@AfterGroups for sanity");
	}

	@AfterGroups(value = "regression")
	public void afterGroupsExampleDummy() {
		System.out.println("@AfterGroups for regression");
	}
}
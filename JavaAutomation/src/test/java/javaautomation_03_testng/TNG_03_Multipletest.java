package javaautomation_03_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

//public class TNG_03_Multipletest {
//	@Test
//	public void testA() {
//		Assert.assertEquals("Gmail", "Gmail");
//		System.out.println("Test A");
//	}
//
//	@Test
//	public void testC() {
//		System.out.println("Test C");
//		Assert.assertEquals("Gmail", "Gmail");
//	}
//
//	@Test
//	public void testB() {
//		System.out.println("Test B");
//		Assert.assertEquals("Yahoo", "Yahoo");
//	}
//
//}
// ==================================
public class TNG_03_Multipletest {
	@Test(priority = 3)
	public void priorityThree() {
		System.out.println("I am in priority 3");
		Assert.assertEquals("Gmail", "Gmail");
	}

	@Test
	public void withOutPriority() {// highest priority
		System.out.println("I am without priority and highest priority");
		Assert.assertEquals("Yahoo", "Yahoo");
	}

	@Test(priority = 2)
	public void priorityTwo() {
		System.out.println("I am in priority 2");
		Assert.assertEquals("Gmail", "Google");
	}

	@Test(priority = 0)
	public void priorityZero() {
		System.out.println("I am in priority 0 and pqr");
		Assert.assertEquals("Yahoo", "Yahoo");
	}

	@Test(priority = 0)
	public void aPriorityZero() {
		System.out.println("I am in priority 0 and apqr");
		Assert.assertEquals("Yahoo", "Yahoo");
	}

	@Test(priority = 1)
	public void priorityOne() {
		System.out.println("I am in priority 1");
		Assert.assertEquals("Yahoo", "Yahoo");
	}

	@Test(priority = 1, enabled = false)
	public void priorityOneButDisabled() {
		Assert.assertEquals("Google", "Google");
	}

}

package javaautomation_03_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// To configure Eclipse you need to perform the following:

// Add TestNG to Eclipse using TestNG Plugin configuration and Run
// Creating Sample Maven Project by adding TestNG dependency
// =========================
// assertEqual(a,b) a==b
// assertNotEqual(a,b) a!=b
// assertTrue(x) bool(x)is True (10>5)
// assertFalse(x) bool(x)is False
// assertFalse(before==after)
//// assertIsNone(x) x is None
// assertIsNotNone(x) x is not None assertIn(a,b)a in b
// assertNotIn(a,b) a not in b
// assertIsInstance(a,b)
// isinstance(a,b)
// assertNotIsInstance(a,b)

// ===============
// this method gives option to the user to compare two items, if the comparison
// results in true then this Assert statement is passed otherwise fails the
// statement.

//public class TNG_01_Assert {
//	@Test
//	public void testAssertTrue() {
//		Assert.assertTrue(2 > 1); // import org.testng.Assert;
//		System.out.println("compare 2 is greated than 1");
//		// Assert.assertTrue("selenium".equals("selenium"));
//		System.out.println("compared two not equal string ");
//	}
//}
// ================================
//public class TNG_01_Assert {
//	@Test
//	public void testAssertTrue() {
//		Assert.assertTrue(2 > 1);
//		System.out.println("compare 2 is greated than 1");
//
//		Assert.assertTrue("selenium".equals("java"));
//		System.out.println("compared two not equal string");
//	}
//}
// =======================
//
//public class TNG_01_Assert {
//	@Test
//	public void testAssertFalse() {
//		Assert.assertFalse(2 > 30, "comparing 2 greater than 30");// message will
//		// be printed only when fails
//		System.out.println("this print will be executed as condition results");
//		Assert.assertFalse(true == false);
//		System.out.println("this will not be executed as condition results in true");
//	}
//}
// ====================

// Assert.fail method fails the current test with the given message,
// user not only can set the error message but also they can set the exception
// which caused the failure.
//
//public class TNG_01_Assert {
//	@Test
//	public void testFail() {
//		int a = 10;
//		if (a == 10) {
//			Assert.fail("This is manual test fail usng Assert.fail", new NoSuchFrameException("user exception"));
//		} else {
//			System.out.println("a is not 10");
//		}
//
//	}
//}

// =====================
//public class TNG_01_Assert {
//	static WebDriver driver;
//
//	@Test
//	public void testassert() {
//		// static WebDriver driver;
//
//		// public static void main(String[] args) {
//		// check driver is not null
//		Assert.assertNotNull(driver);
//	}
//}

// ==================================
//public class TNG_01_Assert {
//	// public static void main(String[] args) {
//	// set the geckodriver.exe property
//	@Test
//	public void testassert() {
//		WebDriver driver = new ChromeDriver();
//		Assert.assertNotNull(driver);
//		driver.quit();
//	}
//}
// ================================

//public class TNG_01_Assert {
//	@Test
//	public void testassert() {
//		String s1 = "javaselenium";
//		String s2 = "javaselenium";
//		// strings created with double quotes keyword will have same addresses if
//		// content is same
//		Assert.assertSame(s1, s2, "Strings sharing same address");
//
//		String s3 = new String("Google");
//		String s4 = new String("Google");
//		// compare using Assert Equals, assertion passes
//		Assert.assertEquals(s3, s4, "string content comparision failed");
//		// strings created with new keyword will have different addresses
//		Assert.assertSame(s3, s4, "String as not sharing same address");
//	}
//}
// =======================

/*
 * Soft assert Soft Assert – Soft Assert collects errors during @Test. Soft
 * Assert does not throw an exception when an assert fails and would continue
 * with the next step after the assert statement. If there is any exception and
 * you want to throw it then you need to use assertAll() method as a last
 * statement in the @Test and test suite again continue with next @Test as it
 * is.
 * 
 * We need to create an object to use Soft Assert which is not needed in Hard
 * Assert. //
 */
public class TNG_01_Assert {
	@Test
	public void testassert() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		SoftAssert sa = new SoftAssert();
		// compare the titles
		sa.assertEquals(driver.getTitle(), "Google11", "title is not google");
		// try to print the statement
		// Assert.assertEquals(driver.getTitle(), "Google", "title is not google");

		System.out.println("this step should execute");
		System.out.println("this step also gets executed");
		// execute all the statement before below step
		sa.assertAll();
		// below step will not be executed
		System.out.println("This step will not be executed");
		driver.quit();
	}
}
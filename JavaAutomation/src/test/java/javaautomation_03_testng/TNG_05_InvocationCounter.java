package javaautomation_03_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//public class TNG_05_InvocationCounter {
//	@Test(invocationCount = 3)
//	public void f() {
//		System.out.println("Java selenium");
//
//	}
//}
// =========================
//
//public class TNG_05_InvocationCounter {
//	@Test(invocationCount = 10, invocationTimeOut = 3000) // mililsecon and
//	// considered as
//	// a single test
//
//	public void f() {
//		System.out.println("Java selenium");
//
//	}
//}
// ==================
//public class TNG_05_InvocationCounter {
//	@Test(invocationCount = 10, invocationTimeOut = 15000)
//	public void f() throws InterruptedException {
//		System.out.println("Java selenium");
//		Thread.sleep(3000);
//	}
//}
// ============================
//public class TNG_05_InvocationCounter {
//	@Test(invocationCount = 7, threadPoolSize = 7)
//	public void f() throws InterruptedException {
//		System.out.println("Thread Name : " + Thread.currentThread().getName());
//		Thread.sleep(3000);
//		System.out.println("Test done");
//
//	}
//}

// =================================
//public class TNG_05_InvocationCounter {
//	@Test(invocationCount = 10, threadPoolSize = 10, invocationTimeOut = 5000)
//	public void f() throws InterruptedException {
//		System.out.println("Thread Name : " + Thread.currentThread().getName());
//		Thread.sleep(3000);
//		System.out.println("Test done");
//
//	}
//}

// =======================
//public class TNG_05_InvocationCounter {
//	@Test(timeOut = 5000) // millisecond
//	public void f() throws Exception {
//		// sleep for 10 seconds
//		Thread.sleep(10000);
//		System.out.println("will take more than 10 seconds");
//	}
//
//	@Test(timeOut = 5000)
//	public void g() throws Exception {
//		System.out.println("will be completed withing 5 seconds");
//	}
//}
// ===========================
/*
 * Expected Exceptions ---Sometimes we might have scenarios where we expect an
 * exception as result, In such cases we have verify that an exception is being
 * thrown by the program during execution.
 * 
 * For Example, you have deleted an a product from the list, to verify whether
 * the product is not there, you can try to find the product but as the product
 * is not there so it should throw an NoSuchElementException in selenium.
 * 
 * TestNG provides a way to handle such exceptions, we need to set the property
 * of the expectedException to the required exception
 * 
 * //
 */
//public class TNG_05_InvocationCounter {
//	@Test(expectedExceptions = ArithmeticException.class)
//	public void f1() {
//		throw new ArithmeticException("for demo purpose only");
//	}
//
//	@Test(expectedExceptions = ArithmeticException.class)
//	public void f2() {
//		throw new ArrayIndexOutOfBoundsException("Throw different exception");
//	}
//
//	@Test(expectedExceptions = ArithmeticException.class)
//	public void f3() {
//		System.out.println("this method don't throw any exception");
//	}
//}
// ==========================
public class TNG_05_InvocationCounter {
	@Test(expectedExceptions = NoSuchElementException.class) // either any
	// exception
	public void f1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		// name which has no match in google page
		driver.findElement(By.name("who-cares")).click();
		// throw new NoSuchElementException("Throw different exception than expected
		// one");
		driver.quit();
	}
}
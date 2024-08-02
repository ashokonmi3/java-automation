package javaautomation_03_testng;

import org.testng.annotations.Test;

public class TNG_11_ParallelExecution_02 {
	@Test
	public void testCase4() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 4 is Successful - Thread id is: " + id);

		for (int i = 50; i < 60; i++) {
			System.out.println(i);
			System.out.println("Test Case 4 from Class 2");

			Thread.sleep(2000);
		}

	}

	@Test
	public void testCase5() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 5 is Successful - Thread id is: " + id);
		for (int i = 110; i < 120; i++) {
			System.out.println(i);
			System.out.println("Test Case 5 from Class 2");

			Thread.sleep(2000);
		}

	}

	@Test
	public void testCase6() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 6 is Successful - Thread id is: " + id);
		for (int i = 1000; i < 1010; i++) {
			System.out.println(i);
			System.out.println("Test Case 6 from Class 2");

			Thread.sleep(1000);
		}
	}

}

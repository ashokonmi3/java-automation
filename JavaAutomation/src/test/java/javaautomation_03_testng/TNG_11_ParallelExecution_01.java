package javaautomation_03_testng;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TNG_11_ParallelExecution_01 {
	public static LocalTime startTime;
	public static LocalTime endTime;

	@BeforeClass
	public void beforeClass() {
		startTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime = startTime.format(formatter);
		System.out.println("Start Time: " + formattedTime);

	}

	@AfterClass
	public void afterClass() {
		LocalTime endTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime = endTime.format(formatter);
		System.out.println("End Time: " + formattedTime);
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Time Taken for execution: " + duration);
		// PT1M0.3536924S --. PT - Period of time , H for hours, M for minutes ,S for
		// seconds

	}

	@Test
	public void testCase1() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 1 is Successful - Thread id is: " + id);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("Test Case 1 from Class 1");
			Thread.sleep(2000);
		}
	}

	@Test
	public void testCase2() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 2 is Successful - Thread id is: " + id);
		for (int i = 20; i < 30; i++) {
			System.out.println(i);
			System.out.println("Test Case 2 from Class 1");
			Thread.sleep(2000);
		}
	}

	@Test
	public void testCase3() throws InterruptedException {
		long id = Thread.currentThread().getId();
		System.out.println("Test Case 3 is Successful - Thread id is: " + id);
		for (int i = 30; i < 40; i++) {
			System.out.println(i);
			System.out.println("Test Case 3 from Class 1");
			Thread.sleep(2000);
		}
	}

}

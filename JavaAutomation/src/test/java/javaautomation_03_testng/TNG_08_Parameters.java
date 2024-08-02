package javaautomation_03_testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNG_08_Parameters {
	@Parameters({ "searchTerm", "url" })
	@Test
	public void dataDrivenTest(String search_Term, String url_ofSearch_engine) throws InterruptedException {
		System.out.println("searchTerm is  " + search_Term);
		System.out.println("url is  " + url_ofSearch_engine);

		System.out.println("test completed");

	}
}

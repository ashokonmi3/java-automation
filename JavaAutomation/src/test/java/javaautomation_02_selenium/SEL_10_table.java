package javaautomation_02_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//<table>
//<tbody>
//<th>
//<tr>
//<td>
//</td>
//</tr>
//</tobdy>
//</table>

//public class SEL_10_table {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://ashokonmi3.github.io/Selenium.Pages/Table.html");
//		Thread.sleep(3000);
//		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
//		System.out.println(innerText);
//		innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
//		System.out.println(innerText);
//		innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]")).getText();
//		System.out.println(innerText);
//		innerText = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
//		System.out.println(innerText);
//
//		driver.quit();
//
//	}
//
//}
// ==============================

public class SEL_10_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://ashokonmi3.github.io/Selenium.Pages/Table.html");

		WebElement mytable = driver.findElement(By.xpath("html/body/table/tbody"));

		// To locate rows of table.
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		// java util
		// To calculate no of rows In table.
		int rows_count = rows_table.size();
		System.out.println("Number of Rows in table are " + rows_count);

		List<WebElement> column_first_row = rows_table.get(1).findElements(By.tagName("td"));
		System.out.println("Number of columns in first row " + column_first_row.size());

		String celltext1 = column_first_row.get(1).getText();
		System.out.println("Text of columns 1 in first row " + celltext1);

		// Loop will execute for all the rows of the table
		for (int row = 0; row < rows_count; row++) {

			// To locate columns(cells) of that specific row.
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			//

			// <element 1, elemnt 2, element 3, element 4>
			// To calculate no of columns(cells) In that specific row.
			int columns_count = Columns_row.size();
			System.out.println("Number of cells In Row " + row + " are " + columns_count);

			// Loop will execute till the last cell of that specific row.
			for (int column = 0; column < columns_count; column++) {
				// To retrieve text from the cells.
				String celltext = Columns_row.get(column).getText();
				System.out.println(
						"Cell Value Of row number " + row + " and column number " + column + " Is " + celltext);
			}
		}
		System.out.println("Success");
		driver.quit();
	}
}
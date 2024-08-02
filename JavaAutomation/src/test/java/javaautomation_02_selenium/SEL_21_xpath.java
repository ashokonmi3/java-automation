package javaautomation_02_selenium;

// XPath is a Selenium technique that is used to navigate through the HTML
// structure of a webpage.
// It is a syntax or language that makes finding elements on a webpage possible
// using XML path expression.
// 1. Absolute XPath: Uses the complete path starting from root (/html) to
// desired element
// Syntax: /html/body/div[2]/div/...
// Note- Any changes in any element this xpath will not work
// 2. Relative xpath: Start from node of your choice , smaller than absolute
// xpath
// More reliable

// Combination of Relative and Absolute XPath
//
// Example: //span[@id='u123']/div[1]/a

// https://www.guru99.com/xpath-selenium.html
// https://www.guru99.com/locators-in-selenium-ide.html
// ======================
// xpath =//tagname[@attribute='value']

// public class SEL_21_xpath {
//
// public static void main(String[] args) throws InterruptedException {
//
// WebDriver driver = new ChromeDriver();
//
// driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//
// Thread.sleep(2000);
//
// driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Ashok");
//
// Thread.sleep(2000);
//
// driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("abcd");
// Thread.sleep(2000);
//
// driver.findElement(By.xpath("//input[@type='submit']")).click();
// driver.quit();
// }
//
// }
// ====================
// Syntax: //TagName[text()="Text"]

// public class SEL_21_xpath {
//
// public static void main(String[] args) throws InterruptedException {
//
// WebDriver driver = new ChromeDriver();
//
// driver.get("https://www.facebook.com/reg/");
//
// String text = driver.findElement(By.xpath("//div[text()=\'Create a new
// account\']")).getText();
//
// System.out.println(text);
// driver.quit();
//
// }
//
// }
// =============================
// 1. Using 'and' Operator
// Syntax:
// //TagName[@Att1='Value1' and @Att2='Value2']
// //TagName[@Att='Value' and Text()='Value']
//
// 2. Using 'or' Operator
// Syntax:
// //TagName[@Att1='Value1' or @Att2='Value2']
// //TagName[@Att='Value' or Text()='Value']
//
// 3. Using 'contains'
// Syntax:
// //TagName[contains(@Att,'Partial Value')]
// //TagName[contains(text(),'Partial Value')]
//
// 4. Using 'starts-with'
// Syntax:
// //TagName[starts-with(@Att,'Starting Value')]
// //TagName[starts-with(text(),'Starting Value')]
//
// 5. Hybrid
// Syntax:
// //TagName[contains(@Att1,'Partial Value') and starts-with(text(),'Starting
// Value')]
// //TagName[@Att1='Value' or starts-with(@Att2,'Starting Value')]
// //*[@Att='Value']

// ====================

// * What is CSS and CSS Selector?
// *
// * CSS (Cascading Style Sheets): Describes presentation of elements mentioned
// in HTML
// *
// * CSS Selector: Pointer for applying the styling mentioned in CSS
// *
// */
/*
 **** Creating CSS Selector Using Attributes **** Syntax: TagName[Att1=Value] In
 * case Att1 is 'id' or 'class' then we can use following symbols: id => #
 * (hash) class => . (dot) Examples: 1. div#u123 2. span.layerParent
 */

// public class SEL_21_xpath {
//
// public static void main(String[] args) throws InterruptedException {
//
// WebDriver driver = new ChromeDriver();
//
// driver.get("https://www.amazon.com/");
//
// driver.findElement(By.cssSelector("i.hm-icon")).click();
//
// Thread.sleep(1000);
//
// driver.findElement(By.xpath("//a[@class='hmenu-item' and
// @data-menu-id=2]")).click();
//
// Thread.sleep(1000);
//
// driver.findElement(By.xpath("//a[contains(text(),'Podcasts')]")).click();
//
// Thread.sleep(1000);
//
// String title = driver
// .findElement(By.xpath(".color-black.font_Sharp_Grotesk_Pan_Euro_Bold_20.desktop.align-center"))
// .getText();
//
// System.out.println(title);
//
// if (title.contains("podcast")) {
// System.out.println("Pass");
// } else {
// System.out.println("Fail");
// }
//
// driver.close();
// }
//
// }
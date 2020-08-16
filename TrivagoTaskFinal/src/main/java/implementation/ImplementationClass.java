package implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.commons.lang.RandomStringUtils;


public class ImplementationClass {
	public static WebDriver driver;

	// S1 function for given to open magazine.trivago.com
	public static void OpenChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); // max. driver to full screen.
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://magazine.trivago.com/");

	}

	// S1 for when, function to select & click on search icon
	public static void ClickonSearchicon() {
		WebElement Search = driver.findElement(By.className("search-icon"));
		Search.click();

	}

	// S1 for And, function to type England in searchbox (selected by xpath) and
	// click Enter
	public static void EnterTextOnSearch() throws InterruptedException {
		Thread.sleep(2000); // wait page to load.
		WebElement Search1 = driver.findElement(By.xpath("//input[contains(@class,'input search-input')]"));
		Search1.sendKeys("England");
		Search1.sendKeys(Keys.ENTER);

	}

	/*
	 * S1 for Then, function to get page source and check Search Results displayed
	 * to make sure that results are displayed
	 */
	public static void ValidateSearchResults() throws InterruptedException {
		Thread.sleep(2000);
		String currentvalue = driver.getPageSource();
		Assert.assertTrue(currentvalue.contains("Search Results"));

	}

	// S2 for given, function to clear the searchbox from entered text.
	public static void Clearbox() {
		WebElement ClearSearch = driver.findElement(By.xpath("//input[contains(@class,'input search-input')]"));
		ClearSearch.clear();

	}

	// S2 for when, function to type Egypt in searchbos and click Enter to search.
	public static void Typebox() {
		WebElement TypeSearch = driver.findElement(By.xpath("//input[contains(@class,'input search-input')]"));
		TypeSearch.sendKeys("Egypt");
		TypeSearch.sendKeys(Keys.ENTER);
	}

	// S2 for then, function to get page source and check that No results displayed
	// and
	// close driver.
	public static void ValidateNegativeSearch() throws InterruptedException {
		Thread.sleep(2000);
		String currentvalue = driver.getPageSource();
		Assert.assertTrue(currentvalue.contains("No results"));
		driver.close();
	}

	/***********************************************************************/
	// HomePageLinks - function to find any link and click on it by xpath.
	public static void FindandClick() throws InterruptedException {
		WebElement Findlink = driver.findElement(By.xpath("//*[@id=\"mind-traveling\"]/div[1]/div[1]/a/div/div[2]/h3"));
		Findlink.click();
	}

	// HomePageLinks - function to validate the new opened page with different url
	public static void Validatepagechange() {
		String NewURL = driver.getCurrentUrl(); // define new object to get the new page url
		// assert to make sure that value of NewURL contain below value.
		Assert.assertTrue(NewURL.endsWith("where-to-go-california-hotels/"));
		System.out.println(NewURL); // to make sure that previous step passed.
		driver.close(); // close the driver after printing url.
	}

	/************************************************************************/

	public static void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,3500)");
	}

	
	public static String randomMinString(String name) throws InterruptedException {
		String characters = "ABC0123456789";
		String generatedEmail = RandomStringUtils.random(5, characters);
		String generatedValue = generatedEmail + name;
		return generatedValue;
	}

	public static void Insertemail() throws InterruptedException {
		String email = randomMinString("@gmail.com");
		WebElement emailbox = driver.findElement(By.className("et-email"));
		emailbox.sendKeys(email);

	}

	
	public static void InspireMeClick() throws InterruptedException {
		Thread.sleep(5000);
		WebElement InspireMe = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[4]/section/div/div/div[2]/div/div[3]/div[2]/div[2]/button"));
		InspireMe.click();
	}

	public static void ValidateCheckIn() {
		String currentvalue = driver.getPageSource();
		Assert.assertTrue(currentvalue.contains("You are now checked-in!"));
		System.out.println("Hello");
		driver.close();
	}

	public static void Insertinvalidemail() throws InterruptedException {
		WebElement emailbox = driver.findElement(By.className("et-email"));
		emailbox.sendKeys("ahmed.youssif@gmail");
		/* EMAIL ADDRESS WILL NOT BE VALID ANYMORE */

	}

	public static void ValidateErrorMessage() {
		String currentvalue = driver.getPageSource();
		Assert.assertTrue(currentvalue.contains("alert-error et-email-error"));
		System.out.println("Hello");
		driver.close();
	}

}
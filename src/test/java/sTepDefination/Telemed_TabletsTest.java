package sTepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Telemed_TabletsTest {

	public static WebDriver driver;

	@Given("^I click chrome browser$")
	public void i_click_chrome_browser() throws Throwable {
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+internet)\\Mozilla\\geckodriver.exe");
				//driver = new FirefoxDriver();
		
		         //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+internet)\\Chrome\\chromedriver.exe");
		         //driver = new ChromeDriver();
		         
		     
				//System.setProperty("webdriver.IE.driver","C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+internet)\\IE\\IEDriverServer.exe");
				 //driver = new InternetExplorerDriver();

				System.setProperty("webdriver.edge.driver","C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Microsoft Edge\\MicrosoftWebDriver.exe");
			    driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Given("^open American well site$")
	public void open_American_well_site() throws Throwable {
		driver.get("https://www.americanwell.com");

	}

	@When("^I mouse hover on Products$")
	public void i_mouse_hover_on_Products() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("//a[@href='#'][text()='Products']"));
		Actions mouse_hover = new Actions(driver);

		mouse_hover.moveToElement(ele).perform();

	}

	@When("^I click on Telemed Tablets$")
	public void i_click_on_Telemed_Tablets() throws Throwable {

		driver.findElement(By.xpath("//a[text()='Telemed Tablets']")).click();

	}

	@When("^Verify Request a demo button$")
	public void verify_Request_a_demo_button() throws Throwable {

		boolean isDisplayed = driver.findElement(By.xpath("//a[@class='aw-btn aw-btn-cta aw-btn-green'][@href='#']"))
				.isDisplayed();

		boolean isEnbled = driver.findElement(By.xpath("//a[@class='aw-btn aw-btn-cta aw-btn-green'][@href='#']"))
				.isEnabled();

		if (isDisplayed) {
			System.out.println("Button is Displayed");

		} else {
			System.out.println("Button is not Displayed");

		}

		if (isEnbled) {
			System.out.println("Button is Enbled");

		} else {
			System.out.println("Button is not Enbled");

		}

		driver.findElement(By.xpath("//a[@class='aw-btn aw-btn-cta aw-btn-green'][@href='#']")).click();

	}

	@When("^Verify American Well three hundred Telemed Tablet$")
	public void verify_American_Well_three_hundred_Telemed_Tablet() throws Throwable {

		boolean isDisplayed = driver
				.findElement(By.xpath("//a[@href='/telemedicine-equipment/tablets/300-series-telemed-tablet/']"))
				.isDisplayed();

		boolean isEnbled = driver
				.findElement(By.xpath("//a[@href='/telemedicine-equipment/tablets/300-series-telemed-tablet/']"))
				.isEnabled();

		if (isDisplayed) {
			System.out.println("Button is Displayed");

		} else {
			System.out.println("Button is not Displayed");

		}

		if (isEnbled) {
			System.out.println("Button is Enbled");

		} else {
			System.out.println("Button is not Enbled");

		}

		driver.findElement(By.xpath("//a[@href='/telemedicine-equipment/tablets/300-series-telemed-tablet/']")).click();

		// Actual title
		String my_title = driver.getTitle();
		System.out.println("Title is " + my_title);

		String expected_title = "300 Telemed Tablet - American Well";

		Assert.assertEquals(my_title, expected_title);

		System.out.println("Test completed");

		driver.navigate().back();

	}

	@When("^Verify American Well two hundred Telemed Tablet$")
	public void verify_American_Well_two_hundred_Telemed_Tablet() throws Throwable {

		boolean isDisplayed = driver
				.findElement(By.xpath("//a[@href='/telemedicine-equipment/tablets/200-series-telemed-tablet/']"))
				.isDisplayed();

		boolean isEnbled = driver
				.findElement(By.xpath("//a[@href='/telemedicine-equipment/tablets/200-series-telemed-tablet/']"))
				.isEnabled();

		if (isDisplayed) {
			System.out.println("Button is Displayed");

		} else {
			System.out.println("Button is not Displayed");

		}

		if (isEnbled) {
			System.out.println("Button is Enbled");

		} else {
			System.out.println("Button is not Enbled");

		}

		driver.findElement(By.xpath("//a[@href='/telemedicine-equipment/tablets/200-series-telemed-tablet/']")).click();

		// Actual title
		String my_title = driver.getTitle();
		System.out.println("Title is " + my_title);

		String expected_title = "200 Telemed Tablet - American Well";

		Assert.assertEquals(my_title, expected_title);

		System.out.println("Test completed");

		driver.navigate().back();

	}

	@When("^Verify American Well one hundred Telemed Tablet$")
	public void verify_American_Well_one_hundred_Telemed_Tablet() throws Throwable {

		boolean isDisplayed = driver
				.findElement(By.xpath("//a[@href='/telemedicine-equipment/tablets/100-series-telemed-tablet/']"))
				.isDisplayed();

		boolean isEnbled = driver
				.findElement(By.xpath("//a[@href='/telemedicine-equipment/tablets/100-series-telemed-tablet/']"))
				.isEnabled();

		if (isDisplayed) {
			System.out.println("Button is Displayed");

		} else {
			System.out.println("Button is not Displayed");

		}

		if (isEnbled) {
			System.out.println("Button is Enbled");

		} else {
			System.out.println("Button is not Enbled");

		}

		driver.findElement(By.xpath("//a[@href='/telemedicine-equipment/tablets/100-series-telemed-tablet/']")).click();

		// Actual title
		String my_title = driver.getTitle();
		System.out.println("Title is " + my_title);

		String expected_title = "100 Telemed Tablet - American Well";

		Assert.assertEquals(my_title, expected_title);

		System.out.println("Test completed");

		driver.navigate().back();

	}

	@Then("^I close it$")
	public void i_close_it() throws Throwable {

		driver.quit();
	}

}

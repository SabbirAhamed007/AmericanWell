package sTepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	public static WebDriver driver;

	@Given("^I open chrome browser$")
	public void i_open_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Given("^type Americanwell web address$")
	public void type_Americanwell_web_address() throws Throwable {

		driver.get("https://www.americanwell.com");

	}

	@When("^I verify Americanwell homepae$")
	public void i_verify_Americanwell_homepae() throws Throwable {

		boolean isDisplayed = driver
				.findElement(By
						.xpath("//a[@class='aw-btn aw-btn-cta aw-btn-green visible-sm-inline-block visible-md-inline-block visible-lg-inline-block'][@href='/contact-us/']"))
				.isDisplayed();

		boolean isEnbled = driver
				.findElement(By
						.xpath("//a[@class='aw-btn aw-btn-cta aw-btn-green visible-sm-inline-block visible-md-inline-block visible-lg-inline-block'][@href='/contact-us/']"))
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

	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		driver.quit();

	}

}

package sTepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AviziaTest {
	public static WebDriver driver;

	@Given("^I open American well home page$")
	public void i_open_American_well_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.americanwell.com");

	}

	@When("^I click on Avizia link$")
	public void i_click_on_Avizia_link() throws Throwable {

		boolean isDisplayed = driver.findElement(By.xpath("//a[text()='American Well + Avizia']")).isDisplayed();

		boolean isEnbled = driver.findElement(By.xpath("//a[text()='American Well + Avizia']")).isEnabled();

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

		driver.findElement(By.xpath("//a[text()='American Well + Avizia']")).click();

	}

	@Then("^I validate the Avizia page$")
	public void i_validate_the_Avizia_page() throws Throwable {

		WebElement element = driver.findElement(By
				.xpath("//h2[text()='One End-to-End Solution']"));

		System.out.println(element.getText());

	}

	@Then("^close the website$")
	public void close_the_website() throws Throwable {
		
		driver.quit();

	}

}

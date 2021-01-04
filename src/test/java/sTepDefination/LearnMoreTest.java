package sTepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LearnMoreTest {
	public static WebDriver driver;

	@Given("^Open American well website$")
	public void open_American_well_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.americanwell.com");

	}

	@When("^click learn more button$")
	public void click_learn_more_button() throws Throwable {

		driver.findElement(By
				.xpath("//a[@class='aw-btn aw-btn-cta aw-btn-green visible-sm-inline-block visible-md-inline-block visible-lg-inline-block'][@href='/contact-us/']"))
				.click();

	}

	@When("^fill up Connect With Us$")
	public void fill_up_Connect_With_Us() throws Throwable {

		long currentTime = System.currentTimeMillis();

		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("FirstName")).sendKeys("Samsung" + currentTime);

		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys("Jung" + currentTime);

		driver.findElement(By.id("Company")).clear();
		driver.findElement(By.id("Company")).sendKeys("Samsungx8" + currentTime);

		driver.findElement(By.id("Title")).clear();
		driver.findElement(By.id("Title")).sendKeys("Automation" + currentTime);

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("samsung009@gmail.com" + currentTime);

		driver.findElement(By.id("Phone")).clear();
		driver.findElement(By.id("Phone")).sendKeys("9735622321" + currentTime);

		WebElement list_by_business = driver.findElement(By.id("Market__c"));
		Select List_by_business_type = new Select(list_by_business);

		List_by_business_type.selectByValue("International");

		WebElement list_by_country = driver.findElement(By.id("Country"));
		Select List_by_country1 = new Select(list_by_country);

		List_by_country1.selectByValue("Luxembourg");

		driver.findElement(By.id("commentHistory")).clear();
		driver.findElement(By.id("commentHistory"))
				.sendKeys("Pls , do not count this !!! its just for testing " + currentTime);

	}

	@Then("^I click submit button$")
	public void i_click_submit_button() throws Throwable {

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.quit();

	}

}

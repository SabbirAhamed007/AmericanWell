package sTepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResourcesTest {
	public static WebDriver driver;

	@Given("^I open Americal well page$")
	public void i_open_Americal_well_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.americanwell.com");

	}

	@Given("^mouse hover on Resources$")
	public void mouse_hover_on_Resources() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("//a[@href='#'][text()='Resources']"));
		Actions mouse_hover = new Actions(driver);

		mouse_hover.moveToElement(ele).perform();

	}

	@Given("^Click Resources center$")
	public void click_Resources_center() throws Throwable {

		driver.findElement(By.xpath("//a[text()='Resource Center']")).click();

	}

	@Given("^click on Increasing Access to Mental Healthcare via Telehealth$")
	public void click_on_Increasing_Access_to_Mental_Healthcare_via_Telehealth() throws Throwable {

		driver.findElement(By.xpath("//a[text()='Increasing Access to Mental Healthcare via Telehealth']")).click();

	}

	@When("^I fillup the download form$")
	public void i_fillup_the_download_form() throws Throwable {

		long currentTime = System.currentTimeMillis();

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("totti10@gmail.com" + currentTime);

		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("FirstName")).sendKeys("Franco" + currentTime);

		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys("Totti" + currentTime);

		driver.findElement(By.id("Company")).clear();
		driver.findElement(By.id("Company")).sendKeys("Testing Group" + currentTime);

		WebElement list_by_business = driver.findElement(By.id("Market__c"));
		Select List_by_Business = new Select(list_by_business);

		List_by_Business.selectByValue("International");

		driver.findElement(By.id("Title")).clear();
		driver.findElement(By.id("Title")).sendKeys("QA Engineer" + currentTime);

		WebElement list_by_country = driver.findElement(By.id("Country"));
		Select List_by_Country = new Select(list_by_country);

		List_by_Country.selectByValue("Italy");

	}

	@When("^click submit$")
	public void click_submit() throws Throwable {

		driver.findElement(By.xpath("//button[@class='mktoButton aw-btn aw-btn-cta aw-btn-green'][text()='Submit']"))
				.click();

	}

	@Then("^It will show Your case study is ready!$")
	public void it_will_show_Your_case_study_is_ready() throws Throwable {

		// Actual title
		String my_title = driver.getTitle();
		System.out.println("Title is " + my_title);

		String expected_title = "Increasing Access to Mental Healthcare via Telehealth - American Well";

		Assert.assertEquals(my_title, expected_title);

		System.out.println("Test completed");

		driver.quit();

	}

}

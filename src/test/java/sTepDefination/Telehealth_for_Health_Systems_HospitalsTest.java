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

public class Telehealth_for_Health_Systems_HospitalsTest {
	public static WebDriver driver;

	@Given("^I open  chrome browser$")
	public void i_open_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Given("^type American Well address$")
	public void type_American_Well_address() throws Throwable {
		driver.get("https://www.americanwell.com");

	}

	@When("^I mouse hover on Solutions$")
	public void i_mouse_hover_on_Solutions() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("//a[@href='#'][text()='Solutions']"));
		Actions mouse_hover = new Actions(driver);

		mouse_hover.moveToElement(ele).perform();

	}

	@When("^click on Health Systems$")
	public void click_on_Health_Systems() throws Throwable {

		boolean isDisplayed = driver.findElement(By.xpath("//a[text()='Health Systems']")).isDisplayed();

		boolean isEnbled = driver.findElement(By.xpath("//a[text()='Health Systems']")).isEnabled();

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

		driver.findElement(By.xpath("//a[text()='Health Systems']")).click();

	}

	@When("^Verify on Request a Demo button$")
	public void verify_on_Request_a_Demo_button() throws Throwable {

		boolean isDisplayed = driver.findElement(By.xpath("//a[text()='Request a Demo']")).isDisplayed();

		boolean isEnbled = driver.findElement(By.xpath("//a[text()='Request a Demo']")).isEnabled();

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
		
		
		// Actual title
				String my_title = driver.getTitle();
				System.out.println("Title is " + my_title);

				String expected_title = "300 Telemed Tablet - American Well";

				Assert.assertEquals(my_title, expected_title);

				System.out.println("Test completed");


	}

	@When("^Click Request a Demo button$")
	public void click_Request_a_Demo_button() throws Throwable {

		driver.findElement(By.xpath("//a[text()='Request a Demo']")).click();

	}

	@When("^Fillup Connect With Us$")
	public void fillup_Connect_With_Us() throws Throwable {
		
		long currentTime = System.currentTimeMillis();
		
		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("FirstName")).sendKeys("Mathew"+ currentTime);
		
		
		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys("Hudson"+ currentTime);

		
		driver.findElement(By.id("Company")).clear();
		driver.findElement(By.id("Company")).sendKeys("Hudson"+ currentTime);
		
		
		driver.findElement(By.id("Company")).clear();
		driver.findElement(By.id("Company")).sendKeys("QA Team"+ currentTime);
		
		driver.findElement(By.id("Title")).clear();
		driver.findElement(By.id("Title")).sendKeys("QA Engineer"+ currentTime);

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("mathewh@gmail.com"+ currentTime);

		driver.findElement(By.id("Phone")).clear();
		driver.findElement(By.id("Phone")).sendKeys("8625744556"+ currentTime);

		
		WebElement list_by_Business_Type = driver.findElement(By.id("Market__c"));
		Select List_by_Business = new Select(list_by_Business_Type);
		
		List_by_Business.selectByValue("Employer");
		
		
		
		WebElement list_by_Country = driver.findElement(By.id("Country"));
		Select List_by_country = new Select(list_by_Country);
		
		List_by_country.selectByValue("Canada");
		
		
		driver.findElement(By.id("commentHistory")).clear();
		driver.findElement(By.id("commentHistory")).sendKeys("Pls!!! It is just for testing donnot count it"+ currentTime);



		
		
	}

	@Then("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		
		boolean isDisplayed = driver.findElement(By.xpath("//button[text()='Submit']")).isDisplayed();

		boolean isEnbled = driver.findElement(By.xpath("//button[text()='Submit']")).isEnabled();

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

		
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

	}

	@Then("^Registration successfully$")
	public void registration_successfully() throws Throwable {
		
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Thank you.']"));

		System.out.println(element.getText());
		
		
		
		driver.quit();
		


	}

}

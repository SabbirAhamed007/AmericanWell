package sTepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Health_PlanTest {
	public static WebDriver driver;

	@Given("^I open american well website$")
	public void i_open_american_well_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.americanwell.com");

	}

	@Given("^mouse hover on solution$")
	public void mouse_hover_on_solution() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("//a[@href='#'][text()='Solutions']"));
		Actions mouse_hover = new Actions(driver);

		mouse_hover.moveToElement(ele).perform();

	}

	@Given("^click on Health Plans$")
	public void click_on_Health_Plans() throws Throwable {

		driver.findElement(By.xpath("//a[text()='Health Plans']")).click();

	}

	@Given("^click on request demo$")
	public void click_on_request_demo() throws Throwable {
		driver.findElement(By
				.xpath("//a[@class='aw-btn aw-btn-cta aw-btn-green visible-sm-inline visible-md-inline visible-lg-inline'][@href='/contact-us/']"))
				.click();

	}

	@When("^I fill up the Connect With Us form$")
	public void i_fill_up_the_Connect_With_Us_form() throws Throwable {

		long currentTime = System.currentTimeMillis();

		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("FirstName")).sendKeys("Utpol" + currentTime);

		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys("Kumar" + currentTime);

		driver.findElement(By.id("Company")).clear();
		driver.findElement(By.id("Company")).sendKeys("Testing World" + currentTime);

		driver.findElement(By.id("Title")).clear();
		driver.findElement(By.id("Title")).sendKeys("QA Tester" + currentTime);

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("u_kumar@gmail.com" + currentTime);

		driver.findElement(By.id("Phone")).clear();
		driver.findElement(By.id("Phone")).sendKeys("9735615642" + currentTime);

		WebElement list_by_business = driver.findElement(By.id("Market__c"));
		Select List_by_Business = new Select(list_by_business);

		List_by_Business.selectByValue("International");

		WebElement list_by_state = driver.findElement(By.id("State"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("New Jersey");

		driver.findElement(By.id("commentHistory")).clear();
		driver.findElement(By.id("commentHistory")).sendKeys("Pls , this is only for testing" + currentTime);

	}

	@When("^click submit button$")
	public void click_submit_button() throws Throwable {

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

	}

	@Then("^I validate the Thank you$")
	public void i_validate_the_Thank_you() throws Throwable {

		WebElement element = driver.findElement(By.xpath("//h2[text()='Thank you.']"));

		System.out.println(element.getText());

		driver.quit();

	}

}

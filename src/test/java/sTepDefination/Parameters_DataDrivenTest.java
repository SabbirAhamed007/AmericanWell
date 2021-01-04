package sTepDefination;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameters_DataDrivenTest {
	public WebDriver driver;

	@Given("^Open Chrome$")
	public void open_Chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Given("^Type American well website$")
	public void type_American_well_website() throws Throwable {

		driver.get("https://www.americanwell.com");

	}

	@Given("^mousehoover on the dropdown menu Need to see a doctor?\\?$")
	public void click_on_the_dropdown_menu_Need_to_see_a_doctor() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("//span[@class='icon-AW_DoctorWithStethoscope']"));
		Actions mouse_hover = new Actions(driver);

		mouse_hover.moveToElement(ele).perform();

	}

	@Given("^click on cotinue button$")
	public void click_on_cotinue_button() throws Throwable {

		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is " + parent);

		driver.findElement(By.xpath("//a[@class='aw-button'][text()='Continue']")).click();

		Set<String> allwindows = driver.getWindowHandles();

		int count = allwindows.size();

		System.out.println("Total window is " + count);

		for (String child : allwindows) {

			if (!parent.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);

			}

		}

	}

	@Given("^Click on the login button$")
	public void click_on_the_login_button() throws Throwable {

		driver.findElement(By.xpath("//a[@class='tab standard-padding js-track-download'][text()='Log In']")).click();

	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_and(String uname, String pass) throws Throwable {

		long currentTime = System.currentTimeMillis();

		
		driver.findElement(By.id("username")).sendKeys("uname" + currentTime);
		driver.findElement(By.id("password")).sendKeys("pass"+ currentTime);

	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {

		driver.findElement(By.id("loginBtn")).click();

	}

}

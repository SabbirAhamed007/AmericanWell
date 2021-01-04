package sTepDefination;

import java.util.List;
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

public class Join_the_Telehealth_Movement_signupTest {

	public static WebDriver driver;

	@Given("^I open browsers$")
	public void i_open_browsers() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Given("^I type American well site$")
	public void i_type_American_well_site() throws Throwable {
		driver.get("https://www.americanwell.com");

	}

	@Given("^I mouse hover on Providers$")
	public void i_mouse_hover_on_Providers() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("//a[@href='#'][text()='Providers']"));
		Actions mouse_hover = new Actions(driver);

		mouse_hover.moveToElement(ele).perform();

	}

	@Given("^I click on overview$")
	public void i_click_on_overview() throws Throwable {
		
		driver.findElement(By.xpath("//a[@href='https://providers.americanwell.com'][text()='Overview']")).click();
		

	}

	@Given("^I click on Sign Up Now$")
	public void i_click_on_Sign_Up_Now() throws Throwable {
		driver.findElement(By.xpath("//a[@class='aw-btn aw-btn-cta aw-btn-green'][@href='/app/register']")).click();

	}

	@When("^I fillup Register to Practice$")
	public void i_fillup_Register_to_Practice() throws Throwable {
		
		long currentTime = System.currentTimeMillis();
		
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("David" + currentTime);
		
		
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Hudson" + currentTime);
		
		driver.findElement(By.id("emailAddress")).clear();
		driver.findElement(By.id("emailAddress")).sendKeys("davidhudson@gmail.com"+ currentTime);
		
		String Register_to_Practice = driver.getWindowHandle();
		 System.out.println(Register_to_Practice);
		
		
		//driver.findElement(By.id("licenses-select")).click();
		
		
		
		 String parent = driver.getWindowHandle();
			System.out.println("Parent window id is " + parent);

			driver.findElement(By.id("licenses-select")).click();

			Set<String> allwindows = driver.getWindowHandles();

			int count = allwindows.size();

			System.out.println("Total window is " + count);

			for (String child : allwindows) {

				if (!parent.equalsIgnoreCase(child)) {

					driver.switchTo().window(child);

				}

			}

	    
		
			String Select_states = driver.getWindowHandle();
			 System.out.println(Select_states);
		

	}

	@When("^Click on continue button$")
	public void click_on_continue_button() throws Throwable {

	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {

	}

	@Then("^Choose How You Practice form will be display$")
	public void choose_How_You_Practice_form_will_be_display() throws Throwable {

	}

}

package sTepDefination;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpTest {
	public static WebDriver driver;

	@Given("^I open browser$")
	public void i_open_browser() throws Throwable {
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+internet)\\Mozilla\\geckodriver.exe");
		//driver = new FirefoxDriver();

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+internet)\\Chrome\\chromedriver.exe");
		//driver = new ChromeDriver();

		// System.setProperty("webdriver.IE.driver","C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+internet)\\IE\\IEDriverServer.exe");
		// driver = new InternetExplorerDriver();

		System.setProperty("webdriver.edge.driver","C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Microsoft Edge\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Given("^type americanwell web address$")
	public void type_americanwell_web_address() throws Throwable {

		driver.get("https://www.americanwell.com");

	}

	@Given("^mouse hover on Need to see a doctor$")
	public void mouse_hover_on_Need_to_see_a_doctor() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("//span[@class='icon-AW_DoctorWithStethoscope']"));
		Actions mouse_hover = new Actions(driver);

		mouse_hover.moveToElement(ele).perform();

	}

	@Given("^click on continue button$")
	public void click_on_continue_button() throws Throwable {
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

	@Given("^click on signup button$")
	public void click_on_signup_button() throws Throwable {
		
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();

	}

	@When("^I fill all the fields$")
	public void i_fill_all_the_fields() throws Throwable {
		
		long currentTime = System.currentTimeMillis();
		
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("Steve" + currentTime);
		
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Madden" + currentTime);
		
		
		driver.findElement(By.id("emailAddress")).clear();
		driver.findElement(By.id("emailAddress")).sendKeys("Stevemadden@yahoo.com" + currentTime);
		
		
		driver.findElement(By.id("emailAddress2")).clear();
		driver.findElement(By.id("emailAddress2")).sendKeys("Stevemadden@yahoo.com" + currentTime);
		
		
		driver.findElement(By.id("password1")).clear();
		driver.findElement(By.id("password1")).sendKeys("madonna#009" + currentTime);
		
		
		driver.findElement(By.id("submitBtn")).click();
		
		

	}

	@When("^click on agree check button$")
	public void click_on_agree_check_button() throws Throwable {
		
		driver.findElement(By.id("disclaimerAccept")).click();

	}

	@Then("^successfully signup$")
	public void successfully_signup() throws Throwable {
		
		driver.findElement(By.id("submitBtn")).click();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='modernLabel14']"));

		System.out.println(element.getText());
		
		
		driver.quit();



	}

}

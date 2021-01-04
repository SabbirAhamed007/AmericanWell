package crossBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName) {

		if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}

		else if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.IE.driver",
					"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		
		else if (browserName.equalsIgnoreCase("Edge")) {

			System.setProperty("webdriver.edge.driver","C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Microsoft Edge\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();

		}


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.americanwell.com");

		System.out.println(driver.getTitle());

		driver.quit();

	}

}

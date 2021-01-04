package data_drivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogIn {
	
	WebDriver driver;

	@Test(dataProvider="amricanwellData")
	public void loginToAmericanwell(String u_name, String p_word) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+internet)\\Mozilla\\geckodriver.exe");
	 //driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://amwell.com/loginConsumer.htm");

		long currentTime = System.currentTimeMillis();

		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("u_name" + currentTime);

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("p_word" + currentTime);

		driver.findElement(By.id("loginBtn")).click();
		

		Assert.assertTrue(driver.getTitle().contains("amricanwelllogin"),"User is not able to login- Invalid Credentails");
		
		System.out.println("Page Title verfied- User is Able to login Successfully");

	}
	
	@AfterMethod
	public void tearDown(){
		
		
		driver.quit();
		
		
	}
	
	
	@DataProvider(name="amricanwellData")
	public Object[][] passData(){                           //two dimentional array
		
		Object[][] data = new Object[3][2];                   // 3 rows and 2 colomn
		
		data[0][0]="admin1";
		
		data[0][1]="demo1";
		
				
				
        data[1][0]="admin1";
		
		data[1][1]="demo123";
		
		
		
        data[2][0]="admin1";
		
		data[2][1]="demo123";
		
		
		return data;
		
				
				
	}        
	

}

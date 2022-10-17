package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider="dataProvider_test")
	public void contactDetails(String firstName, String lastName, String mobileNo) throws Throwable
	{	
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.id("mobile")).sendKeys(mobileNo);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		driver.quit();
		Thread.sleep(2000);
	}
	
		@DataProvider
		public Object[][] dataProvider_test()
		{
			Object[][] objArr=new Object[3][3];
			
			objArr[0][0]="sarfraj";
			objArr[0][1]="ahmad";
			objArr[0][2]="7998765434";
			
			objArr[1][0]="sunil";
			objArr[1][1]="singh";
			objArr[1][2]="6798765434";
			
			objArr[2][0]="wasif";
			objArr[2][1]="hussain";
			objArr[2][2]="8898765434";
			
			
			
			return objArr;
		}
}

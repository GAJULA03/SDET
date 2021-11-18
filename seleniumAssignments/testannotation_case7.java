package SeleniumAssignments.SeleniumAssignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class testannotation_case {
    WebDriver driver;
	@BeforeTest()
	public void StartTestone() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\AutomationDriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@Test(priority=1)
	public void StartTesttwo() {
		String  Name = "Admin";
		String  Psword = "admin123";
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
		driver.findElement(By.id("btnLogin")).click();
	}
	@AfterTest()
	public void Logout()
	
	{
	driver.quit();
	}

}
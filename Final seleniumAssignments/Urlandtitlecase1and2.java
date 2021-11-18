package SeleniumAssignments.SeleniumAssignments;

 

import org.openqa.selenium.WebDriver;

 

import org.openqa.selenium.chrome.ChromeDriver;

 


public class Urlandtitlecase1and2 {

 

    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver", "C:\\AutomationDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        String title = driver.getTitle();
        
    
        System.out.println(title);
       

 

        driver.close();
    }

 

}
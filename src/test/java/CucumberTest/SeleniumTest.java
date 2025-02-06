package CucumberTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("WebDriver.chrome.driver", projectPath+"//driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		driver.quit();

	}

}

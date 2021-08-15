package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 //To wait for the browser to launch
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 driver.manage().window().maximize();
		 //Username
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 //Password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 //Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //Click the link
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 

	}

}

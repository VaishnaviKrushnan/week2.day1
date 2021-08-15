package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookNewAccountSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// To wait for the browser to launch

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		// Create new account

		driver.findElement(By.linkText("Create New Account")).click();
		// UserName
		driver.findElement(By.name("firstname")).sendKeys("Hashika");
		//
		driver.findElement(By.name("lastname")).sendKeys("Sri");
		driver.findElement(By.name("reg_email__")).sendKeys("aaa@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("facebook@123#");
		// D.O.B
		WebElement drop1 = driver.findElement(By.id("day"));
		Select dayDropDown = new Select(drop1);
		dayDropDown.selectByValue("29");
		// month
		WebElement drop2 = driver.findElement(By.id("month"));
		Select monthDropDown = new Select(drop2);
		monthDropDown.selectByVisibleText("May");
		// Year
		WebElement drop3 = driver.findElement(By.id("year"));
		Select dyearropDown = new Select(drop3);
		dyearropDown.selectByValue("2017");
		// Gender
		driver.findElement(By.name("sex")).click();
	}

}

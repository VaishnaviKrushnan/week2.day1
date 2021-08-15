package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// To wait for the browser to launch

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		driver.manage().window().maximize();
		// First name
		driver.findElement(By.name("UserFirstName")).sendKeys("Vaishnavi");
		// Second Name
		driver.findElement(By.name("UserLastName")).sendKeys("Krushnan");
		// Email
		driver.findElement(By.name("UserEmail")).sendKeys("aaa@gmail.com");
		// Job Title
		WebElement userTtitle = driver.findElement(By.name("UserTitle"));
		Select dropDown1 = new Select(userTtitle);
		dropDown1.selectByValue("Developer");
		// Company name
		driver.findElement(By.name("CompanyName")).sendKeys("LTI");
		// Employees
		WebElement companyEmployees = driver.findElement(By.name("CompanyEmployees"));
		Select dropDown2 = new Select(companyEmployees);
		dropDown2.selectByValue("1600");
		// userPhone
		driver.findElement(By.name("UserPhone")).sendKeys("954412456");
		// Country
		WebElement companyCountry = driver.findElement(By.name("CompanyCountry"));
		Select dropDown4 = new Select(companyCountry);
		dropDown4.selectByValue("IN");
		// userPhone
		WebElement checkBox =driver.findElement(By.className("checkbox-ui"));
			checkBox.click();
	}
}

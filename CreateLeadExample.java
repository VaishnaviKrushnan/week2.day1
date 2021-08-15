package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadExample {

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
		 //click Leads Tab
		 driver.findElement(By.linkText("Leads")).click();
		 //Click Create Lead tab
		 driver.findElement(By.linkText("Create Lead")).click();
		 //Input company name
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("L&T-Infotech");
		 //First Name
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaishnavi");
		 //Last Name
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krushnan");
		 
		 //Source dropdon
		 WebElement dropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select dropSelect = new Select(dropDown1);
		 dropSelect.selectByIndex(3);
		 
		 //Marketting campaign
		 WebElement dropDown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select dropSelect2 = new Select(dropDown2);
		 dropSelect2.selectByValue("CATRQ_ROADNTRACK");
		 
		//Industry
		 WebElement dropDown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select dropSelect3 = new Select(dropDown3);
		 dropSelect3.selectByVisibleText("Computer Software");
		 
		 
		 //Clear the content
		 WebElement countryCodeClear = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		 countryCodeClear.clear();
		 countryCodeClear.sendKeys("5");
		 
		 //click CreateLead Button
		 driver.findElement(By.className("smallSubmit")).click();
		 

	}

}

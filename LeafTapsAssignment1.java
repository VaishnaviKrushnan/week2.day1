package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsAssignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// To wait for the browser to launch

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		// Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Login
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click the link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// click Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		// Click Create Lead tab
		driver.findElement(By.linkText("Create Lead")).click();
		// Input company name

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("L&T-Infotech");
		// First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaishnavi");
		// Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krushnan");

		// Source dropdon
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropSelect = new Select(dropDown1);
		dropSelect.selectByIndex(3);

		// Marketting campaign
		WebElement dropDown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropSelect2 = new Select(dropDown2);
		dropSelect2.selectByValue("CATRQ_ROADNTRACK");

		// FirstNamw-Local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vaish");
		// Last Name_Local
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
		// Salutation
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs.");
		// BirthDate
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/13/90");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Sample");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EmergingMarkets");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000000000000");

		// Preferred currency
		WebElement dropDown4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropSelect4 = new Select(dropDown4);
		dropSelect4.selectByValue("JPY");

		// Industry
		WebElement dropDown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropSelect3 = new Select(dropDown3);
		dropSelect3.selectByVisibleText("Computer Software");
		// No. of Employees
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10000");
		// Ownership
		WebElement ownerShipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown5 = new Select(ownerShipDropdown);
		dropDown5.selectByIndex(1);
		// sic Code
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("001");
		// Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing sample program");
		// importantNote
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("important note");
		// Clear the content
		WebElement countryCodeClear = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCodeClear.clear();
		countryCodeClear.sendKeys("5");
		// Area Code
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600077");
		// phoneNumber
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9175558468");
		// extension
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Rishi");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aaa@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.googole.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Rishi");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Leo Palace");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Texas colo");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		// State
		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown6 = new Select(stateDropdown);
		dropDown6.selectByValue("TX");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("210-12547");
		// Country
		WebElement countryDropdown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropDown7 = new Select(countryDropdown);
		dropDown7.selectByVisibleText("Japan");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("210-12547");

		// click CreateLead Button
		driver.findElement(By.className("smallSubmit")).click();
		// Title of the result page
		String titleResultPage = "View Lead | opentaps CRM";
		String getTitileFromSelenium = driver.getTitle();
		if (titleResultPage.equals(getTitileFromSelenium))
			System.out.println("Lead created successfully and in result page");
		else
			System.out.println("Creation failed");

	}

}

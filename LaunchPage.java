package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps");
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		
		//To maximize the screen.
		driver.manage().window().maximize();

	}

}

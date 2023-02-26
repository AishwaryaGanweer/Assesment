package Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assesment2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Alldrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://selenium-apps.doselect.in/age-calculator/");
		
		driver.findElement(By.id("birth_date")).sendKeys("12-01-1998");
		driver.findElement(By.id("calculate")).click();
		
		driver.findElement(By.xpath("//input[@id='birth_date']")).sendKeys("26-02-2000");
		driver.findElement(By.xpath("//div[@id='calculate']")).click();
		
		System.out.println("Test case is pass");
		//driver.quit();
	}

}

package Execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assesment1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Alldrivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://selenium-apps.doselect.in/change-text/");
	
		driver.findElement(By.id("bigger")).click();
		driver.findElement(By.id("smaller")).click();
		driver.findElement(By.id("reset")).click();

		driver.findElement(By.xpath("//a[@id='bigger']")).click();
		driver.findElement(By.xpath("//a[@id='smaller']")).click();
		driver.findElement(By.xpath("//a[@id='reset']")).click();
		
		System.out.println("Test case is pass");
		
		driver.quit();
	}

}

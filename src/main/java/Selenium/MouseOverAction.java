package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverAction {

	public WebDriver driver;

	@Test
	public void MouseOver() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/index.html");
		driver.manage().window().maximize();

		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));

		WebElement select1 = driver.findElement(By.xpath("//span[text()='Oracle Training']"));

		WebElement select2 = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Training']"));

		Actions action = new Actions(driver);
		// action.moveToElement(course);
		Thread.sleep(3000);
		action.moveToElement(course).build().perform();
		Thread.sleep(3000);
		action.moveToElement(select1).build().perform();
		Thread.sleep(3000);
		action.moveToElement(select2).click().build().perform();

		driver.navigate().back();
		Thread.sleep(3000);

		WebElement round = driver.findElement(By.xpath("(//a[@href='courses.html'])[2]"));
		WebElement round2 = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/ul/li[4]/ul/li[5]/a"));

		Actions are = new Actions(driver);
		are.moveToElement(round).build().perform();
		are.moveToElement(round2).perform();
		round2.click();
	}

}

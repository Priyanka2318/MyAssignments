package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234123412");
		driver.findElement(By.id("password_step_input")).sendKeys("test@1234");

		WebElement dayele = driver.findElement(By.id("day"));
		Select day = new Select(dayele);
		day.selectByVisibleText("8");

		WebElement monthele = driver.findElement(By.id("month"));
		Select month = new Select(monthele);
		month.selectByVisibleText("Feb");

		WebElement yearele = driver.findElement(By.id("year"));
		Select year = new Select(yearele);
		year.selectByVisibleText("1998");

		driver.findElement(By.xpath("//input[@name='sex']")).click();


	}

}

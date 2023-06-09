package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acmelogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		driver.close();


	}

}

package secondMarathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderMobile {

	public static void main(String[] args) throws InterruptedException, IOException {
//		ChromeOptions ch = new ChromeOptions();
//		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev31913.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("q+NozS5Qe8!E");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(4000);
		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(15);
		WebElement all = dom.findElementByXPath("//div[@id='all']");
		all.click();
		dom.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement frame1 = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("(//span/h2)[8]")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 6s']")).click();
		WebElement color = driver.findElement(By.name("IO:60b15e33d7033100a9ad1e173e24d4a3"));
        Select color1 = new Select(color);
		color1.selectByVisibleText("Gold");
		WebElement storage = driver.findElement(By.name("IO:e0b15e33d7033100a9ad1e173e24d4a1"));
		Select storage1 = new Select(storage);
		storage1.selectByVisibleText("128GB [add $50.00]");
		WebElement order = driver.findElement(By.id("oi_order_now_button"));
		Actions movetoele = new Actions(driver);
		movetoele.moveToElement(order);
		order.click();
		WebElement confirmation = driver.findElement(By.xpath("//span[contains(text(),'submitted')]"));
		String text = confirmation.getText();
		System.out.println(text);
		WebElement id = driver.findElement(By.xpath("//a[@id='requesturl']"));
		String text2 = id.getText();
		System.out.println(text2);
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File Path = new File("./snap/order.png");
		FileUtils.copyFile(screenshot, Path);
		
	}

}

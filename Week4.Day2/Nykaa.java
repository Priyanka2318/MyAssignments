package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.nykaa.com/");
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(brand).perform();
		driver.findElement(By.id("brandSearchBox")).click();
		driver.findElement(By.xpath("(//div[@class='css-150nd8c']/a)[6]")).click();
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris")) {
			System.out.println(title);
		}else {
			System.out.println("Title doesn't contain L'Oreal Paris");
		}
		driver.findElement(By.xpath("//button[@class=' css-1aucgde']")).click();
		driver.findElement(By.xpath("(//label[@class='control control-radio']/div)[8]")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[12]")).click();
		WebElement prodname = driver.findElement(By.xpath("//div[@class='css-xrzmfa']"));
		String text = prodname.getText();
		if(text.contains("L'Oreal Paris")) {
			System.out.println("Filter is applied with Shampoo");
		}else {
			System.out.println("Filter is not applied with Shampoo");
		}
		Thread.sleep(4000);
		prodname.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win = new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		WebElement mrp = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]"));
		String mrp1 = mrp.getText();
		System.out.println("MRP: "+mrp1);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		driver.switchTo().frame(0);
		WebElement grandtotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']"));
		String grandtotal1 = grandtotal.getText();
		System.out.println("GrandTotal: "+grandtotal1);
		Thread.sleep(3000);
		WebElement proceed = driver.findElement(By.xpath("(//button[@class='css-1h4559r e8tshxd0'])[2]"));
		proceed.click();
		driver.quit();


	}

}

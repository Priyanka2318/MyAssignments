package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.click();
		search.sendKeys("oneplus 9 pro");
		search.sendKeys(Keys.ENTER);
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String text = price.getText();
		System.out.println("The Price is "+text);
		WebElement rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
		String cusrat = rating.getText();
		System.out.println("The Rating is "+cusrat);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winhan = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winhan.get(1));
		File ss = driver.getScreenshotAs(OutputType.FILE);
		File path = new File("./snap/amazon.png");
		FileUtils.copyFile(ss, path);
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(4000);
		WebElement sub = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		String subtotal = sub.getText();
		String nosym = subtotal.replaceAll("₹", "");
		String onlyno = nosym.replaceAll(".00", "");
		Thread.sleep(4000);
		System.out.println("The subtotal is "+onlyno);
		if(text.equalsIgnoreCase(onlyno)) {
			System.out.println("Price is correct");
		}else {
			System.out.println("Price is not correct");
		}

	}

}

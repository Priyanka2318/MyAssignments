package week4.day2;

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

public class SnapDeal {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions op = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.snapdeal.com/");
		WebElement men = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(men).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		WebElement count = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		String text = count.getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		WebElement fprice = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]"));
		String text2 = fprice.getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		WebElement sortedprice = driver.findElement(By.xpath("(//li[@class='search-li'])[1]"));
		sortedprice.click();
		String text3 = sortedprice.getText();
		System.out.println(text3);
		if(text2.equalsIgnoreCase(text3)) {
			System.out.println("Not Sorted");
		}else {
			System.out.println("Sorted by Price Low To High");
		}
		WebElement fromval = driver.findElement(By.xpath("//input[@name='fromVal']"));
		fromval.clear();
		fromval.sendKeys("400");
		WebElement toval = driver.findElement(By.xpath("//input[@name='toVal']"));
		toval.clear();
		toval.sendKeys("600");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(4000);
		WebElement color = driver.findElement(By.xpath("(//div[@class='filter-type-name lfloat'])[3]"));
		act.scrollToElement(color);
		WebElement colorfilter = driver.findElement(By.xpath("//span[@class='filter-color-tile Black ']"));
		Thread.sleep(4000);
		colorfilter.click();
		WebElement filter = driver.findElement(By.xpath("//div[@class='filters']"));
		String verifyfilter = filter.getText();
		System.out.println(verifyfilter);
		Thread.sleep(4000);
		WebElement result = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.moveToElement(result).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();

		WebElement cost = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		String costprice = cost.getText();
		System.out.println(costprice);
		WebElement disc = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		String dispercent = disc.getText();
		System.out.println(dispercent);
		Thread.sleep(4000);
		File ss = driver.getScreenshotAs(OutputType.FILE);
		File path = new File("./snap/shoes.png");
		FileUtils.copyFile(ss, path);
		driver.quit();
	}

}

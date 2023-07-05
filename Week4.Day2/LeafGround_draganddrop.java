package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGround_draganddrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node0zsycak31y1lb4d76b20wvtx1311979.node0");
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele1, 360, 0);
		WebElement target = driver.findElement(By.id("form:drop_header"));
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		act.dragAndDrop(source, target).perform();
		WebElement firstcol = driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt95']"));
		WebElement seccol = driver.findElement(By.xpath("(//span[text()='Category'])[1]"));
		act.dragAndDrop(seccol, firstcol).perform();
		Thread.sleep(4000);
		WebElement firstrow = driver.findElement(By.xpath("(//td[text()='Bamboo Watch'])[2]"));
		WebElement secrow = driver.findElement(By.xpath("(//td[text()='Black Watch'])[2]"));
		act.dragAndDrop(firstrow, secrow).perform();
	}

}

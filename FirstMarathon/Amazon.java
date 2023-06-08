package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"])[3]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")));
		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
	    driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
	    driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("a-autoid-0-announce")).click();
	    driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	    System.out.println(driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText());
	    System.out.println(driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText());
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    
		

	}

}

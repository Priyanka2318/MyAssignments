package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_Window {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win = new ArrayList<String> (windowHandles);
		driver.switchTo().window(win.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(win.get(0));		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Set<String> win1 = driver.getWindowHandles();
		System.out.println(win1.size());
		
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> close = driver.getWindowHandles();
		System.out.println(close.size());
		
		List<String> closeall = new ArrayList<String> (close);
		driver.switchTo().window(closeall.get(1));
		driver.close();
		driver.switchTo().window(closeall.get(2));
		driver.close();
		driver.switchTo().window(closeall.get(3));
		driver.close();
		driver.switchTo().window(closeall.get(4));
		driver.close();
		driver.switchTo().window(closeall.get(5));
		driver.close();
		
		driver.switchTo().window(closeall.get(0));
		System.out.println(driver.getTitle());
		
		
		///wait is pending
		
		
		
		
	}

}

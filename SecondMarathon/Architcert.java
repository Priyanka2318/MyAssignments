package secondMarathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Architcert {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		List<String> windowlist = new ArrayList<String>(windows);
		driver.switchTo().window(windowlist.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow shadowele = new Shadow(driver);
		shadowele.findElementByXPath("//span[text()='Learning']").click();
		Thread.sleep(3000);
		WebElement learn = shadowele.findElementByXPath("//span[text()='Learning on Trailhead']");
		WebElement sales = shadowele.findElementByXPath("//a[text()='Salesforce Certification']");
		Actions mouseaction = new Actions(driver);
		mouseaction.moveToElement(learn).moveToElement(sales).click().perform();
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		WebElement text = driver.findElement(By.xpath("//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']"));
        String content = text.getText();
        System.out.println(content);
        List<WebElement> certificatelist = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
        for(int i=0;i<certificatelist.size();i++) {
        	System.out.println(certificatelist.get(i).getText());
		}
        driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
        List<WebElement> arccertificatelist = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
        for(int i=0;i<arccertificatelist.size();i++) {
			System.out.println(arccertificatelist.get(i).getText());
		}
        Thread.sleep(4000);
        WebElement screen1 = driver.findElement(By.xpath("//a[text()='Platform App Builder']"));
        mouseaction.moveToElement(screen1).perform();
        File ss1 = driver.getScreenshotAs(OutputType.FILE);
		File path1 = new File("./snap/snap1.png");
		FileUtils.copyFile(ss1, path1);
		
		Thread.sleep(5000);
		WebElement screen2 = driver.findElement(By.xpath("(//a[text()='Sharing and Visibility Architect'])[2]"));
        mouseaction.moveToElement(screen2).perform();
        File ss2 = driver.getScreenshotAs(OutputType.FILE);
		File path2 = new File("./snap/snap2.png");
		FileUtils.copyFile(ss2, path2);
	}

}

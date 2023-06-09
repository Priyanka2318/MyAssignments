package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement company = driver.findElement(By.id("updateLeadForm_companyName"));
		company.clear();
		company.sendKeys("TCS");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		WebElement com = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String companyname = com.getText();
		System.out.println(companyname);
		if(companyname.contains("TCS")) {
			System.out.println("Company Name changed successfully");
		}
		else {
			System.out.println("Not Changed");
		}

		driver.close();

	}

}

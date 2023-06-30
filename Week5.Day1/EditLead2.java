package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditLead2 extends BaseLeadClass {
	@Test
	public void main() throws InterruptedException {
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
	}

}

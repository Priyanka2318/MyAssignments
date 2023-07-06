package week5.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DuplicateLead2 extends BaseLeadClass {
	@Test
	public void main() throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailAddress")).sendKeys("xyadsd@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']"));
		String firstname = name.getText();
		System.out.println(firstname);
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement dupname = driver.findElement(By.id("viewLead_firstName_sp"));
		String dup = dupname.getText();
		System.out.println(dup);

		if(firstname.equals(dup)) {
			System.out.println("Duplicated lead name is same as captured name");
		}else {
			System.out.println("Duplicated lead name is not same as captured name");
		}


	}

}

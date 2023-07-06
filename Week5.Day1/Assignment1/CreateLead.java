package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@Test
	public void createlead() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Private Limited");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanka");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkatesan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priyankv");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Operations");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing the create lead functionality");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyanka@gmail.com");

		WebElement stateele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateele);
		state.selectByVisibleText("New York");

		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);



	}

}

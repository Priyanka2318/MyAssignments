package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact extends BaseLeadClass{
	@Test
	public void main() {
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Priyanka");
		driver.findElement(By.id("lastNameField")).sendKeys("Venkatesan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Priyanka");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("V");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CS");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Testing the create contact functionality");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Priyanka@gmail.com");

		WebElement stateeleme = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(stateeleme);
		state.selectByVisibleText("New York");

		driver.findElement(By.xpath("(//Div[@class='fieldgroup-body'])//input[@class='smallSubmit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important note validation");
		driver.findElement(By.xpath("(//Div[@class='fieldgroup-body'])//input[@name='submitButton']")).click();

		String title = driver.getTitle();
		System.out.println(title);

	}

}

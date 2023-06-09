package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
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

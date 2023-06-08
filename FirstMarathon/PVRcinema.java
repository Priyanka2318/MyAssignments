package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRcinema {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@class='p-element ng-tns-c73-1 p-autocomplete-input p-inputtext p-component p-autocomplete-dd-input ng-star-inserted']")).click();
		driver.findElement(By.xpath("(//a[@class='thumnail clearfix'])[4]/img")).click();
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();

		WebElement cityele = driver.findElement(By.xpath("//select[@name='city']"));
		Select city = new Select(cityele); 
		city.selectByVisibleText("Chennai");

		Thread.sleep(4000);
		WebElement genreele = driver.findElement(By.xpath("//select[@name='genre']"));
		Select genre = new Select(genreele);
		genre.selectByVisibleText("ANIMATION");

		WebElement langele = driver.findElement(By.xpath("//select[@name='lang']"));
		Select lang = new Select(langele);
		lang.selectByVisibleText("ENGLISH");

		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='info']/preceding-sibling::div)[1]")).click();
		driver.findElement(By.xpath("//div//button[text()='Proceed To Book']")).click();

		WebElement cinemaele = driver.findElement(By.xpath("//select[@name='cinemaName']"));
		cinemaele.click();
		Select cinema = new Select(cinemaele);
		cinema.selectByVisibleText("PVR Velachery Chennai");


		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']/input")).click();
		WebElement firstmovie = driver.findElement(By.xpath("(//div[@class='main-calendar-days']/span)[18]"));
		firstmovie.click();


		WebElement showtime = driver.findElement(By.xpath("//select[@name='timings']"));
		showtime.click();
		Select show = new Select(showtime);
		show.selectByVisibleText("09:00 AM - 12:00 PM");

		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Priyamani");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("priya@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9898989796");

		WebElement foodele = driver.findElement(By.xpath("//Select[@name='food']"));
		Select food = new Select(foodele);
		food.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("tickets");

		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.xpath("(//button[@class='btn already-member'])[4]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='swal2-content']")).getText());
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();

		String title = driver.getTitle();
		System.out.println(title);

	}

}

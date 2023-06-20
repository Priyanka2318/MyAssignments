package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.linkText("Bus")).click();
		WebElement source = driver.findElement(By.xpath("//input[@id='source']"));
		source.click();
		source.sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		Thread.sleep(4000);
		WebElement des = driver.findElement(By.xpath("(//input[@class='form-control border-0 mb-0 ui-autocomplete-input'])[2]"));
		des.click();
		des.sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("(//a[text()='21'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		WebElement busname = driver.findElement(By.xpath("(//h2[@class='TravelAgntNm ng-binding'])[1]"));
		System.out.println(busname.getText());
		driver.findElement(By.xpath("(//input[@name='Bustypes'])[4]")).click();
		WebElement seatcount = driver.findElement(By.xpath("(//p[@class='noseats AvailSts ng-binding'])[1]"));
		System.out.println(seatcount.getText());
		driver.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[1]")).click();
		WebElement sel = driver.findElement(By.xpath("//span[@id='seatnos']"));
		System.out.println(sel.getText());
		WebElement fare = driver.findElement(By.xpath("//span[@id='ticketfare']"));
		System.out.println(fare.getText());
		WebElement board = driver.findElement(By.xpath("//select[@name='boardingpoint_id']"));
		Select bp = new Select(board);
		bp.selectByIndex(1);
		WebElement drop = driver.findElement(By.xpath("//select[@name='droppingpoint_id']"));
		Select dp = new Select(drop);
		dp.selectByIndex(1);
		System.out.println(driver.getTitle());
		driver.close();

	}

}

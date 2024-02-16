package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("firstname")).sendKeys("Kruthiga");
		driver.findElement(By.name("lastname")).sendKeys("L");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]//following-sibling::input")).sendKeys("9790919268");
		driver.findElement(By.id("password_step_input")).sendKeys("xx9121as");
		WebElement wb=driver.findElement(By.name("birthday_day"));
		Select op=new Select(wb);
		op.selectByValue("12");
		WebElement wb1=driver.findElement(By.name("birthday_month"));
		Select op1=new Select(wb1);
		op1.selectByValue("9");
		WebElement wb2=driver.findElement(By.name("birthday_year"));
		Select op2=new Select(wb2);
		op2.selectByVisibleText("1991");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.close();
	}

}

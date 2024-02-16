package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String st= driver.getTitle();
		
		if(st.contains("Leaftaps"))
		{
			System.out.println("Login successfull");
		}
		else
		{
			System.out.println("Login is not successfull");
		}
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kruthiga");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("L");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kruthiga");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Manual");
		WebElement wb1=driver.findElement(By.id("createLeadForm_description"));
		wb1.sendKeys("3 years of experience");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kru98log@gmail.com");
		WebElement wb=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select st1=new Select(wb);
		st1.selectByVisibleText("New York");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Learning Selenium");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String st2=driver.getTitle();
		if(st2.contains("View"))
		{
			System.out.println("Title of the page"+st2);
		}
		else
		{
			System.out.println("Title is not correct");
		}
		
		driver.close();
		
	}

}

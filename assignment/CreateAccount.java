package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("Kruthiga12");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		WebElement b=driver.findElement(By.name("industryEnumId"));
		Select opt=new Select(b);
		opt.selectByIndex(3);
		WebElement ab=driver.findElement(By.name("ownershipEnumId"));
		Select op=new Select(ab);
		op.selectByVisibleText("S-Corporation");
		WebElement ab1=driver.findElement(By.name("dataSourceId"));
		Select opt1=new Select(ab1);
		opt1.selectByValue("LEAD_EMPLOYEE");
		WebElement ab11=driver.findElement(By.id("marketingCampaignId"));
		Select opt11=new Select(ab11);
		opt11.selectByIndex(6);
		WebElement ab2=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select opt2=new Select(ab2);
		opt2.selectByValue("TX");
		Thread.sleep(3000);
		driver.findElement(By.className("smallSubmit")).click();
		String s=driver.findElement(By.xpath("//span[contains(text(),'Kruthiga')]")).getText();
		if(s.contains("Kruthiga"))
		{
			System.out.println("Account name is correct");
		}
		else
		{
			System.out.println("Account name is incorrect");
		}
		driver.close();
		
	}

}

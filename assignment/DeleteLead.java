package week2.day2.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		WebElement wb=driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
		wb.clear();
		wb.sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("044");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99988877");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String k = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//System.out.println(k);
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Lead ID')]/following::input[@name='id']")).sendKeys(k);		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String s2=driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(s2);
		if(s2.contains("No records"))
		{
			System.out.println("Record deleted succesfully");
		}
		else
		{
			System.out.println("Record present");
		}
		driver.close();
	}

}

package week2.day2.assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Basic Checkbox.”
		WebElement wb=driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[1]"));
		wb.click();
		//"Notification Checkbox."
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).click();
		Thread.sleep(2000);
		String st=driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();
		if(st.contains("Checked"))
		{
		System.out.println("Notification is checked");
		}
		else
		{
			System.out.println("Notification not checked");
		}
		// favorite language
		driver.findElement(By.xpath("//input[@value='java']/parent::div[@class='ui-helper-hidden-accessible']//following-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Python']//preceding-sibling::div")).click();
		//"Tri-State Checkbox
		driver.findElement(By.xpath("//input[@name=\"j_idt87:ajaxTriState_input\"]/parent::div/following-sibling::div")).click();
		String st1=driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();
		if(st1.contains("State = 1"))
		{
			System.out.println("state is 1");
		}
		else
		{
			System.out.println("State is not 1");
		}
		//Toggle Switch.
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']/parent::div")).click();
		String st2=driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();
		if(st2.contains("Checked"))
		{
		System.out.println("toggle is checked");
		}
		else
		{
			System.out.println("toggle not checked");
		}
		//Checkbox is disabled
		driver.findElement(By.xpath("//div[@class='card']/div[@role='combobox']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Select All']/parent::div[@class='ui-helper-hidden-accessible']/following-sibling::div")).click();
		
		driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
	}

}

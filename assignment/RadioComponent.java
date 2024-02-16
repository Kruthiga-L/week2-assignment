package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioComponent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//'Your most favourite browser
		WebElement wb=driver.findElement(By.xpath("//label[@for='j_idt87:console1:3' and text()='Edge']/preceding-sibling::div//span"));
		wb.click();
		Thread.sleep(2000);
		wb.click();
		//verify that it becomes ‘unselected’.
		if(wb.isSelected()==false)
		{
			System.out.println("Radio button is unselected");
		}
		else
		{
			System.out.println("Radio Button is selected");
		}
		WebElement wb1=driver.findElement(By.xpath("//label[@for='j_idt87:console2:2' and text()='Safari']/preceding-sibling::div//span"));
		if(wb1.isEnabled()==true)
		{
		System.out.println("Default button is selected");
		}
		else
		{
			System.out.println("Default is not selected");
		}
		WebElement wb2=driver.findElement(By.xpath("//label[@for='j_idt87:age:1' and text()='21-40 Years']/preceding-sibling::div//span"));
		if(wb2.isEnabled()==true)
		{
		System.out.println("age group (21-40 Years) is selected");
		}
		else
		{
		wb2.click();
		}
		driver.close();
		
	}

}

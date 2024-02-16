package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt90']/span")).click();
		String s=driver.getTitle();
		if(s.contains("Dashboard"))
		{
			System.out.println("Title of the page: "+s);
		}
		else
		{
			System.out.println("not found");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
		System.out.println("Confirm if the button is disabled: "+driver.findElement(By.xpath("//h5[contains(text(),'Confirm if the button is disabled')]")).isEnabled());
		System.out.println("Position of the button Submit: "+driver.findElement(By.xpath("//button[@name='j_idt88:j_idt94']//span[text()='Submit']")).getLocation());
		//WebElement wb=driver.findElement(By.name("j_idt88:j_idt96"));
		//String st=wb.getCssValue("background-color");
		System.out.println("Background color of the Find the Save button color:"+driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background-color"));
		WebElement wb1=driver.findElement(By.name("j_idt88:j_idt98"));
		System.out.println("Height and width of the button"+wb1.getSize());
		driver.close();
	}

}

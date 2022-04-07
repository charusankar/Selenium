package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/button")).click();
		//String alerttext = driver.switchTo().alert().getText();
		//System.out.println(alerttext);
		driver.switchTo().alert().sendKeys("Charu");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}

}

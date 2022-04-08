package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.redcoachusa.com/texas/?gclid=CjwKCAjw9LSSBhBsEiwAKtf0nyFJw0MnHHKJcR8iwt6sfC1lIvcg9j9gb-LTJcQlx6N87J97Fpwd5BoCbXUQAvD_BwE");
driver.manage().window().maximize();
WebElement para = driver.findElement(By.xpath("//p[text()='Where can we take you?']"));
Actions actions= new Actions(driver);
actions.moveToElement(para);
actions.perform();
WebElement radio = driver.findElement(By.xpath("//label[@data-trip='round']"));
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("arguments[0].click()", radio);
driver.findElement(By.xpath("//input[@id='departure-selectized']")).sendKeys("d");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@id='departure-selectized']")).sendKeys(Keys.ARROW_DOWN);
//Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='departure-selectized']")).sendKeys(Keys.ENTER);

	}

}

package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//Single Select
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Select Country = new Select(driver.findElement(By.name("country")));
		Country.selectByIndex(3);
		Country.selectByValue("INDIA");
		//Multi-select
		driver.navigate().to("https://output.jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByIndex(1);
		fruits.selectByValue("banana");
		fruits.selectByVisibleText("Orange");
	}

}

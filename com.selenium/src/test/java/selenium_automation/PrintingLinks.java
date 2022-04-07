package selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	List<WebElement> alltags= driver.findElements(By.tagName("a"));
	System.out.println(alltags.size());
	for(int i=0;i<alltags.size();i++)
	{
		System.out.println(alltags.get(i).getAttribute("href"));
		System.out.println(alltags.get(i).getText());
	}
	
	}

}

package selenium_automation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {
	public static String browser = "Chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		} else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get("https://busboomgroup.myresman.com/Portal/Access/SignIn?pid=b5ac2f9c-3b76-4c6c-983c-864d4cf8f61d");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.thedistrictatcypresswaters.com/residents");
		driver.findElement(By.xpath("//*[@id=\"content_9317\"]/div/p/a")).click();
		Set<String> Windowhandles= driver.getWindowHandles();
		System.out.println(Windowhandles);
		/*driver.navigate().to("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		List<WebElement> Webelements= driver.findElements(By.xpath("//div[@class=\'inventory_list\']/div"));
		System.out.println(Webelements);
		/*String str= driver.getCurrentUrl();
		System.out.println(str);
		String title= driver.getTitle();)
		System.out.println(title);
		String Pagesource=driver.getPageSource();
		System.out.println(Pagesource);
		driver.close();*/
	}

}

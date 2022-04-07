package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://busboomgroup.myresman.com/Portal/Access/SignIn?pid=b5ac2f9c-3b76-4c6c-983c-864d4cf8f61d");
		driver.findElement(By.id("Username")).sendKeys("ramkumarpadmaraj");
		driver.findElement(By.id("Password")).sendKeys("pras@1986");
		driver.findElement(By.id("SignInButton")).click();
	}
	}



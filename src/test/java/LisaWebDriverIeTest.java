


import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;


public class LisaWebDriverIeTest {
	static WebDriver driver ;//= new ChromeDriver();

	public LisaWebDriverIeTest() {
		//File file = new File("C:/Selenium/iexploredriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		//driver = new InternetExplorerDriver();
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","E:\\Sandeep\\projects\\hcl-projects\\lisa\\lisa-hcl-test\\webdriver\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		String search_text = "Google Search";
		WebElement search_button = driver.findElement(By.name("btnK"));
		String text = search_button.getAttribute("value");
		WebElement searchInput = driver.findElement(By.id("lst-ib"));
		searchInput.sendKeys("test");
		search_button.click();
		
		Assert.assertEquals(text, search_text, "Text not found!");
	}



	
}

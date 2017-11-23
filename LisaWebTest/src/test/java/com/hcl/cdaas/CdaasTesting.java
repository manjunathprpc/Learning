package com.hcl.cdaas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CdaasTesting extends LisaWebDriverBase {

	
	public CdaasTesting(String browserType) {
		super(browserType);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
	
		CdaasTesting chromeDriver=new CdaasTesting("chrome");
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Downloads\\lisa-hcl-test-20171116T131749Z-001\\lisa-hcl-test\\src\\test\\java\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
		String baseURL="http://34.208.33.131:8780/prweb";
		driver.get(baseURL);*/
		//driver.manage().window().maximize();
		chromeDriver.testLogin();
		chromeDriver.flowTesting();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.close();
		
		
		}

	private void testLogin() {
		
		goToUrl("http://34.235.52.21:8780/prweb");
		sendKeysToField(By.name("UserIdentifier"),"shaikmanu@hcl.com");
		sendKeysToField(By.name("Password"),"rules");
		clickButtonByXpath("//*[@id=\"sub\"]/span");
		
		String expectedTitle = "Case Worker";
        String actualTitle = "";

        // get the actual value of the title
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		
	}
	
	private void flowTesting() {
		
		WebElement btn= driver.findElement(By.className("menu-item-image-wrapper"));
		btn.click();
		/*clickButtonByXpath("//*[@id=\"$PpyNavigation1511433648237$ppyElements$l1\"]/li[3]/a/span/span");
		clickButtonByXpath("//*[@id=\"ApplicationName\"]");*/
	}
}
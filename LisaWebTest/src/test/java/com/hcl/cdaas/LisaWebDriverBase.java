package com.hcl.cdaas;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public abstract class LisaWebDriverBase {
	static WebDriver driver;// = new ChromeDriver();

	public LisaWebDriverBase(String browserType) {
		if (browserType == "ie") {
			initializeIE();
		} else if (browserType == "chrome"){
			initializeChrome();
		}
	}
	

	protected void initializeIE() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\manju\\Downloads\\lisa-hcl-test-20171116T131749Z-001\\lisa-hcl-test\\src\\test\\java\\driver\\IEDriverServer.exe");
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		driver = new InternetExplorerDriver(ieCapabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	protected void initializeChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Downloads\\lisa-hcl-test-20171116T131749Z-001\\lisa-hcl-test\\src\\test\\java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	
	protected void sendKeysToField(By findName, String sendKeys) {
		WebDriverWait wait = getWait();
		WebElement findElement = driver.findElement(findName);
		WebElement searchInput = wait.until(ExpectedConditions.visibilityOf(findElement));
		searchInput.sendKeys(sendKeys);
	}
	
	protected void sendKeysToField(By findName, Keys sendKeys) {
		WebDriverWait wait = getWait();
		WebElement findElement = driver.findElement(findName);
		WebElement searchInput = wait.until(ExpectedConditions.visibilityOf(findElement));
		searchInput.sendKeys(sendKeys);
	}

	protected void testTextLinkExists(String linkTxt) {
		WebElement newsLinkTextElement = driver.findElement(By.linkText(linkTxt));
		String newsLinkText = newsLinkTextElement.getText();
		Assert.assertEquals(linkTxt, newsLinkText, linkTxt + " Text not found!");
	}

	protected void clickLink(String linkTxt) {
		WebDriverWait wait = getWait();
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkTxt)));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", link);
		//link.click();
	}


	private WebDriverWait getWait() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		return wait;
	}
	protected void clickLink(By byLinkTxt) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(byLinkTxt));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", link);
		//link.click();
	}
	
	protected void moveToElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement stateElement = wait.until(ExpectedConditions.elementToBeClickable(by));
	    Actions actions1=new Actions(driver);
	    actions1.moveToElement(stateElement);
	}

	protected void clickButtonByXpath(String xpath) {
		WebElement btn = driver.findElement(By.xpath(xpath));
		btn.click();
	}

	protected void goToUrl(String url) {
		driver.get(url);
	}

	protected void scrollByPixels(String pixels) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+pixels+")", "");
	}
	
	
}

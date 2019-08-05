package Cucumber_Selenium.Cucumber_Selenium;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) throws Exception {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resource\\com\\maven\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			
			} 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static boolean elementIsDisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	  public void highlightOnElement (WebElement element)
	  {
      try{
	  waitforElementVisibility(element);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",element);}
	  catch (Exception e)
	  {
		  e.printStackTrace();
		  throw new  RuntimeException();
	  }
	  }

	  public static void getURl(String url)
	  {
		try{
			driver.get(url);
		}catch (Exception e){
		e.printStackTrace();
		throw new RuntimeException();
		}
	  }
	public static boolean elementIsEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void waitforElementVisibility(WebElement element) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 60);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void inputValuestoWebelement(WebElement element, String value) {
		try {
			waitforElementVisibility(element);
			if (elementIsDisplayed(element) && elementIsEnabled(element)) {
				element.sendKeys(value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void clickonWebelement(WebElement element) {
		try {
			waitforElementVisibility(element);
			if (elementIsDisplayed(element)) {
				element.click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}
	
	public static void takeScreeshot(String  filename) throws Exception
	{
		try{
		
		File des=new File(System.getProperty("user.dir")+filename+".png");
		TakesScreenshot  ts=(TakesScreenshot)driver;  //taking screenshot
		 
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, des);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	
	
	public static void mouseHover(WebElement element1,WebElement element2) throws Exception
	{

		try{
		waitforElementVisibility(element1);
		waitforElementVisibility(element2);
			
		WebElement woman=element1;
		WebElement blouse = element2;
			
		Actions mov=new Actions(driver);
		mov.moveToElement(woman).build().perform();
		mov.click(blouse).build().perform();
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException();
	}
		
	}

}

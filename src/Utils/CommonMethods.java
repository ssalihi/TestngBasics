package Utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	public static WebDriver driver;//...3
	public static void setUpDriver(String browser, String url) {//......4 passing parameter
		if(browser.equalsIgnoreCase("chrome")) {//.....step 5
			
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "src/drivers./chromedriver.exe");
		 driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {//...step 6
		//System.setProperty("webdriver.gecko.driver", "C:/Users/Sekander Salihi/Selenium/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "src/drivers/geckodriver.exe");//...1
		 driver=new FirefoxDriver();//...2
		}else {
			System.out.println("Given brower in wrong");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().fullscreen();
		driver.get(url);
	driver.manage().window().maximize();

	}

	/**
	 * This method will select a specified value from a drop down
	 * @author Syntax 
	 * @param Select element, String text
	 */
	public static void selectValueFromDD(WebElement element, String text) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		boolean isSelected=false;
		for (WebElement option : options) {
			String optionText = option.getText();
			if (optionText.equals(text)) {
				select.selectByVisibleText(text);
				System.out.println("Option with text "+text+" is selected");
				isSelected=true;
				break;
			} else {
				System.out.println("Option with text " + text + " is not available");
			}
		}
		if(!isSelected) {
			System.out.println("Option with text +"+text+"is not available");
		}
	}

	/**
	 * This method will select a specified value from a drop down by its index
	 * @author Syntax 
	 * @param Select element, int index
	 */
	public static void selectValueFromDD(WebElement element, int index) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
	}
public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
/**
 * Method will accept alert
 * @throws NoAlertPresentException if alert is not present
 */
	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert was not present");
		}
	}
	/**
	 * Method will dismiss alert
	 * @throws NoAlertPresentException if alert is not present
	 */
	public static void dismissAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}catch (NoAlertPresentException e) {
			System.out.println("Alert was not present");
		}
	}
	/**
	 * Method will get text of an alert
	 * @throws NoAlertPresentException if alert is not present
	 * @return String text
	 */
	public static String getAlertText() {

		try {
			Alert alert=driver.switchTo().alert();
			return alert.getText();
		}catch (NoAlertPresentException e) {
			System.out.println("Alert was not present");
			return null;
		}

	}
	/**
	 * Method that will switch control to the specified frame
	 * @param frame id or frame name
	 */
	public static void switchToFrame(String idOrName) {
		try {
			driver.switchTo().frame(idOrName);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	/**
	 * Method that will switch control to the specified frame
	 * @param frame element
	 */
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	/**
	 * Method that will switch control to the specified frame
	 * @param frame index
	 */
	public static void switchToFrame(int index) {
		
		try {
			driver.switchTo().frame(index);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	public static void takeScreenshot(String folderName, String fileName) {
		TakesScreenshot ts=(TakesScreenshot)driver;
        File scr=ts.getScreenshotAs(OutputType.FILE);
        
        try {
			FileUtils.copyFile(scr, new File("screenshots/"+folderName+"/"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to take screesnhot");
		}
	}
	public static void scrollDown( int pixels) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+pixels+")");
		
	}
	public static void scrollUp(int pixels) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-"+pixels+")");
	}
	public static void jsClikc(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
}
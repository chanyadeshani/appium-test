package appiumtest;

import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class AppiumiOSTest {
	
	private IOSDriver driver;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion", "11.3"); //Replace this with your iOS version
		caps.setCapability("deviceName", "iPhone X"); //Replace this with your simulator/device version
		caps.setCapability("app", "/Users/chanyadeshani/Downloads/UICatalog.app"); //Replace this with app path in your system
		caps.setCapability("automationName", "XCUITest");
		driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	}
	
	@Test
	public void testiOS() throws InterruptedException {
//		driver.findElement(By.xpath("//XCUIApplication[1]/XCUIWindow[2]/XCUITableView[1]/XCUITableCell[1]/XCUIStaticText[1]")).click();
		driver.findElement(By.name("Buttons")).click();
		driver.findElement(By.name("Back")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
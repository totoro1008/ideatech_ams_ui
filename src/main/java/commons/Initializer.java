package commons;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Initializer 
{
	public static ChromeDriver driver;
	
	@SuppressWarnings("deprecation")
	public Initializer() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		this.driver=new ChromeDriver(dc);
		
	}
	
	public void launchChrome () {
		driver.get("http://118.178.93.238:48080/ams/login/login.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	public void login(String usrname,String pwd) {
	    //System.out.println(driver.getWindowHandle());
	    driver.findElementByXPath("//*[@id='username']").sendKeys(usrname);
	    driver.findElementByXPath("//*[@id='password']").sendKeys(pwd);
	    driver.findElementByXPath("/html/body/div/div[2]/div[3]/p[4]/input").click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
	}
	
}

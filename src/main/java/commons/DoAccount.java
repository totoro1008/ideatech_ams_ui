package commons;


import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.language.bm.Lang;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

public class DoAccount {

	public Initializer initializer;
	
	public DoAccount() {
		this.initializer=new Initializer();
	}
	// 打开AMS登录页
    public void toLoginPage(String usrname,String pwd) {
    	   initializer.launchChrome();
    	   initializer.login(usrname, pwd);
    	}
    
    // 打开对公报备管理页
    @SuppressWarnings("static-access")
	public void toAcctMgmtMenu() {
    	   initializer.driver.findElement(By.cssSelector("img[src='../css/icons/icon-3.png']")).click();
    	   //initializer.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	   //initializer.driver.findElement(By.cssSelector("a[_href='company/gridQueryAccounts.html?code=zhsqNoCheck']")).click();
    	   WebElement menu1=initializer.driver.findElement(By.cssSelector("img[src='../css/icons/icon-3.png']"));
    	   WebElement menu1_1=initializer.driver.findElement(By.cssSelector("a[_href='company/gridQueryAccounts.html?code=zhsqNoCheck']"));
    	   new Actions(initializer.driver).click(menu1).moveToElement(menu1_1).click().perform();  
    }
    	   
    	   
    
    // 打开基本户开户页
    public void toBasicAcctPage() {
    	   //initializer.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	   //new WebDriverWait(initializer.driver,20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframe#ifame"));
    	   //WebElement frame = initializer.driver.findElement(By.cssSelector("iframe#ifame"));
       initializer.driver.switchTo().frame("ifame");
    	   WebElement menu1 = initializer.driver.findElementByXPath("/html/body/div[1]/div[2]/div[2]/div/div/div[1]/img");
 	   //WebElement menu1_1 = initializer.driver.findElement(By.cssSelector("html body.dhxwins_vp_dhx_terrace.dhxlayout_base_dhx_terrace div.dhx_toolbar_poly_dhx_terrace.dhxtoolbar_icons_18 table.buttons_cont tbody tr.tr_btn td.td_btn_txt div.btn_sel_text"));
    	   //new Actions(initializer.driver).click(menu1).moveToElement(menu1_1).click().perform();
    	   
    	   
    }
}

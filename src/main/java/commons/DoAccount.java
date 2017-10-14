package commons;


import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

import java.awt.AWTException;
import java.text.SimpleDateFormat; 

public class DoAccount {

	public Initializer initializer;
	private String usrname;
	private String pwd;
	
	public DoAccount(String usrname,String pwd) {
		this.initializer=new Initializer(usrname,pwd);
	}

    // 打开对公报备管理页
	public void toAcctMgmtMenu() {
    	   initializer.driver.findElement(By.cssSelector("img[src='../css/icons/icon-3.png']")).click();
    	   WebElement menu1=initializer.driver.findElement(By.cssSelector("img[src='../css/icons/icon-3.png']"));
    	   WebElement menu1_1=initializer.driver.findElement(By.cssSelector("a[_href='company/gridQueryAccounts.html?code=zhsqNoCheck']"));
    	   new Actions(initializer.driver).click(menu1).moveToElement(menu1_1).click().perform();  
    }
    	      	    
    // 打开基本户开户页
    public void toBasicAcctPage() {
       initializer.driver.switchTo().frame(1);
    	   WebElement menu1 = initializer.driver.findElementByXPath("/html/body/div[1]/div[2]/div[2]/div/div/div[1]/img");
 	   WebElement menu1_1 = initializer.driver.findElement(By.cssSelector("html body.dhxwins_vp_dhx_terrace.dhxlayout_base_dhx_terrace div.dhx_toolbar_poly_dhx_terrace.dhxtoolbar_icons_18 table.buttons_cont tbody tr.tr_btn td.td_btn_txt div.btn_sel_text"));
    	   new Actions(initializer.driver).click(menu1).moveToElement(menu1_1).click().perform();
    	   }
       
    // 填写并提交基本户开户表单
    public void submitBasicAcct() throws AWTException, InterruptedException {
    	   initializer.driver.switchTo().defaultContent();
    	   initializer.driver.switchTo().frame(2);
    	   //账户信息
    	   initializer.driver.findElementByName("acctNo").sendKeys(Long.toString(System.currentTimeMillis()));
    	   initializer.driver.findElementByName("bankCode").sendKeys("12345678");
    	   //工商注册信息
    	   initializer.driver.findElementByName("depositorName").sendKeys("J12345678901234");
    	   new Select(initializer.driver.findElementByName("depositorType")).selectByIndex(2);
    	   new Select(initializer.driver.findElementByName("regCountry")).selectByIndex(1);
    	   new Select(initializer.driver.findElementByName("regProvince")).selectByIndex(1);
    	   new Select(initializer.driver.findElementByName("regCity")).selectByIndex(1);
    	   new Select(initializer.driver.findElementByName("regArea")).selectByIndex(1);
    	   initializer.driver.findElementByName("regAddress").sendKeys("北京");
    	   initializer.driver.findElementByName("indusRegArea").sendKeys("北京");
    	   new Select(initializer.driver.findElementByName("industryCode")).selectByIndex(1);
    	   new Select(initializer.driver.findElementByName("regOffice")).selectByIndex(1);
    	   new Select(initializer.driver.findElementByName("regType")).selectByIndex(1);
    	   initializer.driver.findElementByName("regNo").sendKeys("12345678");
    	   new Select(initializer.driver.findElementByName("fileType")).selectByIndex(1);
    	   initializer.driver.findElementByName("fileNo").sendKeys("12345678");
    	   new Select(initializer.driver.findElementByName("isIdentification")).selectByIndex(1);
    	   initializer.driver.findElementByName("businessScope").sendKeys("businessScope");
    	   initializer.driver.findElementByName("businessScopeEccs").sendKeys("UI_AUTOMATION");
    	   //法人代表信息
    	   new Select(initializer.driver.findElementByName("legalType")).selectByIndex(1);
    	   initializer.driver.findElementByName("legalName").sendKeys("SpongeBob");
    	   new Select(initializer.driver.findElementByName("legalIdcardType")).selectByIndex(2);
    	   initializer.driver.findElementByName("legalIdcardNo").sendKeys("12345678");
    	   initializer.driver.findElementByName("legalIdcardToVoidDate").sendKeys(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    	   //组织机构代码证信息
    	   new Select(initializer.driver.findElementByName("orgType")).selectByIndex(1);
    	   new Select(initializer.driver.findElementByName("orgTypeDetail")).selectByIndex(2);
    	   initializer.driver.findElementByName("orgCodeToVoidDate").sendKeys(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    	   //税务登记信息
    	   initializer.driver.findElementByName("stateTaxToVoidDate").sendKeys(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    	   initializer.driver.findElementByName("taxRegNoToVoidDate").sendKeys(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    	   //联系信息
    	   initializer.driver.findElementByName("telephone").sendKeys("12345678");
    	   initializer.driver.findElementByName("zipCode").sendKeys("315000");
    	   //其他信息
    	   initializer.driver.findElement(By.cssSelector("input[value='选择']")).click();
    	   new Select(initializer.driver.findElementByName("industryCode1")).selectByIndex(2);
    	   initializer.driver.findElementByCssSelector("body > div.dhxwin_active > div.dhx_cell_wins div > div > div:nth-child(5) > div > div.dhxform_btn_filler").click();
    	   new Select(initializer.driver.findElementByName("corpScale")).selectByIndex(1);
    	   //上级机构信息
    	   initializer.driver.findElementByName("parLegalIdcardDate").sendKeys(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    	   initializer.driver.findElementByName("orgEccsToVoidDate").sendKeys(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    	   //授权经办人信息
    	   initializer.driver.findElementByName("agentTypeNoVoidDate").sendKeys(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    	   //提交
    	   initializer.driver.findElementByCssSelector(".dhx_cell_cont_layout > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)").click(); 
    	   //点击确定弹框
    	   //Robot robot = new Robot();
    	   //robot.keyPress(KeyEvent.VK_ENTER);
    	   //robot.keyRelease(KeyEvent.VK_ENTER);
    	   //initializer.driver.switchTo().defaultContent();
    	   Thread.sleep(500);
    	   initializer.driver.switchTo().alert().accept();
    	   //关闭开户页
    	   //initializer.driver.findElementByCssSelector("span[data-href='company/form.html?type=yiban|ACCT_OPEN'] + li").click();
    	   //initializer.driver.findElementByCssSelector("#min_title_list > li.active > i").click();
    }
       //新开户审核并上报
    public void checkAndSynch() throws InterruptedException
    {
    	   initializer.driver.switchTo().defaultContent();
    	   initializer.driver.findElementByXPath("/html/body/section/div[1]/div[1]/ul/li[2]/span").click();
    	   initializer.driver.switchTo().frame(1);
    	   initializer.driver.findElementByXPath("/html/body/div[1]/div[2]/div[3]/table/tbody/tr[1]/td/div[3]/i").click();
    	   initializer.driver.switchTo().defaultContent();
    	   initializer.driver.switchTo().frame(3);
    	   new Actions(initializer.driver).doubleClick(initializer.driver.findElementByXPath("/html/body/div[1]/div[2]/div[3]/table/tbody/tr[1]/td/div/div[2]/table/tbody/tr[2]")).perform();
    	   initializer.driver.switchTo().defaultContent();
    	   initializer.driver.switchTo().frame(4);
    	   //勾选上报人行账管系统、机构信用代码系统
    	   initializer.driver.findElementByXPath("/html/body/div[1]/div[2]/div[2]//div[5]//div[10]//fieldset//div[1]//div[1]/div[2]/div").click();
    	   initializer.driver.findElementByXPath("/html/body/div[1]/div[2]/div[2]//div[5]//div[10]//fieldset//div[2]//div[1]/div[2]/div").click();
    	   //审核并上报
    	   initializer.driver.findElementByCssSelector("div.dhx_cell_cont_layout:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)").click();
    	   //点击确认弹框
    	   Thread.sleep(500);
    	   initializer.driver.switchTo().alert().accept();
    }
       
}

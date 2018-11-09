package com.Screenfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Genericclass.Genericclass;

public class Admin_Page extends Genericclass
{
	
	@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Admin']")
	public static WebElement Tab_Admin;
	
	@FindBy(how=How.XPATH,using="//input[@name='uname']")
	public static WebElement Edi_Username;
	
	@FindBy(how=How.XPATH,using="//input[@name='pwd']")
	public static WebElement Edi_Password;
	
	@FindBy(how=How.XPATH,using="//input[@name='submitBtn']")
	public static WebElement Btn_Login;

    @FindBy(how=How.XPATH,using="//a[text()='Add staff member']")
    public static WebElement Btn_Staffmem;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_name']")
    public static WebElement Staff_name;
    
    @FindBy(how=How.XPATH,using="//input[@value='F']")
    public static WebElement gender;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_dob']")
    public static WebElement Dob;
    
    @FindBy(how=How.XPATH,using="//*[@name='staff_status']")
    public static WebElement relationship;
   
    @FindBy(how=How.XPATH,using="//*[@name='staff_dept']")
    public static WebElement Department;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_doj']")
    public static WebElement Date_join;
    
    
    @FindBy(how=How.XPATH,using="//*[@name='staff_address']")
    public static WebElement address;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_mobile']")
    public static WebElement mobile;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_email']")
    public static WebElement email;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_pwd']")
    public static WebElement passwod;
    
    @FindBy(how=How.XPATH,using="//input[@name='add_staff']")
    public static WebElement AddStaff_btn;
    
    
public static boolean clickOnAdmin(){
	boolean status=true;
	try
	{
		status=hoverandclick(Tab_Admin) ;
		
		if(status)
		{
			System.out.println("Clicked sucessfully on Admin Tab");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Admin Login']")));
		}
		
		
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	return status;
	}
}
package com.Testcases;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Genericclass.Genericclass;
import com.Screenfunctions.Admin_Page;import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Testcases extends Admin_Page {
	//Launching application
		@Given("launch the application") 
		public static void openbrowser(DataTable testdata)
		{
			
			List<List<String>> data=testdata.raw();
			System.out.println(data.get(0).get(0));
			System.out.println(data.get(0).get(1));
			
			String browser=data.get(0).get(0);
			String url = data.get(0).get(1);
	        
			invokeapplication(browser,url );
			
			System.out.println("Launching application");
			
		}
		
	//click on admintab
		
		@And("click on admintab")       
		
		public static void navigateToAdmintab()
		{
			
			Admin_Page ap = PageFactory.initElements(driver, Admin_Page.class);
			ap.clickOnAdmin();
		}
		
		//Admin login
		
	@And ("enter username, password")
		
		public static boolean Admin_login(DataTable testdata1 )
		{
			boolean status=true;
			try
			{	
				List<List<String>> data1 = testdata1.raw();
				System.out.println(data1.get(0).get(0));
				System.out.println(data1.get(0).get(1));
				
				String userid = data1.get(0).get(0);
				String pwd = data1.get(0).get(1);
				Edi_Username.sendKeys(userid);
				Edi_Password.sendKeys(pwd);
				Btn_Login.click();
				Btn_Staffmem.click();
			 
			}
	catch(Exception e)
			{
		System.out.println(e.getMessage());
	        }
		
			return false;
		}
     
	
	@Then ("add staff details")
	
	public static boolean add_staff(DataTable testdata2)
	
	{
		
		boolean status=true;
		try
		{	
		List<List<String>> data2 = testdata2.raw();
		System.out.println(data2.get(0).get(0));
		System.out.println(data2.get(0).get(1));
		System.out.println(data2.get(0).get(2));
		System.out.println(data2.get(0).get(3));
		System.out.println(data2.get(0).get(4));
		System.out.println(data2.get(0).get(5));
		System.out.println(data2.get(0).get(6));
		System.out.println(data2.get(0).get(7));
		System.out.println(data2.get(0).get(8));
		System.out.println(data2.get(0).get(9));
		
		
		String s1 = data2.get(0).get(0);
		String S2 = data2.get(0).get(1);
		String s3 = data2.get(0).get(2);
		String S4 = data2.get(0).get(3);
		String s5 = data2.get(0).get(4);
		String s6 = data2.get(0).get(5);
		String s7 = data2.get(0).get(6);
		String s8 = data2.get(0).get(7);
		String s9 = data2.get(0).get(8);
		String s10 = data2.get(0).get(9);
		
		Staff_name.sendKeys(s1);
		gender.click();
		Dob.sendKeys(s3);
		Select sc= new Select(relationship);
		sc.selectByVisibleText(S4);
		Select sc1 = new Select(Department);
		sc1.selectByVisibleText(s5);
		Date_join.sendKeys(s6);
		address.sendKeys(s7);
		mobile.sendKeys(s8);
		email.sendKeys(s9);
		passwod.sendKeys(s10);
		AddStaff_btn.click();
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return status;
		}
		
	
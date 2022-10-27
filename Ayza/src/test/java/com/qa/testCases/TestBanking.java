package com.qa.testCases;

import org.testng.annotations.Test;

import com.qa.pages.BaseClass;
import com.qa.pages.HomePage;

public class TestBanking extends BaseClass{

 

 @Test
 public void openBankSite() {
	  logger = report.createTest("Client creation test");  
	  //create an object of your HomePage class
	  HomePage home = new HomePage(driver);
	  home.loginAsManager();
	  logger.info("Logged in as manager");
	  home.addCustomer(excel.getStringData("Client",1,0),excel.getStringData("Client",1,1),excel.getStringData("Client",1,2));
	  logger.info("Added a client");
	 }
	 
}
package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 WebDriver driver;

 
 // create a constructor
 public HomePage(WebDriver driver) {
  //parameter = global variable hence "this" is used
  this.driver = driver;
  
  PageFactory.initElements(driver,this);
  //initializes variable for entire class
  }
 
 @FindBy(xpath="//button[@ng-click='manager()']" ) 
 WebElement managerLoginBtn;
 /*
 driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();
 //add customer details
 driver.findElement(By.xpath("//input[@ng-model='fName']")).sendKeys("Abc");
 driver.findElement(By.xpath("//input[@ng-model='lName']")).sendKeys("Xyz");
 driver.findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys("10008");
 //click on add customer button
 driver.findElement(By.xpath("//button[@type='submit']")).click();
 //handling web alert
 driver.switchTo().alert().accept();
 
 */
 
 
 @FindBy(xpath="//button[@ng-class='btnClass1']")
 WebElement addCustomer;
 
 
 @FindBy(xpath="//input[@ng-model='fName']")
 WebElement fName;
 
 @FindBy(xpath="//input[@ng-model='lName']")
 WebElement lName;
 
 @FindBy(xpath="//input[@ng-model='postCd']")
 WebElement zipCode;
 
 @FindBy(xpath="//button[@type='submit']")
 WebElement addBtn;

 
 
 
 
 
 //login as manager
 public void loginAsManager() {
  managerLoginBtn.click();
 }
 
 public void addCustomer(String firstName, String lastName, String postCode) {
  addCustomer.click();
  fName.sendKeys(firstName);
  lName.sendKeys(lastName);
  zipCode.sendKeys(postCode);
  addBtn.click();
  driver.switchTo().alert().accept();
 
 
 
 
 }
 
 
 
}
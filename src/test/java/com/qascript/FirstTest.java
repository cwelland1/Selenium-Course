package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
/*        WebDriver driver;   */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SimitBhattacharyya\\OneDrive - iCatalyst Inc\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://18.219.96.155:8081/");
		String testString = "Enter Name"; 
		String testString1 = "Enter Correspondence"; 
		
/*		String testSample =driver.findElement(By.tagName("h1")).getText(); */
		String testSample =driver.findElement(By.tagName("h2")).getText();
		String testSample1 =driver.findElement(By.tagName("h1")).getText();
/*		String testSample =driver.findElement(By.tagName("body")).getText();  */
 	
/*                    TEST #1                                */
        	System.out.println("Text= " +testSample);
		  if (testSample.equals(testString))
		  { 
		  System.out.println("Success");
		   System.out.println(testSample.getClass().getSimpleName());
/*		   System.exit(0);     */
		   }
		  else
			{
			System.out.println("Failure");
/*			System.exit(1);     */
			}    
		  
/*                    TEST #2                                 */
		System.out.println("Text= " +testSample1);
		   if (testSample1.equals(testString1))
			{ 
			 System.out.println("Success");
			 System.out.println(testSample1.getClass().getSimpleName());
/*			 System.exit(0);     */
			 }
		   else
		   {
		   System.out.println("Failure");
/*		   System.exit(1);       */
		   } 


}}


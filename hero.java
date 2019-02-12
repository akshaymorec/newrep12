package com.test.mevandemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class hero {
	WebDriver driver;
	  
	  @BeforeTest
	  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Akshay More\\mevandemo\\src\\Resource\\chromedriver.exe");
	  driver =new ChromeDriver();
	  System.out.println("Open Browser");
	  
	  driver.get("https://the-internet.herokuapp.com/login");
	  }
	  @Test
	  public void f() {
	  driver.findElement(By.name("username")).sendKeys("tomsmith");
	  driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.xpath("//*[@id=\'login\']/button/i")).click();
	  
	  System.out.println("Login Done");
	  
	  }

	  @AfterTest
	  public void afterTest() {
	  }}
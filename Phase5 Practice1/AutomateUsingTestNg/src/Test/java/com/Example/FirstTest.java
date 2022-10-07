package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	WebDriver wd;
@BeforeTest
public void config() {
	WebDriverManager.chromedriver().setup();
	wd=new ChromeDriver();
	wd.manage().window().maximize();
	
}

@AfterTest
public void quitbrowser() {
	wd.quit();
}
	
	
  @Test
  public void test1() throws InterruptedException {
 
  wd.get("https://codingbat.com/java");
	
	wd.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/a[2]")).click();
	wd.findElement(By.name("uname")).sendKeys("theengineer2022@gmail.com");
	wd.findElement(By.name("pw1")).sendKeys("Monika@18");
	Thread.sleep(10000);
	wd.findElement(By.name("dosavecreate")).click();
	wd.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/a")).click();
	wd.findElement(By.name("uname")).sendKeys("theengineer2022@gmail.com");
	
	wd.findElement(By.name("pw")).sendKeys("Monika@18");
	Thread.sleep(10000);
	wd.findElement(By.name("dologin")).click();
  
  }
  
  @Test
  public void test2() {
	  wd.get("https://www.amazon.in/");
  }
}

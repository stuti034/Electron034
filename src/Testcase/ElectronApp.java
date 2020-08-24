package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElectronApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wait for 30 seconds.
		driver.get("https://slack.com/");
		
		driver.findElement(By.xpath("/html/body/header/nav[1]/div/nav/div/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='signup_email']")).sendKeys("Stuti-xyz.slack.com");
		
		driver.findElement(By.xpath("//button[@id='submit_btn']")).click();
		
		
	}
	
}

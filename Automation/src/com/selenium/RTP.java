package com.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP {
	
	static WebDriver s;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser = sc.next();
		
		if (browser.equals("chrome"))
				{
			      s = new ChromeDriver();
				}
		else if (browser.equals("firefox"))
				{
		      s = new FirefoxDriver();
			}
		else if (browser.equals("edge"))
				{
		     s= new EdgeDriver();
			}
		else {
		      System.out.println("Invalid Browser");
			}
		
	}

}

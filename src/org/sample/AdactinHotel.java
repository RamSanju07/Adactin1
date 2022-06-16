package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement Email = driver.findElement(By.id("username"));
	    Email.click();
	    Email.sendKeys("AntoRamIshu");
	
	    WebElement Pswrd = driver.findElement(By.id("password"));
	    Pswrd.click();
	    Pswrd.sendKeys("1234567890");
	
	    WebElement Login = driver.findElement(By.id("login"));
	    Login.click();
	    
	    WebElement location = driver.findElement(By.id("location"));
	    Select locationSelection = new Select(location);
	    locationSelection.selectByValue("London");
	    
	    WebElement hotels = driver.findElement(By.id("hotels"));
	    Select hotelsSelection = new Select(hotels);
	    hotelsSelection.selectByValue("Hotel Cornice");
	    
	    WebElement Room = driver.findElement(By.id("room_type"));
	    Select RoomSelection = new Select(Room);
	    RoomSelection.selectByValue("Super Deluxe");
	    
	    WebElement number = driver.findElement(By.id("room_nos"));
	    Select numberSelection = new Select(number);
	    numberSelection.selectByValue("2");
	    
	    WebElement Checkin = driver.findElement(By.className("date_pick"));
	    Checkin.click();
	    Checkin.sendKeys("13/05/2022");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}

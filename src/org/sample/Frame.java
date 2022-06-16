package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ramac\\\\eclipse-workspace\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
	
	    WebElement Single = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(Single);
	    
	    WebElement Input1 = driver.findElement(By.xpath("//input[@type='text']"));
	    Input1.sendKeys("Java");
	    
	    driver.switchTo().defaultContent();
	    Thread.sleep(8000);
	    
	    WebElement Multiple = driver.findElement(By.xpath("(//a[contains(text(),'Iframe')])[2]"));
	    Multiple.click();
	    
	    WebElement Outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	    driver.switchTo().frame(Outer);
	    
	    WebElement Inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(Inner);
	    
	    WebElement Input2 = driver.findElement(By.xpath("//input[@type='text']"));
	    Input2.sendKeys("Selenium"); 
	    
	}
}

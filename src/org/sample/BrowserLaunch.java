package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
    
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ramachandrananto123@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("abcd1234");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		username.sendKeys("ramachandran.anto123");
		
		WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pass.sendKeys("123456");
		
		WebElement log = driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']"));
		log.click();
		
		boolean displayed = username.isDisplayed();
		System.out.println(displayed);
		
		boolean displayed2 = pass.isDisplayed();
		System.out.println(displayed2);
		
		boolean enabled = log.isEnabled();
		System.out.println(enabled);
		
		driver.navigate().back();
	}

}

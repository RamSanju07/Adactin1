package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ramac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement Title = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		Title.click();
		
		WebElement Evening = driver.findElement(By.xpath("(//a[contains(text(),'Evening ')])[3]"));
        Evening.click();
		
		WebElement Image = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		Image.click();
		
		driver.switchTo().frame(0);
		
		WebElement Qty = driver.findElement(By.id("quantity_wanted"));
		Qty.clear();
		Qty.sendKeys("5");
		
		WebElement Cart = driver.findElement(By.name("Submit"));
		Cart.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		WebElement Proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		Proceed.click();
		
		WebElement Proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		Proceed2.click();
		
		WebElement Proceed3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Proceed3.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ramachandran.anto1607@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("RAM1234");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebElement Proceed4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Proceed4.click();
		
		Thread.sleep(2000);
		
		WebElement Checkbox = driver.findElement(By.id("cgv"));
		Checkbox.click();
		
		WebElement Proceed5 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Proceed5.click();
		
		WebElement Payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		Payment.click();
		
		WebElement Confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Confirm.click();
		
	}

}

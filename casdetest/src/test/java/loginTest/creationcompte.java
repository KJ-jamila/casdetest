package loginTest;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class creationcompte {
	
		 public static void main(String[] args) {  
		      
	         // System Property for Chrome Driver   
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");  
	        
	           // Instantiate a ChromeDriver class.     
	      WebDriver driver=new ChromeDriver();  
	        
	         // Launch Website  
	      driver.navigate().to("https://www.amazon.fr");  
	        
	       //Maximize the browser  
	        driver.manage().window().maximize(); 
	        
	       // Click on the Search button  
	      driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]")).click();     
	      driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();  
	      driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Jamila");
	      driver.findElement(By.xpath(" //*[@id=\"ap_email\"]")).sendKeys("khalloufijamila8@gmail.com");
	      driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Jamila1234@");
	      driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("Jamila1234@");
	      driver.findElement(By.xpath("//*[@id=\"continue\"]")).click(); 
		 }


}
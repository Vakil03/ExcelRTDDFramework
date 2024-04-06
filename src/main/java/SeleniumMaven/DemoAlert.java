package SeleniumMaven;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoAlert {
			public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		
			WebDriver drv=new ChromeDriver();
	        drv.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
	        drv.findElement(By.id("alertexamples")).click();
	      //input[@id='alertexamples']
	        
	        Thread.sleep(3000);
	        Alert al=drv.switchTo().alert();
	        al.accept();
	        
	       
		}


}
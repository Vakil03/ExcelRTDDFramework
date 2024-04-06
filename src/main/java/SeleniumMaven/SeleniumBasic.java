package SeleniumMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            WebDriver drv=new FirefoxDriver();
            drv.get("https://www.facebook.com");
            WebElement email = drv.findElement(By.id("email"));
    		email.sendKeys("dummyabcemail");
    		email.sendKeys("repeated");
    		drv.findElement(By.name("pass")).sendKeys("testpassword");
    		drv.findElement(By.name("login")).click();
    		drv.close();
	}

}

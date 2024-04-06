package SeleniumMaven;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class LocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver drv=new ChromeDriver();
        drv.get("https://www.orangehrm.com/en/contact-sales/");
       // WebElement ddlCountry= drv.findElement(By.id("Form_getForm_Country"));
        List<WebElement> allOptions=drv.findElements(By.xpath("//select[@name = 'Country']/option"));
       // Select objCountry=new Select(ddlCountry);
        //Total countries in drop down
       // List<WebElement> lst=allOptions.getOptions();
        System.out.println("Total contries are: " + allOptions.size());
        //select country "Argentina"
       // objCountry.selectByValue("Argentina");
        //country names
        for(int i=0; i < allOptions.size();i++)
        {
        	System.out.println(allOptions.get(i).getText());
        }
        
	}


}

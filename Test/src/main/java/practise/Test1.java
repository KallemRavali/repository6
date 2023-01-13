package practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test1 {

	public static void main(String[] args) {
		//open the chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //navigate to url
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        //maximize the tab
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[contains(text(),'NAVA L')]/self::a")).click();
        //get current url
        String act_url =driver.getCurrentUrl();
        System.out.println(act_url);
        //verify the url
        String desired_url="https://money.rediff.com/companies/Nava-Ltd/14520017";
        if(act_url.equals(desired_url))
        {
        System.out.println("pass");
	    }	
        else
        	System.out.println("fail");
        
        Select dropdown = new Select(driver.findElement(By.id("selPer")));
        dropdown.selectByVisibleText("6 Months");
          
	}
}
	
	
	


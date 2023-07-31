import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Core {
    
   private static WebDriver driver;       
   public final static int TIMEOUT = 10;
	public void setUp() {
		 
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        setDriver(new ChromeDriver(chromeOptions));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        getDriver().manage().window().maximize();
    }
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Core.driver = driver;
	}
	
	    public void quit() {
	  
		 driver.quit();
	    }
	    
	    public void waits() {
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

}

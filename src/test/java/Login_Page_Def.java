import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Login_Page_Def extends Core {
     
 
    @Given("User navigates to {string}")
    public void loginTest(String website) {
        getDriver().get(website);
  
    }
  
    @And("User enter the Username {string}")
    public void EnterUsername(String username) {
    	getDriver().findElement(By.id("user-name")).sendKeys(username);
    }
    @And("User enter the Password {string}")
    public void EnterPassword(String password) {
        	getDriver().findElement(By.id("password")).sendKeys(password);
    }
    @Then("click login button")
    public void Login_button() {
    	  try {
    	getDriver().findElement(By.id("login-button")).click();

	  Thread.sleep(3000);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    }
    @And("verify error msg {string}")
    public void error(String error_msg) {
    	String s = getDriver().findElement(By.xpath("//*[@data-test=\"error\"]")).getText();
    	Assert.assertEquals(error_msg, s);
    	
    }
     
    
     
       
}
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
 
public class Product_Buy extends Core {
     
 


@Then ("Add to Cart the Product")
public void Add_to_Cart() {
	  try {
	getDriver().findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
    	  @Then ("Click on the Shopping Cart")
    	  public void ShoppingCart() {
    		  try {
        	getDriver().findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        	Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		  }
    	 
    		  @Then ("Click on the Check Out Button")
        	  public void Checkout() {
        		  try {
            	getDriver().findElement(By.xpath("//*[@id=\"checkout\"]")).click();
            	Thread.sleep(3000);
    				} catch (InterruptedException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				
    		  
        	  }
    		  }
    		  @Then("Enter First Name {string}")
    		    public void enter_first_name(String FirstName) {
    			  getDriver().findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(FirstName);
    			  //getDriver().findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(Keys.TAB);
    		    	waits();
    		    }
    		  
    		  @Then("Enter Last Name {string}")
    			    public void enter_last_name(String LastName) {
    			    	getDriver().findElement(By.id("last-name")).sendKeys(LastName);
    			    	//getDriver().findElement(By.id("last-name"]")).sendKeys(Keys.TAB);
    			    	waits();
    			    }
    			  
    			  @Then("Enter ZIPCODE {string}")
  			    public void enter_zip_code(String ZipCode) {
  			    	getDriver().findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(ZipCode);
  			    	waits();
  			    }
  			      
    			  @Then ("Click on the Continue")
            	  public void Continue() {
            		 
                	getDriver().findElement(By.xpath("//*[@id=\"continue\"]")).click();
                	waits();
        				
        		  
            	  }
    			  
    			  @Then ("Click on the menu button")
            	  public void click_menu_button() {
            		 
                	getDriver().findElement(By.id("react-burger-menu-btn")).click();
                	waits();
        				
        		  
            	  }
    			  
    			  @And ("Logout the profile")
            	  public void logout_profile() {
            		 
                	getDriver().findElement(By.id("logout_sidebar_link")).click();
                	waits();
        				
        		  
            	  }
    			  
    			  
    			
    		  
		  
}


    		
    
     
       

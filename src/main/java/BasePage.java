import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BasePage {

    Core Core =new Core();
   @Before
   public void InitailzeDriver() {
   	Core.setUp();
       
   }
   
   @After
   public void teardown() {
 
	   Core.quit();
   }
}

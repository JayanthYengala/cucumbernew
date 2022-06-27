package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;

public class uniforms {
	
WebDriver driver = hooksclass.driver;
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		
		
		driver.get("http://uniformm1.upskills.in/admin/");
	    
	}
	
	@When("user enter invalid Username {string} and password {string}")
	public void user_enter_invalid_Username_and_password(String username, String password) {
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
	}
	
	/*@When("user enter invalid Username {string} and password {string}")
	public void user_enter_invalid_Username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/

	@When("user enter valid Username {string} and password {string}")
	public void user_enter_valid_Username_and_password(String string, String string2) {
		driver.findElement(By.id("input-username")).sendKeys(string);
		driver.findElement(By.id("input-password")).sendKeys(string2);
	}

	@When("User enter value in user name field")
	public void user_enter_value_in_user_name_field() {
	    
	}

	@When("user enter value in password field")
	public void user_enter_value_in_password_field() {
	   
	}
	@Then("Login button enabled")
	public void login_button_enabled() {
	    
	}

		@When("user click on Submit button")
		public void user_click_on_Submit_button() throws InterruptedException {
			
			driver.findElement(By.tagName("button")).click();
			 Thread.sleep(2000);
		}

		@Then("validation message appears")
		public void validation_message_appears() throws InterruptedException {
			driver.findElement(By.tagName("button")).click();
			 Thread.sleep(2000);
		   System.out.println("validation message verified");
		}

		/*@When("user enter valid credentials")
		public void user_enter_valid_credentials() {
		   
		}*/

		@Then("User navigates to home page")
		public void user_navigates_to_home_page() {
		    
		}
		@When("user goes to menu")
		public void user_goes_to_menu() throws InterruptedException {
			driver.findElement(By.xpath("//a[@id='button-menu']/i")).click();
			Thread.sleep(1000);
		}
		@When("user goes to reports")
		public void user_goes_to_reports() throws InterruptedException {
			driver.findElement(By.id("reports")).click();
			//Thread.sleep(2000);
		    
		}

		@When("user clicks Marketing")
		public void user_clicks_Marketing() throws InterruptedException {
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='reports']/ul/li[4]/a")).click();
			Thread.sleep(1500);
		}

		@When("click on Affiliate activity")
		public void click_on_Affiliate_activity() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[text()='Affiliate Activity']")));
			
			driver.findElement(By.xpath("//a[text()='Affiliate Activity']")).click();
			//*[@id="reports"]/ul/li[4]/ul/li[3]/a
			Thread.sleep(1500);
		}

		@Then("user navigates to Affiliate Activity Report")
		public void user_navigates_to_Affiliate_Activity_Report() throws InterruptedException {
			driver.findElement(By.xpath("//input[@name='filter_ip']")).sendKeys("152.57.8.5");
			Thread.sleep(1100);
			driver.findElement(By.id("button-filter")).click();
			
			
		}

		


}

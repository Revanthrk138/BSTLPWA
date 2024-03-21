package steps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	
	WebDriver driver;
	
	@Given("user starts {string} browser")
	public void user_starts_browser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
	
	     else 
			if(browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
	  }

	@Given("user launch PWA using URL {string}")
	public void user_launch_pwa_using_url(String url) {
	    driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	
	@Given("user click on langauge change icon")
	public void user_click_on_langauge_change_icon() {
	    driver.findElement(By.xpath("//div[@class='dropdown']")).click();
	}
	@Given("user change the language Thai to English")
	public void user_change_the_language_thai_to_english() throws InterruptedException {
	   driver.findElement(By.xpath("//div[@class='txt--label']")).click();
	   Thread.sleep(3000);
	}
	
	
	@When("user enter the  username  {string}")
	public void user_enter_the_username(String username) {
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	}
	@When("user enter the  password {string}")
	public void user_enter_the_password(String password) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	}

	
	 @When("user click on terms & conditions check box")
	public void user_click_on_terms_conditions_check_box() {
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	     Thread.sleep(3500);
	}
	
@Given("user close the {string} browser")
	public void user_close_the_browser(String browsername) throws InterruptedException {
		Thread.sleep(3000);
	    driver.quit();
	  
	
}

@When("user click on rewards heading in header section in home page")
public void user_click_on_rewards_heading_in_header_section_in_home_page() throws InterruptedException {
	Thread.sleep(6000);
	driver.findElement(By.xpath("//span[contains(text(),'Rewards')]")).click();
    
}

@When("user click on e-voucher reward")
public void user_click_on_e_voucher_reward() throws InterruptedException {
	Thread.sleep(3000);
    driver.findElement(By.xpath("//h5[text( )=' Demo24 ']")).click();
}

@When("user click on redeem button")
public void user_click_on_redeem_button() throws InterruptedException {
	 Thread.sleep(6000);
    driver.findElement(By.xpath("//div[text()='Redeem']")).click();
   
}


@When("user click on redeem now button")
public void user_click_on_redeemnow_button() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='box--order']")).click();
}

@When("user click on redeem now button on order confirmation page")
public void user_click_on_redeemnow_button_on_order_confirmation_page() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='box--place ng-star-inserted']")).click();
	
   
}

@When("click on view order button")
public void click_on_view_order_button() throws InterruptedException {
	driver.findElement(By.xpath("//div[@class='box--view']")).click();
	 Thread.sleep(6000);
   
}

@When("user click on mark as used button")
public void user_click_on_mark_as_used_button() throws InterruptedException {
    driver.findElement(By.xpath("//button[@class='btn-verify ng-star-inserted']")).click();
    Thread.sleep(3000);
}

@When("user click on mark as ued tab yes button")
public void user_click_on_mark_as_ued_tab_yes_button() throws InterruptedException {
	 Thread.sleep(3000);
   driver.findElement(By.xpath("//button[@class='btn btn-verify mark-used-btn']")).click();
}
@Then("user click on rewards heading in header")
public void user_click_on_rewards_heading_in_header() throws InterruptedException {
	 Thread.sleep(3000);
    driver.findElement(By.xpath("//span[contains(text(),'Rewards')]")).click();
}

@Then("click on my wallet")
public void click_on_my_wallet() throws InterruptedException {
    driver.findElement(By.xpath("//div[@class='box3 text2']")).click();
    Thread.sleep(3000);
}

@Then("user click on profile tab")
public void user_click_on_profile_tab() throws InterruptedException {
	 Thread.sleep(3000);
   driver.findElement(By.xpath("//img[@class='img-fluid ng-star-inserted']")).click();
  
}

@Then("user click on signout button")
public void user_click_on_signout_button() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='text--sign-out']")).click();
    
}

@When("user select the reward on home page")
public void user_select_the_reward_on_home_page() throws InterruptedException {
	 Thread.sleep(3000);
    driver.findElement(By.xpath("//h5[text( )=' Demo24 ']")).click();
}

@When("user click on add to cart button")
public void user_click_on_add_to_cart_button() throws InterruptedException {
	 Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class='btn--redeem btn--cart']")).click();
}

@When("user click on view cart button")
public void user_click_on_view_cart_button() throws InterruptedException {
	 Thread.sleep(3000);
   driver.findElement(By.xpath("//div[text()='View Cart']")).click();
}

@When("user click on checkout button")
public void user_click_on_checkout_button() throws InterruptedException {
	 Thread.sleep(6000);
   driver.findElement(By.xpath("//span[text()='Check Out']")).click();
}

@When("user click on place your order button")
public void user_click_on_place_your_order_button() throws InterruptedException {
	 Thread.sleep(8000);
    driver.findElement(By.xpath("//span[text()='Place Your Order']")).click();
}

@When("user click on view your order button")
public void user_click_on_view_your_order_button() throws InterruptedException {
	 Thread.sleep(8000);
    driver.findElement(By.xpath("//span[text()='View Order']")).click();
}



}











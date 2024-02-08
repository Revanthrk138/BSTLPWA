package steps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinations {
	
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
	
	
	@Given("user click on langauge change icon using xpath {string}")
	public void user_click_on_langauge_change_icon_using_xpath(String xpath) {
	    driver.findElement(By.xpath(xpath)).click();
	}
	@Given("user change the language Thai to English using xpath {string}")
	public void user_change_the_language_thai_to_english_using_xpath(String xpath) throws InterruptedException {
	   driver.findElement(By.xpath(xpath)).click();
	   Thread.sleep(3000);
	}
	@When("user enters username  {string} in textbox using xpath {string}")
	public void user_enters_username_in_textbox_using_xpath(String username, String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(username);
	   
	}

	@When("user enters password {string} in textbox using xpath {string}")
	public void user_enters_password_in_textbox_using_xpath(String password, String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(password);
	   
	}

	@When("user click on terms & conditions check box using xpath {string}")
	public void user_click_on_terms_conditions_check_box_using_xpath(String xpath) {
	    driver.findElement(By.xpath(xpath)).click();
	}

	@When("user click on login button using xpath {string}")
	public void user_click_on_login_button_using_xpath(String xpath) throws InterruptedException {
	    driver.findElement(By.xpath(xpath)).click();
	    
	    Thread.sleep(3000);
	}
	
	
	@Given("user close the {string} browser")
	public void user_close_the_browser(String browsername) {
	    driver.quit();
	  
	}
}










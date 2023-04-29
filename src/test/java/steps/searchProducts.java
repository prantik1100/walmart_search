package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class searchProducts {

	WebDriver driver;
	@Given("i m on the walmart homepage")
	public void i_m_on_the_walmart_homepage() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://www.walmart.com");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
	   
	}

	@When("i enter the {string} in the search box")
	public void i_enter_the_in_the_search_box(String string) {
		WebElement searchitem = driver.findElement(By.id("header-input-search"));
		searchitem.sendKeys();
	
	}

	@When("i click search button")
	public void i_click_search_button() {
	   WebElement searchbutton = driver.findElement(By.id("search-icon"));
	   searchbutton.submit();
	}

	@Then("i can see the result succesfully")
	public void i_can_see_the_result_succesfully() {
	   System.out.println("=======================================================================================================");
	   
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	   
	   System.out.println("=======================================================================================================");
	   driver.quit();
	}
}

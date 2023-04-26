package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TS01_FDCalcStepDefination {
	WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("User is on Homepage");
	    System.setProperty("webdriver.chrome.driver", "G:\\Selenium3\\Sel@10AM(Est)\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
		driver.manage().window().maximize();
	}
	@When("user enters FDAmount,FDPeriod")
	public void user_enters_fd_amount_fd_period() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Fixed Deposit Calculator | Calculate FD Interest, Maturity value");
	   System.out.println("user enters FDAmount,FDPeriod");
	   
	}
	@And("user Selects item from FD_Period")
	public void user_selects_item_from_fd_period() {
	   System.out.println("user Selects item from FD_Period");
	}
	@And("user enters FD_Interest")
	public void user_enters_fd_interest() {
	   System.out.println("user enters FD_Interest");
	}
	@And("user Select item from FD_CompoundingInt")
	public void user_select_item_from_fd_compounding_int() {
	   System.out.println("user Select item from FD_CompoundingInt");
	}
	@And("Clicks on FD Maturity Amount button")
	public void clicks_on_fd_maturity_amount_button() {
	    System.out.println("Clicks on FD Maturity Amount button");
	}
	@Then("SUT displays FDAmount and FDInterest")
	public void sut_displays_fd_amount_and_fd_interest() {
	   System.out.println("SUT displays FDAmount and FDInterest");
	   
	}
	@Then("Close AUT")
	public void close_aut() {
	    
	    driver.quit();
	}



}

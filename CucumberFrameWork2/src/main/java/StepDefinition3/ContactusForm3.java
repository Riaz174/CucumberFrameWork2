package StepDefinition3;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Capstone.CucumberFrameWork2.feature1;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactusForm3 {
	public WebDriver driver;

	@Before
	public void setup() {
		String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\CucumberFrameWork2\\src\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.protrainingtech.com");
		driver.manage().window().maximize();
		
	}
	@Given("^Already opened the protrainingtech\\.com$")
	public void already_opened_the_protrainingtech_com() throws Throwable {
	String id = driver.getCurrentUrl();
	  System.out.println(id);
	  Assert.assertEquals(id, "https://protrainingtech.com/");
	  
	}

	@When("^user click on contact us link$")
	public void user_click_on_contact_us_link() throws Throwable {
		feature1 ob = new feature1(driver);
		Thread.sleep(6000);
	    ob.ContactusClick();
	}

	@Then("^user able to see the contact us form$")
	public void user_able_to_see_the_contact_us_form() throws Throwable {
		feature1 ob = new feature1(driver);
		Thread.sleep(6000);
	    ob.Joinus();
	    WebElement Joinus = ob.Joinus();
	    String JoinusText = Joinus.getText();
	    System.out.println("Joinus Text");
	    
	}

	@When("^user enters values for first name \"([^\"]*)\"$")
	public void user_enters_values_for_first_name(String arg1) throws Throwable {
		feature1 ob = new feature1(driver);
		Thread.sleep(3000);
		ob.firstNameField(arg1);
	    }

	@And("^user enters value for last name \"([^\"]*)\"$")
	public void user_enters_value_for_last_name(String arg1) throws Throwable {
		feature1 ob = new feature1(driver);
		Thread.sleep(3000);
		ob.lastNameField(arg1);
	    }

	@And("^user enters value for email \"([^\"]*)\"$")
	public void user_enters_value_for_email(String arg1) throws Throwable {
		feature1 ob = new feature1(driver);
		Thread.sleep(3000);
		ob.emailField(arg1);
	    }

	@And("^user enters value for phone \"([^\"]*)\"$")
	public void user_enters_value_for_phone(String arg1) throws Throwable {
		feature1 ob = new feature1(driver);
		Thread.sleep(3000);
		ob.phoneField(arg1);
	    }

	@And("^user clicks on register button$")
	public void user_clicks_on_register_button() throws Throwable {
		feature1 ob = new feature1(driver);
		Thread.sleep(3000);
	    ob.RegisterButton();
	    
	}

	@Then("^user should see confirmation message$")
	public void user_should_see_confirmation_message() throws Throwable {
		feature1 ob = new feature1(driver);
		Thread.sleep(3000);
	    String tx = ob.Confirm().getText();
	    System.out.println(tx);
	    Assert.assertEquals(tx, "The form was sent successfully.");
	    
	}


}

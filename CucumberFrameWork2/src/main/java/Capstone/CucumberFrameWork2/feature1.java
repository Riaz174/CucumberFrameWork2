package Capstone.CucumberFrameWork2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class feature1 {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Contact']") WebElement ContactusClick;
	@FindBy(xpath = "//*[contains(text(),'Join us !')]") WebElement Joinus;
	@FindBy(name = "form_fields[name]") WebElement firstNameField;
	@FindBy(name = "form_fields[field_6c5f814]") WebElement lastNameField;
	@FindBy(id = "form-field-email") WebElement emailField;
	@FindBy(id = "form-field-field_694d8a5") WebElement phoneField;
	@FindBy(xpath = "//*[text()='REGISTER']") WebElement RegisterButton;
	@FindBy(xpath = "//*[contains(text(),'The form was sent successfully.')]") WebElement Confirmation;	
	public feature1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void ContactusClick() {
		ContactusClick.click();
	}
	public WebElement Joinus() {
		return Joinus;
	}
	public void firstNameField(String name) {
		firstNameField.sendKeys(name);
	}
	public void lastNameField(String name) {
		lastNameField.sendKeys(name);
	}
	public void emailField(String email) {
		emailField.sendKeys(email);
	}
	public void phoneField(String phone) {
		phoneField.sendKeys(phone);
	}
	public void RegisterButton() {
		RegisterButton.click();
	}
	public WebElement Confirm() {
		return Confirmation;
	
		
	}
	

}

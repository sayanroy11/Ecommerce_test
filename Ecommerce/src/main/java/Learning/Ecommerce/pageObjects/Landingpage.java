package Learning.Ecommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Learning.Ecommerce.Abstract.AbstractComponents;

public class Landingpage extends AbstractComponents{
	WebDriver driver;
	public Landingpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[type='email']")
	WebElement email;
	@FindBy(css="input[type='password']")
	WebElement pwd;
	@FindBy(id="login")
	WebElement login;
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	public Catalog action() {
		email.sendKeys("jmayer@gmail.com");
		pwd.sendKeys("Jmayer123");
		login.click();
		Catalog cg=new Catalog(driver);
		return cg;
	}
}

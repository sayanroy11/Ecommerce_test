package Learning.Ecommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Learning.Ecommerce.Abstract.AbstractComponents;

public class Checkout extends AbstractComponents {
	WebDriver driver;
	public Checkout(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".form-group input")
	WebElement srch;
	@FindBy(css=".form-group button:nth-child(3)")
	WebElement snd;
	@FindBy(css="[class*='submit']")
	WebElement sub;
	
	public void selectCountry() {
		srch.sendKeys("ind");
		snd.click();
	}
	public Confirm submit() {
		sub.click();
		return new Confirm(driver);
	}
}

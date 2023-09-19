package Learning.Ecommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Learning.Ecommerce.Abstract.AbstractComponents;

public class Confirm extends AbstractComponents{
	WebDriver driver;
	public Confirm(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="h1")
	WebElement txt;
	public void confirm() {
		if(txt.getText().contains("THANK"))
			System.out.println("Order placed");
	}
}

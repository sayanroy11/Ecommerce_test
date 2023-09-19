package Learning.Ecommerce.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Learning.Ecommerce.Abstract.AbstractComponents;

public class CartPage extends AbstractComponents{
	WebDriver driver;
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".cartSection h3")
	List<WebElement> cart;
	@FindBy(css=".subtotal button")
	WebElement sub;
	
	public boolean verifyProduct(String prod) {
	return cart.stream().anyMatch(s->s.getText().equalsIgnoreCase(prod));
	}
	public Checkout checkOut() {
		sub.click();
		return new Checkout(driver);
	}
}

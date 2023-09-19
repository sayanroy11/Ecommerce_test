package Learning.Ecommerce.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Learning.Ecommerce.Abstract.AbstractComponents;

public class Catalog extends AbstractComponents{
	WebDriver driver;
	public Catalog(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".mb-3")
	List <WebElement> l;
	@FindBy(css=".ng-animating")
	WebElement anim;
	By add=By.cssSelector(".card-body button:last-child");
	By toast=By.cssSelector("#toast-container");
	
	public List<WebElement> prodlist(){
		return l;
	}
	public WebElement getprod(String name) {
		WebElement p=l.stream().filter(pro->
		pro.findElement(By.cssSelector("b")).getText().equals(name)).findFirst().orElse(null);
		return p;
	}
	public void addToCart(String name) throws InterruptedException {
		getprod(name).findElement(add).click();
		waitForElement(toast);
		Thread.sleep(1000);
		//waitForInvisibility(anim);
	}
}

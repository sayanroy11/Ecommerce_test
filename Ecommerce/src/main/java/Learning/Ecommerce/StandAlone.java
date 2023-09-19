package Learning.Ecommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Learning.Ecommerce.pageObjects.CartPage;
import Learning.Ecommerce.pageObjects.Catalog;
import Learning.Ecommerce.pageObjects.Checkout;
import Learning.Ecommerce.pageObjects.Confirm;
import Learning.Ecommerce.pageObjects.Landingpage;

public class StandAlone {

	public static void main(String[] args) throws InterruptedException {
		String prod="ADIDAS ORIGINAL";
		WebDriver driver=new ChromeDriver();
		System.setProperty("web.driver.chromedriver", "F:/selenium/chromedriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Landingpage lp=new Landingpage(driver);
		lp.goTo();
		Catalog cg=lp.action();
		cg.prodlist();
		cg.addToCart(prod);
		CartPage ct=cg.cartPage();
		boolean b=ct.verifyProduct(prod);
		Assert.assertTrue(b);
		Checkout c=ct.checkOut();
		c.selectCountry();
		Confirm cnf=c.submit();
		cnf.confirm();
	}

}

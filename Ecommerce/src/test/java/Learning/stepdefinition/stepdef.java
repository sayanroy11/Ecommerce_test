package Learning.stepdefinition;

import Learning.Ecommerce.StandAlone;
import Learning.Ecommerce.pageObjects.Landingpage;
import io.cucumber.java.en.Given;

public class stepdef extends StandAlone{
	public Landingpage lp;
	@Given("I am on Ecommerce page")
	public void I_am_on_Ecommerce_page(){
		lp.goTo();
	}
}

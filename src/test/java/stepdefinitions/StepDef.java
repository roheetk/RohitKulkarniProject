package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages_actions.PageActions;
import utils.SeleniumDriver;

public class StepDef {
	PageActions pageActions = new PageActions();

	@Given("User navigates to Swag Labs website {string}")
	public void user_navigates_to_swag_labs_website(String websiteURL) throws Throwable {
		SeleniumDriver.getDriver().get(websiteURL);
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) throws Throwable {
		pageActions.enterUsername(username);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) throws Throwable {
		pageActions.enterPassword(password);
	}

	@When("User clicks Login button")
	public void user_clicks_login_button() throws Throwable {
		pageActions.clickLoginButton();
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() throws Throwable {
		pageActions.clickBurgerButton();
		pageActions.isBtnLogoutDisplayed();
		pageActions.clickCrossButton();
	}

	@When("User clicks Add to cart button")
	public void user_clicks_add_to_cart_button() throws Throwable {
		pageActions.clickAddToCartOrRemoveButton();
	}

	@Then("The same button should be turned into {string} button")
	public void the_same_button_should_be_turned_into_remove_button(String btn) throws Throwable {
		pageActions.isBtnAddToCartOrRemoveDisplayed(btn);
	}

	@Then("Number {string} should be displayed over the cart icon")
	public void number_should_be_displayed_over_the_cart_icon(String number) throws Throwable {
		pageActions.isCartNumDisplayed(number);
	}

	@When("User clicks Remove button")
	public void user_clicks_remove_button() throws Throwable {
		pageActions.clickAddToCartOrRemoveButton();
	}

	@Then("Number {string} should be disappeared over the cart icon")
	public void number_should_be_disappeared_over_the_cart_icon(String number) throws Throwable {
		pageActions.isElementPresent();
	}

	@When("User clicks cart icon")
	public void user_clicks_cart_icon() {
		pageActions.clickIconCart();
	}

	@Then("User should land on cart page")
	public void user_should_land_on_cart_page() {
		pageActions.isYourCartTextPresent();
	}

	@When("User clicks continue shopping")
	public void user_clicks_continue_shopping() {
		pageActions.clickContinueShoppingBtn();
	}

	@Then("User should get back to product page")
	public void user_should_get_back_to_product_page() {
		pageActions.isProductTextPresent();
	}

	@When("User clicks burger icon")
	public void user_clicks_burger_icon() {
		pageActions.clickBurgerButton();
	}

	@When("User clicks About")
	public void user_clicks_about() {
		pageActions.clickAbout();
	}

	@When("User moves cursor to products option")
	public void user_moves_cursor_to_products_option() {
		pageActions.moveToProd();
	}

	@Then("Pop up should be displayed")
	public void pop_up_should_be_displayed() {
		pageActions.isPopupDisplayed();
	}

	@When("User hovers Sauce Labs Backpack link")
	public void user_hovers_sauce_labs_backpack_link() {
		pageActions.moveToLink();
	}

	@Then("Colour of link should be changed to green")
	public void colour_of_link_should_be_changed_to_green() {
		pageActions.isExpectedColorDisplayedOnHoveringLink();
	}
}

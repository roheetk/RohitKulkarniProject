package pages_actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pages_locators.PageLocators;
import utils.SeleniumDriver;

public class PageActions {
	PageLocators pageLocators = null;

	public PageActions() {
		this.pageLocators = new PageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), pageLocators);
	}

	public void enterUsername(String username) {
		PageLocators.fieldUsername.sendKeys(username);
	}

	public void enterPassword(String password) {
		PageLocators.fieldPassword.sendKeys(password);
	}

	public void clickLoginButton() {
		PageLocators.btnLogin.click();
	}

	public void clickBurgerButton() {
		PageLocators.btnBurger.click();
	}

	public void isBtnLogoutDisplayed() {
		PageLocators.btnLogout.isDisplayed();
	}

	public void clickCrossButton() {
		JavascriptExecutor executor = (JavascriptExecutor) SeleniumDriver.getDriver();
		executor.executeScript("arguments[0].click();", PageLocators.btnCross);
	}

	public void clickAddToCartOrRemoveButton() {
		PageLocators.btnAddToCartOrRemove.click();
	}

	public boolean isBtnAddToCartOrRemoveDisplayed(String btnName) {
		return PageLocators.btnAddToCartOrRemove.getText().equals(btnName);
	}

	public void isCartNumDisplayed(String num) {
		PageLocators.iconCartNum.getText().equals(num);
	}

	public boolean isElementPresent() {
		try {
			return PageLocators.iconCartNum.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickIconCart() {
		PageLocators.iconCart.click();
	}

	public void clickContinueShoppingBtn() {
		PageLocators.btnContiShopping.click();
	}

	public boolean isProductTextPresent() {
		try {
			return PageLocators.textProduct.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isYourCartTextPresent() {
		try {
			return PageLocators.textYourCart.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickAbout() {
		PageLocators.btnAbout.click();
	}

	public void moveToProd() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(PageLocators.menuProduct).perform();
	}

	public void isPopupDisplayed() {
		PageLocators.popUp.isDisplayed();
	}

	public void moveToLink() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(PageLocators.link).perform();
	}

	public void isExpectedColorDisplayedOnHoveringLink() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(PageLocators.link).perform();
		Assert.assertEquals("rgba(0, 0, 0, 0)", PageLocators.link.getCssValue("background-color"));
	}
}

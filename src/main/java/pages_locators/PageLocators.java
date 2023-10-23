package pages_locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageLocators {

	@FindBy(how = How.XPATH, using = "//input[@data-test='username']")
	public static WebElement fieldUsername;

	@FindBy(how = How.XPATH, using = "//input[@data-test='password']")
	public static WebElement fieldPassword;

	@FindBy(how = How.XPATH, using = "//input[@data-test='login-button']")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//button[@id='react-burger-menu-btn']")
	public static WebElement btnBurger;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	public static WebElement btnLogout;

	@FindBy(how = How.XPATH, using = "//button[@id='react-burger-cross-btn']")
	public static WebElement btnCross;

	@FindBy(how = How.XPATH, using = "//div[text()='Sauce Labs Backpack']/../../..//button")
	public static WebElement btnAddToCartOrRemove;

	@FindBy(how = How.XPATH, using = "//span[@class='shopping_cart_badge']")
	public static WebElement iconCartNum;

	@FindBy(how = How.XPATH, using = "//a[@class='shopping_cart_link']")
	public static WebElement iconCart;

	@FindBy(how = How.XPATH, using = "//button[@data-test='continue-shopping']")
	public static WebElement btnContiShopping;

	@FindBy(how = How.XPATH, using = "//span[text()='Your Cart']")
	public static WebElement textYourCart;

	@FindBy(how = How.XPATH, using = "//span[text()='Products']")
	public static WebElement textProduct;

	@FindBy(how = How.XPATH, using = "//a[text()='About']")
	public static WebElement btnAbout;

	@FindBy(how = How.XPATH, using = "//span[text()='Products']")
	public static WebElement menuProduct;

	@FindBy(how = How.XPATH, using = "(//span[text()='Platform for Test']/../../../../..)[1]")
	public static WebElement popUp;

	@FindBy(how = How.XPATH, using = "//div[text()='Sauce Labs Backpack']")
	public static WebElement link;
}

package com.qa.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By username=By.xpath("//input[@id=\"txtUsername\"]");
	private By password=By.xpath("//input[@id=\"txtPassword\"]");
	private By loginButton=By.xpath("//input[@name=\"Submit\"]");
	
	public WebElement getUsername() {
		return getElement(username);
	}
	
	public WebElement getPassword() {
		return getElement(password);
	}
	
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	
	public String pageTitle() {
		return getPageTitle();
	}
	
	public void doLogin(String usr,String pass) {
		getUsername().sendKeys("Admin");
		getPassword().sendKeys("admin123");
		getLoginButton().click();
	}
}

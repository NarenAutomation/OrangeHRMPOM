package com.qa.mypages;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractPage {

	WebDriver driver;
	
	public AbstractPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public abstract String getPageTitle();
	
	public abstract WebElement getElement(By locator);
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(driver);		
	}	
}

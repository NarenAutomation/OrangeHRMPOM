import java.lang.reflect.InvocationTargetException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.mypages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void doPageTitleTest() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String actualTitle=abstractPage.getInstance(LoginPage.class).pageTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

public void doPageTitleTest() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String actualTitle=abstractPage.getInstance(LoginPage.class).pageTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}
}

package com.santhoshjagadeesan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void testLogin1() {
		Login login = new Login();
		Assert.assertEquals(login.login("abc", "ABC@123"), 0);
	}
	
	@Test
	public void testLogin2() {
		Login login = new Login();
		Assert.assertEquals(login.login("abc", "abc@123"), 1);
	}
	
}

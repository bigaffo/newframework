package com.guru99.demo.ui_test_1;

import org.junit.Assert;
import org.junit.Test;

import com.guru99.demo.pages_objects.ManagersPage;

import tdd_guru99_demo_hooks.Hook;

public class LoginTest extends Hook{
	
	@Test
	public void loginTest() {
		ManagersPage managersPage = homePage.loginToBank("mngr146902","hyvymav");
		Assert.assertTrue(managersPage.validateLogin("Manger Id : mngr146902"));
	
	}
	

}

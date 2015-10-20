package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTest extends TestBase {
	
	@Test
	public void deleteSomeContact() { //to delete contact by index
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().deleteContact(1);
		app.getNavigationHelper().openMainPage();
	}
}

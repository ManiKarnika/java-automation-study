package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitContactForm() {
		click(By.name("submit"));
	}

	public void fillContactForm(ApplicationManager applicationManager, TestBase testBase, ContactData contact) {
		type(By.name("firstname"), contact.contactFirstName);
		type(By.name("lastname"), contact.contactLastName);
	    type(By.name("address"), contact.contactFistAddress);
	    type(By.name("home"), contact.contactHomePhone);
	    type(By.name("mobile"), contact.contactMobilePhone);
	    type(By.name("work"), contact.contactWorkPhone);
	    type(By.name("email"), contact.contactFirstEmail);
	    type(By.name("email2"), contact.contactSecondEmail);
	    selectByText(By.name("bday"), contact.contactBirthDay);
	    selectByText(By.name("bmonth"), contact.contactBirthMonth);
	    type(By.name("byear"), contact.contactBirthYear);
	    // selectByText(By.name("new_group"), contact.contactGroup);
	    type(By.name("address2"), contact.contactSecondAddress);
	    type(By.name("phone2"), contact.contactSecondAddressPhone);
	}

	public void initNewEntryPage() {
		click(By.name("add new"));
	}

}


package com.example.tests;

import org.testng.annotations.Test;

public class AddNewContact extends TestBase {
  @Test
  public void testAddNewContact() throws Exception {
    openMainPage();
    initNewEntryPage();
    ContactData contact = new ContactData();
	contact.contactFirstName = "Werty";
	contact.contactLastName = "Qwerty";
	contact.contactFistAddress = "3555 Alabama St,\nPortland, 97202\nUSA";
	contact.contactHomePhone = "+1(503)231-5657";
	contact.contactMobilePhone = "+1(503)231-5658";
	contact.contactWorkPhone = "+1(503)231-5659";
	contact.contactFirstEmail = "sc@sc.com";
	contact.contactSecondEmail = "sc1@sc.com";
	contact.contactBirthDay = "1";
	contact.contactBirthMonth = "January";
	contact.contactBirthYear = "1980";
	contact.contactGroup = "tempo";
	contact.contactSecondAddress = "3556 Alabama St,\nPortland, 97202\nUSA";
	contact.contactSecondAddressPhone = "+1(503)231-5659";
	fillContactForm(contact);
    submitContactForm();
    gotoHomePage();
  }
}

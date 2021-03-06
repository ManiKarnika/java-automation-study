
package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class AddNewContact extends TestBase {

  
	
  @Test(dataProvider = "randomValidContactsGenerator")
  public void testAddNewContactWithValidData(ContactData contact) throws Exception {
    app.getNavigationHelper().openMainPage();
    
    //save state
    List<ContactData> oldList = app.getContactHelper().getContacts();
    
    //actions
    app.getNavigationHelper().initNewEntryPage();
	app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactForm();
    app.getNavigationHelper().gotoHomePage();
    
    //save new state 
    List<ContactData> newList = app.getContactHelper().getContacts();
    
    // compare states
    oldList.add(contact);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
    
  }
  
}

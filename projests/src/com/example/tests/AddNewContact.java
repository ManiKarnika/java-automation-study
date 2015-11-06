
package com.example.tests;

import static com.example.fw.ContactHelper.CREATION;
import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class AddNewContact extends TestBase {

  
	
  @Test(dataProvider = "randomValidContactsGenerator")
  public void testAddNewContactWithValidData(ContactData contact) throws Exception {
	  
    app.navigateTo().mainPage();
    
    //save state
    List<ContactData> oldList = app.getContactHelper().getContacts();
    
    //actions
    app.navigateTo().initNewEntryPage();
	app.getContactHelper().fillContactForm(contact, CREATION);
    app.getContactHelper().submitContactForm();
    app.navigateTo().gotoHomePage();
    
    //save new state 
    List<ContactData> newList = app.getContactHelper().getContacts();
    
    // compare states
    oldList.add(contact);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
    
  }
  
}

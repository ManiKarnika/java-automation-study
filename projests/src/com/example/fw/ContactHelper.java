package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitContactForm() {
		click(By.name("submit"));
	}

	public void fillContactForm(ContactData contact) {
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

	public void deleteContact(int index) {
		selectContactByIndex(index+1);
		click(By.xpath("(//input[@name='update'])[2]"));
	}
	
	public void selectContactByIndex(int index) {
		click(By.xpath("(//img[@alt='Edit'])[" + index + "]"));
	}

	public void initContactModification(int index) {
		selectContactByIndex(index+1);
		
	}

	public void submitContactModification() {
		click(By.xpath("(//input[@name='update'])[1]"));
		
	}

	public List<ContactData> getContacts() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//tr[@name='entry']"));
		for (WebElement checkbox : checkboxes) {		
			ContactData contact = new ContactData();
			WebElement cell = (checkbox.findElements(By.tagName("td"))).get(2);
			contact.contactFirstName = cell.getText();
			cell = (checkbox.findElements(By.tagName("td"))).get(1);
			contact.contactLastName = cell.getText();
			cell = (checkbox.findElements(By.tagName("td"))).get(3);
			contact.contactFirstEmail = cell.getText();
			contacts.add(contact); // First, Last names & first email only, but it's possible to add another elements..
		}
		return contacts;
		
		
	}
	
	

}

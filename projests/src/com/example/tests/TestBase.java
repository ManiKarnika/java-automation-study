package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.*;

public class TestBase {
	
	public static ApplicationManager app; 

	@BeforeTest
	public void setUp () throws Exception {
		
		app = new ApplicationManager();
	  }

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	    
	  }
	
	@DataProvider	
	  public Iterator<Object[]> randomValidGroupGenerator() {
		  List<Object[]> list = new ArrayList<Object[]>();
		  for(int i = 0; i < 5; i++) {
			   GroupData group = new GroupData()
					   .withName(generateRandomString())
					   .withHeader(generateRandomString())
					   .withFooter(generateRandomString()); 
			   list.add(new Object[] {group});
		  }
		  return list.iterator();	  
	  }
	  
	  public String generateRandomString() {
		  Random rnd = new Random();
		  
		  if (rnd.nextInt(5) == 0) {
			   return "";
		   } else {
			   return RandomStringUtils.randomAlphabetic(4) + rnd.nextInt();
		   }
	  }
	  
	  @DataProvider	
	  public Iterator<Object[]> randomValidContactsGenerator() {
		  List<Object[]> list = new ArrayList<Object[]>();  		  
		  for (int i = 0; i < 5; i++) {  
			ContactData contact = new ContactData();
			contact.contactLastName = generateRandomString();
			contact.contactFirstName = generateRandomString();
			contact.contactFistAddress = generateRandomAddress();
			contact.contactHomePhone = generateRandomPhoneNumber();
			contact.contactMobilePhone = generateRandomPhoneNumber();
			contact.contactWorkPhone = generateRandomPhoneNumber();
			contact.contactFirstEmail = generateRandomEmail();
			contact.contactSecondEmail = generateRandomEmail();
			contact.contactBirthDay = "31";
			contact.contactBirthMonth = "January";
			contact.contactBirthYear = "1990";
			contact.contactGroup = "tempo";
			contact.contactSecondAddress = generateRandomAddress();
			contact.contactSecondAddressPhone = generateRandomPhoneNumber();
			list.add(new Object[]{contact});
		}
		  return list.iterator();
	  }
	  
	  public String geterateRandomString() {
		  Random rnd = new Random();
			if (rnd.nextInt(6) == 0) {
				return "";
			} else {
				return RandomStringUtils.randomAlphabetic(4) + rnd.nextInt();
			}

	  } 
	  
	  public String generateRandomPhoneNumber() {
		  return "+" + RandomStringUtils.randomNumeric(1) + "(" + RandomStringUtils.randomNumeric(3) + ")" 
				  		+ RandomStringUtils.randomNumeric(7);
	  }
	  
	  public String generateRandomEmail() {
		  return (RandomStringUtils.randomAlphabetic(5) + "@" + RandomStringUtils.randomAlphabetic(5) 
		  				+ "." + RandomStringUtils.randomAlphabetic(3)).toLowerCase();
	  }
	  
	  public String generateRandomAddress() {
		  return (RandomStringUtils.randomAlphabetic(5) + "\n" + RandomStringUtils.randomAlphabetic(5) 
		  				+ "\n" + RandomStringUtils.randomAlphabetic(3)).toLowerCase();
	  }

}

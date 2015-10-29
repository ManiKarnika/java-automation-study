package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

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
			   GroupData group = new GroupData();
			   group.groupName = generateRandomString();
			   group.groupHeader = generateRandomString();
			   group.groupFooter = generateRandomString();
			   list.add(new Object[] {group});
		  }
		  return list.iterator();	  
	  }
	  
	  public String generateRandomString() {
		  Random rnd = new Random();
		  if (rnd.nextInt(5) == 0) {
			   return "";
		   } else {
			   return "test" + rnd.nextInt();
		   }
	  }
	  
	  @DataProvider	
	  public Iterator<Object[]> randomValidContactsGenerator() {
		  List<Object[]> list = new ArrayList<Object[]>();  
		  for (int i = 0; i < 5; i++) {
			ContactData contact = new ContactData();
			contact.contactLastName = generateRandomString();
			contact.contactFirstName = generateRandomString();
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
			list.add(new Object[]{contact});
		}
		  return list.iterator();
	  }
	  
	  public String geterateRandomString() {
		  Random rnd = new Random();
			if (rnd.nextInt(6) == 0) {
				return "";
			} else {
				return "contact" + rnd.nextInt();
			}

	  } 

}

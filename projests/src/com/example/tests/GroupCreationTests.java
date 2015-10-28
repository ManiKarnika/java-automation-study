package com.example.tests;

import static org.testng.Assert.assertEquals; // static - to import method only

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test(dataProvider = "randomValidGroupGenerator")
  public void testGroupCreationWithValidData(GroupData group) throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoGroupsPage();
	
	// save old state
	List<GroupData> oldList = app.getGroupHelper().getGroups(); // list from java.util
	
	// actions
	app.getGroupHelper().initNewGroup();
	app.getGroupHelper().fillGroupForm(group);
	app.getGroupHelper().submitGroupPage();
    app.getNavigationHelper().gotoGroupsPage();
    
    // save new state
    List<GroupData> newList = app.getGroupHelper().getGroups();
    
    //compare states
    assertEquals(newList.size(), oldList.size() + 1);
    
    oldList.add(group); //new group was added to oldList
    Collections.sort(oldList);
    assertEquals(newList, oldList); //oldList + new element
  }
      
}


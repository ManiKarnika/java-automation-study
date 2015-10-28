package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	
	@Test(dataProvider = "randomValidGroupGenerator")
	public void modifySomeGroup(GroupData group) {
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoGroupsPage();
		
		// save old state
		List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		Random rnd = new Random();
		int index = rnd.nextInt(oldList.size()-1);
		
		app.getGroupHelper().initGroupMopdification(index);
		app.getGroupHelper().fillGroupForm(group); 
		app.getGroupHelper().submitGroupMopdification();
		app.getNavigationHelper().gotoGroupsPage();
		
	    // save new state
	    List<GroupData> newList = app.getGroupHelper().getGroups();
	    
	    //compare states
	    //assertEquals(newList.size(), oldList.size() + 1);
	    
	    oldList.remove(index); //new group was added to oldList
	    oldList.add(group);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList); //oldList + new element
		
	}

}

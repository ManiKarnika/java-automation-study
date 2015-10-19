package com.example.tests;

import org.testng.annotations.Test;

import com.example.fw.ApplicationManager;

public class GroupModificationTests extends TestBase {
	
	@Test
	public void modifySomeGroup() {
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoGroupsPage();
		app.getGroupHelper().initGroupMopdification(1);
		GroupData group = new GroupData();
		group.groupName = "new name";
		app.getGroupHelper().fillGroupForm(null, null, group); 
		app.getGroupHelper().submitGroupMopdification();
		app.getNavigationHelper().gotoGroupsPage();
	}

}

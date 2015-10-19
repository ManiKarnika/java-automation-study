package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testNoneEmtyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoGroupsPage();
	app.getGroupHelper().initNewGroup();
	GroupData group = new GroupData();
	group.groupName = "Group.24";
	group.groupHeader = "Header.Group.24";
	group.groupFooter = "Footer.Group.24";
	app.getGroupHelper().fillGroupForm(group);
	app.getGroupHelper().submitGroupPage();
    app.getNavigationHelper().gotoGroupsPage();
  }
      
}


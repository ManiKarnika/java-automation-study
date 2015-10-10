package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testNoneEmtyGroupCreation() throws Exception {
	openMainPage();
	gotoGroupsPage();
	initNewGroup();
	GroupData group = new GroupData();
	group.groupName = "Group.24";
	group.groupHeader = "Header.Group.24";
	group.groupFooter = "Footer.Group.24";
	fillGroupForm(group);
	submitGroupPage();
    gotoGroupsPage();
  }
      
}


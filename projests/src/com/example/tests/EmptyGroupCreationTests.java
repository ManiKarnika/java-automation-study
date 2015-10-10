
package com.example.tests;

import org.testng.annotations.Test;

public class EmptyGroupCreationTests extends TestBase {
   
  @Test
  public void testEmtyGroupCreation() throws Exception {
	openMainPage();
	gotoGroupsPage();
	initNewGroup();
	fillGroupForm(new GroupData("", "", ""));
	submitGroupPage();
    gotoGroupsPage();
  }  

}

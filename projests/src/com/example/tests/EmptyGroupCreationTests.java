
package com.example.tests;

import org.testng.annotations.Test;

public class EmptyGroupCreationTests extends TestBase {
   
  @Test
  public void testEmtyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoGroupsPage();
	app.getGroupHelper().initNewGroup();
	app.getGroupHelper().fillGroupForm(new GroupData("", "", ""));
	app.getGroupHelper().submitGroupPage();
    app.getNavigationHelper().gotoGroupsPage();
  }  

}

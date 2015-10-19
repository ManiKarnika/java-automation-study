package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.GroupData;
import com.example.tests.TestBase;

public class GroupHelper extends HelperBase {

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitGroupPage() {
	    click(By.name("submit"));
	}

	public void fillGroupForm(ApplicationManager applicationManager, TestBase testBase, GroupData group) {
	    type(By.name("group_name"), group.groupName);
	    type(By.name("group_header"), group.groupHeader);
	    type(By.name("group_footer"), group.groupFooter);
	}

	public void initNewGroup() {
		click(By.name("new"));
	}

	public void deleteGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("delete"));
		
	}

	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + index + "]"));
	}

	public void initGroupMopdification(int index) {
		selectGroupByIndex(index); 
		click(By.name("edit"));
	}

	public void submitGroupMopdification() {
		click(By.name("update"));
		
	}

}

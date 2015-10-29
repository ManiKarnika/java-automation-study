package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;

import com.example.tests.GroupData;

public class GroupHelper extends HelperBase {

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitGroupPage() {
	    click(By.name("submit"));
	}

	public void fillGroupForm(GroupData group) {
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

	public void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + (index+1) + "]"));
	}

	public void initGroupMopdification(int index) {
		selectGroupByIndex(index); 
		click(By.name("edit"));
	}

	public void submitGroupMopdification() {
		click(By.name("update"));
		
	}

	public List<GroupData> getGroups() {
		List<GroupData> groups = new ArrayList<GroupData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			GroupData group = new GroupData(); 
			String title = checkbox.getAttribute("title");
			group.groupName =  title.substring("Select (".length(), title.length() - ")".length());
			groups.add(group);
		}
		return groups;
		
	}

}
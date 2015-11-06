package com.example.fw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.GroupData;
import com.example.utils.SortedListOf;

public class GroupHelper extends HelperBase {

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}
	
	public GroupHelper createGroup(GroupData group) {
		manager.navigateTo().groupsPage();
		initNewGroup(group);
		fillGroupForm(group);
		submitGroupMopdification();
		manager.navigateTo().groupsPage();	
		rebuidCache();
		return this;
	}
	
	private SortedListOf<GroupData> cacheGroups;

	public SortedListOf<GroupData> getGroups() {
		
		if (cacheGroups == null) {
			rebuidCache();
		}
		return cacheGroups;		
	}
	

	private void rebuidCache() {
		cacheGroups = new SortedListOf<GroupData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		manager.navigateTo().groupsPage();
		for (WebElement checkbox : checkboxes) {
			String title = checkbox.getAttribute("title");
			String name =  title.substring("Select (".length(), title.length() - ")".length());
			cacheGroups.add(new GroupData().withName(name));
		}
		
	}

	public GroupHelper deleteGroup(int index) {
		selectGroupByIndex(index);
		submitGroupDeletion();
		manager.navigateTo().groupsPage();
		rebuidCache();
		return this;
		
	}

	
	public GroupHelper mofifyGroup(int index, GroupData group) {
		manager.navigateTo().groupsPage();
		initGroupMopdification(index);
		fillGroupForm(group); 
		submitGroupMopdification();
		manager.navigateTo().groupsPage();
		rebuidCache();
		return this;
		
	}
	
	//---------------------------------------------------------------------------------------------------------//

	public GroupHelper submitGroupPage(GroupData group) {
	    click(By.name("submit"));
	    cacheGroups = null;
	    return this;
	}

	public GroupHelper fillGroupForm(GroupData group) {
	    type(By.name("group_name"), group.getGroupName());
	    type(By.name("group_header"), group.getGroupHeader());
	    type(By.name("group_footer"), group.getGroupFooter());
	    return this;
	}

	public GroupHelper initNewGroup(GroupData group) {
		manager.navigateTo().groupsPage();
		click(By.name("new"));
		return this;
	}

	public GroupHelper selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + (index+1) + "]"));
		return this;
	}

	public GroupHelper initGroupMopdification(int index) {
		selectGroupByIndex(index); 
		return this;
	}

	public GroupHelper submitGroupMopdification() {
		click(By.name("update"));
		cacheGroups = null;
		return this;
		
	}


	private void submitGroupDeletion() {
		click(By.name("delete"));
		cacheGroups = null;
	}

}
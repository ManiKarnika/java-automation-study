package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(ApplicationManager manager) {
		super(manager); // super -> base class call
	}

	public void gotoHomePage() {
		click(By.linkText("home"));
	}

	public void mainPage() {
		if (! onMainPage()) {
		    click(By.linkText("home"));
		} 
	}

	private boolean onMainPage() {
		return (driver.findElements(By.id("maintable")).size() > 0); 
	}

	public void groupsPage() {
		if (! onGroupPage()) {
		    click(By.linkText("groups"));
		}
		return;
	}
	
	private boolean onGroupPage() {
		if (driver.getCurrentUrl().contains("/group.php")
				&& driver.findElements(By.name("New group")).size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void initNewEntryPage() {
		click(By.linkText("add new"));
	}

}

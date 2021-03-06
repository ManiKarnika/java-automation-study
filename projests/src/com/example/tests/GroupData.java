package com.example.tests;

public class GroupData implements Comparable<GroupData> {
	
	public String groupName;
	public String groupHeader;
	public String groupFooter;

	public GroupData(String groupName, String groupHeader, String groupFooter) {
		this.groupName = groupName;
		this.groupHeader = groupHeader;
		this.groupFooter = groupFooter;
	}
	
	public GroupData() {
	}





	@Override
	public String toString() {
		return "GroupData [groupName=" + groupName + ", groupHeader=" + groupHeader + ", groupFooter=" + groupFooter
				+ "]";
	}

	@Override
	public int hashCode() { // only hashCode check for logic operations
		//final int prime = 31;
		int result = 1;
		//result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
		// hashCode was disabled for equals operation
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupData other = (GroupData) obj;
		if (groupName == null) {
			if (other.groupName != null)
				return false;
		} else if (!groupName.equals(other.groupName))
			return false;
		return true;
	}

	@Override
	public int compareTo(GroupData other) {
		return this.groupName.toLowerCase().compareTo(other.groupName.toLowerCase());
	}
	
	
}
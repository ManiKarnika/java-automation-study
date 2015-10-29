package com.example.tests;

public class ContactData implements Comparable<ContactData> {
	
	public String contactFirstName;
	public String contactLastName;
	public String contactFistAddress;
	public String contactHomePhone;
	public String contactMobilePhone;
	public String contactWorkPhone;
	public String contactFirstEmail;
	public String contactSecondEmail;
	public String contactBirthDay;
	public String contactBirthMonth;
	public String contactBirthYear;
	public String contactGroup;
	public String contactSecondAddress;
	public String contactSecondAddressPhone;

	public ContactData(String contactFirstName, String contactLastName, String contactFistAddress,
			String contactHomePhone, String contactMobilePhone, String contactWorkPhone, String contactFirstEmail,
			String contactSecondEmail, String contactBirthDay, String contactBirthMonth, String contactBirthYear,
			String contactGroup, String contactSecondAddress, String contactSecondAddressPhone) {
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;
		this.contactFistAddress = contactFistAddress;
		this.contactHomePhone = contactHomePhone;
		this.contactMobilePhone = contactMobilePhone;
		this.contactWorkPhone = contactWorkPhone;
		this.contactFirstEmail = contactFirstEmail;
		this.contactSecondEmail = contactSecondEmail;
		this.contactBirthDay = contactBirthDay;
		this.contactBirthMonth = contactBirthMonth;
		this.contactBirthYear = contactBirthYear;
		this.contactGroup = contactGroup;
		this.contactSecondAddress = contactSecondAddress;
		this.contactSecondAddressPhone = contactSecondAddressPhone;
	}

	public ContactData () {
	}




	@Override
	public String toString() {
		return "ContactData [contactFirstName=" + contactFirstName + ", contactLastName=" + contactLastName + "]";
	}

	@Override
	public int hashCode() {
		//final int prime = 31;
		int result = 1;
		//result = prime * result + ((contactLastName == null) ? 0 : contactLastName.hashCode());
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
		ContactData other = (ContactData) obj;
		if (contactLastName == null) {
			if (other.contactLastName != null)
				return false;
		} else if (!contactLastName.equals(other.contactLastName))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData other) {
		return this.contactLastName.toLowerCase().compareTo(other.contactLastName.toLowerCase());
	}


	
}
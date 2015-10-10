package com.example.tests;

public class ContactData {
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
}
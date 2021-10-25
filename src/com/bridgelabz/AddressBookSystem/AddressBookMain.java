package com.bridgelabz.AddressBookSystem;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("welcome to address book system");
		  ContactDetails newContact = new ContactDetails();
	        newContact.setFirstName("Naveen\n");
	        newContact.setLastName("Pattanashetti\n");
	        newContact.setAddressCity("Bagalkot\n");
	        newContact.setState("Karnataka\n");
	        newContact.setEmail("pattanashettinaveen@gmail.com");
	        newContact.setZip(587103);
	        newContact.setPhoneNumber( 9844415351L);
	        System.out.println("The Contact is :\n" +newContact);

	    }

	}



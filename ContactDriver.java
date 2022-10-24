package contact;

import java.util.Scanner;

import task.Task;

import java.util.*;
import java.io.*;

public class ContactDriver {
	public List<Contact> ContactList = new ArrayList<Contact>();
	Scanner input = new Scanner(System.in);
	
	public ContactDriver() {

	}
	
	public int add(Contact tempContact) {
		Boolean checkLoop = true;
		Boolean canAdd = false;
		int falseCounter;
		int i;
		
		while (checkLoop == true) {
			// checks if the input contact's ID is already in use
			if (ContactList.isEmpty()) {
				checkLoop = false;
				canAdd = true;
			}
			else if (ContactList.isEmpty() != true) {
				falseCounter = 0;
				i = 0;
				for (i = 0; i < ContactList.size(); i++) {
					if (ContactList.get(i).getID().equals(tempContact.getID())) {
						System.out.println("ID already in use");
						canAdd = false;
					}
					
				}
				if (falseCounter == i) {
					canAdd = true;
				}
				checkLoop = false;
			}
		}
		
		if (canAdd == true) {
			System.out.println("Successfully added the new Contact.");
			ContactList.add(tempContact);
			return 0;
		}
		else if (canAdd == false) {
			System.out.println("Failed to add the new Contact.");
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public int delete(String userInput) {
		int falseCounter = 0;
		int i;
		int indexHolder = 0;
		
		for (i = 0; i < ContactList.size(); i++) {
			if (ContactList.get(i).getID().equals(userInput)) {
				System.out.println("Contact with matching ID found.");
				indexHolder = i;
			}
			else {
				falseCounter++;
			}
		}
		
		if (falseCounter == i) {
			System.out.println("No Contact with matching ID found.");
			return 0;
		}
		else {
			System.out.println("Removing Contact.");
			ContactList.remove(indexHolder);
			return 1;
		}
	}
	
	public int view (String userInput) {
		int falseCounter = 0;
		int i;
		int indexHolder = 0;
		
		for (i = 0; i < ContactList.size(); i++) {
			if (ContactList.get(i).getID().equals(userInput)) {
				System.out.println("Contact with matching ID found.");
				indexHolder = i;
			}
			else {
				falseCounter++;
			}
		}
		
		if (falseCounter == i) {
			System.out.println("No Contact with matching ID found.");
			
			return 0;
		}
		else {
			System.out.println("Printing Contact details.");
			System.out.println("ID: " + ContactList.get(indexHolder).getID());
			System.out.println("First Name: " + ContactList.get(indexHolder).getFirstName());
			System.out.println("Last Name: " + ContactList.get(indexHolder).getLastName());
			System.out.println("Phone Number: " + ContactList.get(indexHolder).getPhone());
			System.out.println("Address: " + ContactList.get(indexHolder).getAddress());
			
			return 1;
		}
	}
	
	public int updateFirstName(String searchId, String newName) {
		int falseCounter = 0;
		int i;
		int indexHolder = 0;
		
		for (i = 0; i < ContactList.size(); i++) {
			if (ContactList.get(i).getID().equals(searchId)) {
				System.out.println("Contact with matching ID found.");
				indexHolder = i;
			}
			else {
				falseCounter++;
			}
		}
		
		if (falseCounter == i) {
			System.out.println("No Contact with matching ID found.");
			return 0;
		}
		else {
			System.out.println("Updating Contact.");
			ContactList.get(indexHolder).setFirstName(newName);;
			return 1;
		}
	}
	
	public int updateLastName(String searchId, String newName) {
		int falseCounter = 0;
		int i;
		int indexHolder = 0;
		
		for (i = 0; i < ContactList.size(); i++) {
			if (ContactList.get(i).getID().equals(searchId)) {
				System.out.println("Contact with matching ID found.");
				indexHolder = i;
			}
			else {
				falseCounter++;
			}
		}
		
		if (falseCounter == i) {
			System.out.println("No Contact with matching ID found.");
			return 0;
		}
		else {
			System.out.println("Updating Contact.");
			ContactList.get(indexHolder).setLastName(newName);;
			return 1;
		}
	}
	
	public int updatePhone(String searchId, String newPhone) {
		int falseCounter = 0;
		int i;
		int indexHolder = 0;
		
		for (i = 0; i < ContactList.size(); i++) {
			if (ContactList.get(i).getID().equals(searchId)) {
				System.out.println("Contact with matching ID found.");
				indexHolder = i;
			}
			else {
				falseCounter++;
			}
		}
		
		if (falseCounter == i) {
			System.out.println("No Contact with matching ID found.");
			return 0;
		}
		else {
			System.out.println("Updating Contact.");
			ContactList.get(indexHolder).setPhone(newPhone);;
			return 1;
		}
	}
	
	public int updateAddress(String searchId, String newAddress) {
		int falseCounter = 0;
		int i;
		int indexHolder = 0;
		
		for (i = 0; i < ContactList.size(); i++) {
			if (ContactList.get(i).getID().equals(searchId)) {
				System.out.println("Contact with matching ID found.");
				indexHolder = i;
			}
			else {
				falseCounter++;
			}
		}
		
		if (falseCounter == i) {
			System.out.println("No Contact with matching ID found.");
			return 0;
		}
		else {
			System.out.println("Updating Contact.");
			ContactList.get(indexHolder).setAddress(newAddress);;
			return 1;
		}
	}
	
	public void start() {
		Boolean runtime = true;
		Boolean checkLoop = true; // Used to operate while loops when checking to avoid duplicate IDs
		String userInput;
		String tempID = "0";
		String tempFirstName;
		String tempLastName;
		String tempPhone;
		String tempAddress;
		int indexHolder = 0;
		int i = 0;
		int falseCounter = 0;
		Contact tempContact;
		
		// This tempContact was used to add a contact into the list so the view, update, and delete functions could be
		// tested without adding a new contact through the add function every time
		// Contact tempContact = new Contact("134", "Clayton", "Wyman", "2088090213", "Homelander");
		// ContactList.add(tempContact);
		
		while (runtime == true) {
			System.out.println("What operation would you like to perform with your contacts? (add, delete, update, view, exit)");
			userInput = input.nextLine();
			
			if (userInput.equals("add")) {
				System.out.println("User selected the 'add' option.");
				
				System.out.println("Input a first name (max 10 characters)");
				tempFirstName = input.nextLine();
				System.out.println("Input a last name (max 10 characters)");
				tempLastName = input.nextLine();
				System.out.println("Input a phone number (must be exactly 10 characters)");
				tempPhone = input.nextLine();
				System.out.println("Input an address (max 30 characters)");
				tempAddress = input.nextLine();
				tempContact = new Contact(tempID, tempFirstName, tempLastName, tempPhone, tempAddress);
				this.add(tempContact);
			}
			else if (userInput.equals("delete")) {
				System.out.println("User selected the 'delete' option.");
				System.out.println("Enter an existing ID.");
				userInput = input.nextLine();
				this.delete(userInput);
			}
			else if (userInput.equals("view")) {
				System.out.println("User selected the 'view' option.");
				System.out.println("Enter an existing ID.");
				userInput = input.nextLine();
				this.view(userInput);
			}
			else if (userInput.equals("update")) {
				System.out.println("User selected the 'update' option.");
				System.out.println("Enter an existing ID.");
				tempID = input.nextLine();
			
				System.out.println("What field would you like to change? (first name, last name, phone number, or address)");
				userInput = input.nextLine();
				if (userInput.equals("first name")) {
					System.out.println("Input a first name (max 10 characters)");
					tempFirstName = input.nextLine();
					this.updateFirstName(tempID, tempFirstName);
				}
				else if (userInput.equals("last name")) {
					System.out.println("Input a last name (max 10 characters)");
					tempLastName = input.nextLine();
					this.updateLastName(tempID, tempLastName);
				}
				else if (userInput.equals("phone number")) {
					System.out.println("Input a phone number (must be exactly 10 characters)");
					
					tempPhone = input.nextLine();
					ContactList.get(indexHolder).setPhone(tempPhone);
				}
				else if (userInput.equals("address")) {
					System.out.println("Input an address (max 30 characters)");
					tempAddress = input.nextLine();
					ContactList.get(indexHolder).setAddress(tempAddress);
				}
				else {
					System.out.println("Not a valid field.");
				}
			}
			else if (userInput.equals("exit")) {
				System.out.println("User selected the 'exit' option.");
				runtime = false;
			}
		}
		
		input.close();
	}
	
	public static void main(String[] args) {
		ContactDriver contactDriver = new ContactDriver();
		contactDriver.start();

	}

}

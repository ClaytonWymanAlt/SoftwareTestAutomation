package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import task.Task;
import task.TaskDriver;

import java.io.*;

class ContactDriverTest {

	@Test
	void testContactAdd() {
		ContactDriver contactDriver = new ContactDriver();
		Contact ogContact = new Contact("134", "Clayton", "Wyman", "2088090213", "Homelander");
		Contact newContact = new Contact("134", "Jonathan", "Wyman", "2088090213", "Homelander");
		int testVal;
		
		testVal = contactDriver.add(ogContact);
		assertTrue(testVal == 0);
		
		testVal = contactDriver.add(newContact);
		assertTrue(testVal == 1);
	}
	
	@Test
	void testContactDelete() {
		ContactDriver contactDriver = new ContactDriver();
		Contact ogContact = new Contact("134", "Clayton", "Wyman", "2088090213", "Homelander");
		int testVal;
		
		contactDriver.add(ogContact);
		
		testVal = contactDriver.delete("134");
		assertTrue(testVal == 1);
		
		testVal = contactDriver.delete("134");
		assertTrue(testVal == 0);
	}
	
	@Test
	void testContactView() {
		ContactDriver contactDriver = new ContactDriver();
		Contact ogContact = new Contact("134", "Clayton", "Wyman", "2088090213", "Homelander");
		int testVal;
		
		contactDriver.add(ogContact);
		
		testVal = contactDriver.view("134");
		assertTrue(testVal == 1);
		
		testVal = contactDriver.view("124");
		assertTrue(testVal == 0);
	}
	
	@Test
	void testContactUpdateFirstName() {
		ContactDriver contactDriver = new ContactDriver();
		Contact ogContact = new Contact("134", "Clayton", "Wyman", "2088090213", "Homelander");
		int testVal;
		
		contactDriver.add(ogContact);
		
		testVal = contactDriver.updateFirstName("134", "Jonathan");
		assertTrue(testVal == 1);
		
		testVal = contactDriver.updateFirstName("124", "Jonathan");
		assertTrue(testVal == 0);
	}
	
	@Test
	void testContactUpdateLastName() {
		ContactDriver contactDriver = new ContactDriver();
		Contact ogContact = new Contact("134", "Clayton", "Wyman", "2088090213", "Homelander");
		int testVal;
		
		contactDriver.add(ogContact);
		
		testVal = contactDriver.updateLastName("134", "Jonathan");
		assertTrue(testVal == 1);
		
		testVal = contactDriver.updateLastName("124", "Jonathan");
		assertTrue(testVal == 0);
	}
	
	@Test
	void testContactUpdatePhone() {
		ContactDriver contactDriver = new ContactDriver();
		Contact ogContact = new Contact("134", "Clayton", "Wyman", "2088090213", "Homelander");
		int testVal;
		
		contactDriver.add(ogContact);
		
		testVal = contactDriver.updatePhone("134", "2088090214");
		assertTrue(testVal == 1);
		
		testVal = contactDriver.updatePhone("124", "2088090214");
		assertTrue(testVal == 0);
	}
	
	@Test
	void testContactUpdateAddress() {
		ContactDriver contactDriver = new ContactDriver();
		Contact ogContact = new Contact("134", "Clayton", "Wyman", "2088090213", "Homelander");
		int testVal;
		
		contactDriver.add(ogContact);
		
		testVal = contactDriver.updateAddress("134", "Jonathan");
		assertTrue(testVal == 1);
		
		testVal = contactDriver.updateAddress("124", "Jonathan");
		assertTrue(testVal == 0);
	}
}

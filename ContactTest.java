package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("144", "Joyi", "Jejeybi", "2082499586", "1148 Gridania Rd");
		assertTrue(contact.getID().equals("144"));
		assertTrue(contact.getFirstName().equals("Joyi"));
		assertTrue(contact.getLastName().equals("Jejeybi"));
		assertTrue(contact.getPhone().equals("2082499586"));
		assertTrue(contact.getAddress().equals("1148 Gridania Rd"));
	}
	
	@Test
	void testIdInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "Joyi", "Jejeybi", "2082499586", "1148 Gridania Rd");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Joyi", "Jejeybi", "2082499586", "1148 Gridania Rd");
		});
	}
	
	@Test
	void testFirstNameInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Joyijojoine", "Jejeybi", "2082499586", "1148 Gridania Rd");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", null, "Jejeybi", "2082499586", "1148 Gridania Rd");
		});
	}
	
	@Test
	void testLastNameInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Joyi", "Jejeybireun", "2082499586", "1148 Gridania Rd");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Joyi", null, "2082499586", "1148 Gridania Rd");
		});
	}
	
	@Test
	void testPhoneInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Joyi", "Jejeybi", "20824995861", "1148 Gridania Rd");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Joyi", "Jejeybi", "208249958", "1148 Gridania Rd");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Joyi", "Jejeybi", null, "1148 Gridania Rd");
		});
	}
	
	@Test
	void testAddressInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Joyi", "Jejeybi", "2082499586", "1234567890123456789012345678901");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Joyi", "Jejeybi", "2082499586", null);
		});
	}
}

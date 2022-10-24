package contact;

public class Contact {

	public String id;
	public String firstName;
	public String lastName;
	public String phone;
	public String address;
	
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid ID.");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name.");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name.");
		}
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number.");
		}
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address.");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	public String getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newName) {
		if(newName == null || newName.length()>10) {
			throw new IllegalArgumentException("Invalid first name.");
		}
		
		this.firstName = newName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newName) {
		if(newName == null || newName.length()>10) {
			throw new IllegalArgumentException("Invalid last name.");
		}
		
		this.lastName = newName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String newPhone) {
		if(newPhone == null || newPhone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number.");
		}
		
		this.phone = newPhone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String newAddress) {
		if(newAddress == null || newAddress.length()>30) {
			throw new IllegalArgumentException("Invalid address.");
		}
		
		this.address = newAddress;
	}
}

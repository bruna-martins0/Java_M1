package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private String name;
	private String email;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	private Date birthDate;
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String toString() {
		return ("Name: " + name + " email= " + email + " birthDate= " + sdf.format(birthDate) );
	}
	
}

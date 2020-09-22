package Personas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Persona {
	
	private String name;
	private String email;
	private String city;
	private int amount;
	
	

	public Persona(String name, String email, String city, int amount) {
		this.name = name;
		this.email = email;
		this.city = city;
		this.amount = amount;
	} 
	public Persona() {
		
	}
	

	private List<Persona> loadCSV() throws IOException {
		 BufferedReader br = new BufferedReader(new FileReader("datos.csv"));
		 return br.lines().map(line -> line.split(","))
		 .map(values -> new Persona(values[0], values[1], values[2],
		Integer.parseInt(values[3])))
		 .collect(Collectors.toList());
		}
	public List<Persona> a() throws IOException {
		return this.loadCSV();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", email=" + email + ", city=" + city + ", amount=" + amount + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}




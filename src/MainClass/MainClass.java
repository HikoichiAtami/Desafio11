package MainClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Personas.Persona;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	Persona p = new Persona();
	List<Persona> b = p.a();
	for(int i = 0; i<b.size(); i++) {
		if(b.get(i).getName().equals("Giselle Marshall")){
		System.out.println("nombre: " + b.get(i).getName() + "\ncorreo: " + b.get(i).getEmail() + "\nciudad: " + 
		b.get(i).getCity() + "\nmonto: " + b.get(i).getAmount());
		}
		}
	for(int j = 0; j<b.size(); j++) {
		if(b.get(j).getEmail().equals("imperdiet.non@enim.org")) {
			System.out.println("nombre: " + b.get(j).getName() + "\ncorreo: " + b.get(j).getEmail() + "\nciudad: " + 
					b.get(j).getCity() + "\nmonto: " + b.get(j).getAmount());
		}
	}
	Set<String> set = new HashSet<>();
	for(int i = 0; i<b.size();i++) {
		set.add(b.get(i).getCity());
	}
	System.out.println(set.size());
	
	ArrayList<Integer> inte = new ArrayList<Integer>();
	for(int i = 0; i<b.size(); i++) {
		
		
	}
	int sum = 0, contador1 = 0;
	for(int i = 0; i<b.size(); i++ ) {
		sum += b.get(i).getAmount();
		contador1++;
		
	} 
	System.out.println(sum / contador1);
	
	
	int contador = 0;
	for(int l = 0; l<b.size(); l++) {
		if(b.get(l).getEmail().contains("elit")) {
			contador++;
		}
	}
	System.out.println(contador);
	
	
	for(int i = 0; i<b.size(); i++) {
		if(b.get(i).getAmount())
	
	Mat
	}
	}
	}

	

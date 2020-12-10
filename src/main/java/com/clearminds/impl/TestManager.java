package com.clearminds.impl;

import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager manager = new PersonaManager();
		
		manager.insertarPersona(new Persona("Cristian", "Choto", 23));
	
	}
	
}

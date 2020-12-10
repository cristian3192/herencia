package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager manager;
		try {
			manager = new PersonaManager();
			manager.insertarPersona(new Persona("Cristian", "Choto", 23));
			
		} catch (InstanceException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		
	}
	
}

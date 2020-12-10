package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;


public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() {
		
		ServicioPersonaArchivos servArchivo = new ServicioPersonaArchivos();
		//ServicioPersonaBDD servBDD = new ServicioPersonaBDD();
		//this.serv =servBDD;
		this.serv = servArchivo;
	}

	
	public void insertarPersona (Persona persona){		
		serv.insertar(persona);
	}
	
	
}

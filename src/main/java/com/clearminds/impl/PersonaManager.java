package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
	

		try {
			Class<?> clase = null;
			clase = Class.forName("com.clearminds.impl.ServicioPersonaArchivos");
			this.serv = (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia del ServicioPersona");
		}

	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

}

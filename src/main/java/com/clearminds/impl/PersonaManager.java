package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {
	private ServicioPersona serv;

	public ServicioPersona getServ() {
		return serv;
	}

	public void setServ(ServicioPersona serv) {
		this.serv = serv;
	}

	public PersonaManager() {
		serv = new ServicioPersonaArchivos();

	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);

	}

}

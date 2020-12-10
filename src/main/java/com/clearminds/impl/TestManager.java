package com.clearminds.impl;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Alex", "Mena", 15);
		String nombreClaseBDD = "com.clearminds.impl.ServicioPersonaBDD";
		String nombreClaseArcvivo = "com.clearminds.impl.ServicioPersonaArchivos";
		
		PersonaManager pm;
		try {
			pm = new PersonaManager();
			pm.insertarPersona(p);
		} catch (InstanceException e) {

			e.printStackTrace();
		}

	}

	
}

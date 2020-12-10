package com.clearminds.impl;

import java.io.FileReader;
import java.util.Properties;

import com.clearminds.excepciones.InstanceException;
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

	public PersonaManager() throws InstanceException {
		String nombre = leerPropiedad("clase");
		Class<?> clase;
		try {
			clase = Class.forName(nombre);
			serv = (ServicioPersona) clase.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (InstantiationException e) {

			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}

	}

	public String leerPropiedad(String nombrePropiedad) {
		Properties p = new Properties();
		String respuesta = null;

		try {

			p.load(new FileReader("config.properties"));
			if (p.getProperty(nombrePropiedad) != null) {
				respuesta = p.getProperty(nombrePropiedad);
			}
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

		return respuesta;
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);

	}

}

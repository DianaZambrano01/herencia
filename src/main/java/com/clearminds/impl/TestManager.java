package com.clearminds.impl;

import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Alex", "Mena", 15);

		PersonaManager pm = new PersonaManager();
		pm.insertarPersona(p);

	}

}

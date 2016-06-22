package controller;

import java.util.List;
import model.Modelo;
import model.Persona;

public class ControlDePersona {
	Modelo m;

	public ControlDePersona(String a) {
		m = new Modelo(a);
        m.ReadFile();;
	}

	public List<Persona> PersonaListar() throws Exception {
		return m.DataSender();
    }
	
	public void OrdenarPorDNI(){
		m.OrdenamientoPorDni();
	}
	
	public void OrdenarPorNombres(){
		m.OrdenamientoPorNombre();
	}
	
	public void OrdenarPorApellidos(){
		m.OrdenamientoPorApellido();
	}
	
	public void OrdenarPorEdad(){
		m.OrdenamientoPorEdad();
	}
	public void OrdenarPorSexo(){
		m.OrdenamientoPorSexo();
	}
	    
	public void OrdenarPorFecha(){
		m.OrdenamientoPorFecha();
	}
}
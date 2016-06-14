package model;

import java.util.Date;

public class Persona{
	private String dni;
	private String nombres;
	private String apellidos;
	private String sexo;
	private int edad;
	private Date fecNac;
	private char v;
	
	public Persona() {
		
	}

	public Persona(String dni, String nombres, String apellidos, String sexo, int edad, Date fecNac) {
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.edad = edad;
		this.fecNac = fecNac;
		v = ' ';
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getNombres() {
		return nombres;
	}
	
		
	public String getApellidos() {
		return apellidos;
	}
	
		
	public String getSexo() {
		return sexo;
	}
	
		
	public int getEdad() {
		return edad;
	}
	
		
	public Date getFecNac() {
		return fecNac;
	}
	
	public void setV(char v){
		this.v=v;
	}
	
	public char getV(){
		return v;
	}
	
}

package model;


public class Persona{
	private String dni;
	private String nombres;
	private String apellidos;
	private String sexo;
	private String edad;
	private String fecNac;
	
	
	public Persona() {
		
	}

	public Persona(String dni, String nombres, String apellidos, String sexo, String edad, String fecNac) {
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.edad = edad;
		this.fecNac = fecNac;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getEdad() {
		return edad;
	}
	
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	public String getFecNac() {
		return fecNac;
	}
	
	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}
		
}

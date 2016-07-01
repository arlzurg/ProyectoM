package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ValidadorPersona {
	private List<Persona> Entrada;
	private ArrayList<Persona> Valido = new ArrayList<>();
	private ArrayList<Persona> Invalido = new ArrayList<>();
	private ArrayList<String> Errores = new ArrayList<>();
	
	public ValidadorPersona(List<Persona> entrada) {
		this.Entrada = entrada;
	}
	
	public void Validar(){
		for (int i = 0; i < Entrada.size(); i++) {
			int a=0;
			
			switch (ValidarDNI(Entrada.get(i).getDni())) {
				case -1:
					a+=1;
					break;
				case 0:
					Errores.add("Fila "+ i+"\tERROR 1c0");
					break;
				case 1:
					Errores.add("Fila "+ i+"\tERROR 1c1");
					break;
				case 2:
					Errores.add("Fila "+ i+"\tERROR 1c2");
					break;
				case 3:
					Errores.add("Fila "+ i+"\tERROR 1c3");
					break;
			}
			
			switch (ValidarNombre(Entrada.get(i).getNombres())) {
			case -1:
				a+=1;
				break;
			case 0:
				Errores.add("Fila "+ i+"\tERROR 2c0");
				break;
			case 1:
				Errores.add("Fila "+ i+"\tERROR 2c1");
				break;
			case 2:
				Errores.add("Fila "+ i+"\tERROR 2c2");
				break;
			case 3:
				Errores.add("Fila "+ i+"\tERROR 2c3");
				break;
			}
			
			switch (ValidarApellido(Entrada.get(i).getApellidos())) {
			case -1:
				a+=1;
				break;
			case 0:
				Errores.add("Fila "+ i+"\tERROR 3c0");
				break;
			case 1:
				Errores.add("Fila "+ i+"\tERROR 3c1");
				break;
			case 2:
				Errores.add("Fila "+ i+"\tERROR 3c2");
				break;
			case 3:
				Errores.add("Fila "+ i+"\tERROR 3c3");
				break;
			}
			
			switch (ValidarEdad(Entrada.get(i).getEdad())) {
			case -1:
				a+=1;
				break;
			case 0:
				Errores.add("Fila "+ i+"\tERROR 4c0");
				break;
			case 1:
				Errores.add("Fila "+ i+"\tERROR 4c1");
				break;
			case 2:
				Errores.add("Fila "+ i+"\tERROR 4c2");
				break;
			case 3:
				Errores.add("Fila "+ i+"\tERROR 4c3");
				break;
			}
			
			switch (ValidarSexo(Entrada.get(i).getSexo())) {
			case -1:
				a+=1;
				break;
			case 0:
				Errores.add("Fila "+ i+"\tERROR 5c0");
				break;
			case 1:
				Errores.add("Fila "+ i+"\tERROR 5c1");
				break;
			case 2:
				Errores.add("Fila "+ i+"\tERROR 5c2");
				break;
			case 3:
				Errores.add("Fila "+ i+"\tERROR 5c3");
				break;
			}
			
			switch (ValidarFN(Entrada.get(i).getFecNac(), Entrada.get(i).getEdad())) {
			case -1:
				a+=1;
				break;
			case 0:
				Errores.add("Fila "+ i+"\tERROR 6c0");
				break;
			case 1:
				Errores.add("Fila "+ i+"\tERROR 6c1");
				break;
			case 2:
				Errores.add("Fila "+ i+"\tERROR 6c2");
				break;
			case 3:
				Errores.add("Fila "+ i+"\tERROR 6c3");
				break;
			}
			
			if (a==6)
				Valido.add(Entrada.get(i));
			else 
				Invalido.add(Entrada.get(i));
		}
	}


	@SuppressWarnings("deprecation")
	private int ValidarFN(String fecNac, String edad){
		if (fecNac.isEmpty()) {
			return 0;
		} else {
			if (!fecNac.matches("[[0-9]+/]+")) {
				return 1;
			} else {
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				Date fe;
				try {
					fe = formato.parse(fecNac);
				} catch (ParseException e) {
					return 2;
				}
				Date cur = new Date();
				if (ValidarEdad(edad)==-1) {
					if (cur.getYear()-fe.getYear()==Integer.parseInt(edad)) {
						return -1;
					} else {
						return 3;
					}
				} else {
					return -1;
				}
			}
		}
	}

	private int ValidarSexo(String sexo) {
		if (sexo.isEmpty()) {
			return 0;
		} else {
			if (sexo.matches("[0-9]+")) {
				return 1;
			} else {
				if (sexo.length()>1) {
					return 2;
				} else {
					if (!sexo.matches("[MFmf]")) {
						return 3;
					} else {
						return -1;
					}
				}
			}
		}
	}

	private int ValidarEdad(String edad) {
		if (edad.isEmpty()) {
			return 0;
		} else {
			if (!edad.matches("[0-9]+")) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	private int ValidarApellido(String apellidos) {
		if (apellidos.isEmpty()) {
			return 0;
		} else {
			if (apellidos.matches("[0-9]+")) {
				return 1;
			} else {
				if (apellidos.length()>40) {
					return 2;
				} else {
					return -1;
				}
			}
		}
	}

	private int ValidarNombre(String nombres) {
		if (nombres.isEmpty()) {
			return 0;
		} else {
			if (nombres.matches("[0-9]+")) {
				return 1;
			} else {
				if (nombres.length()>40) {
					return 2;
				} else {
					return -1;
				}
			}
		}
	}

	private int ValidarDNI(String dni) {
		if(dni.isEmpty())
			return 0;
		else {
			if (!dni.matches("[0-9]+")) {
				return 1;
			} else {
				if (dni.length()!=8) {
					return 2;
				} else {
					return -1;
				}
			}
		}
	}

	public void ArchivarValidos() throws IOException {
		FileWriter pr = new FileWriter("Validos.csv",false);
		BufferedWriter bw = new BufferedWriter(pr);
		for (int i = 0; i < Valido.size(); i++) {
			bw.write(Valido.get(i).getDni()+","+Valido.get(i).getNombres()+","+Valido.get(i).getApellidos()+","
					+Valido.get(i).getSexo()+","+Valido.get(i).getEdad()+","+Valido.get(i).getFecNac()+"\n");
		}
		bw.close();
		
	}
	
	public void ArchivarInvalidos() throws IOException {
		FileWriter pr = new FileWriter("Invalidos.csv",false);
		BufferedWriter bw = new BufferedWriter(pr);
		for (int i = 0; i < Invalido.size(); i++) {
			bw.write(Invalido.get(i).getDni()+","+Invalido.get(i).getNombres()+","+Invalido.get(i).getApellidos()
					+","+Invalido.get(i).getSexo()+","+Invalido.get(i).getEdad()+","+Invalido.get(i).getFecNac()+"\n");
		}
		bw.close();
	}
	
	public void ArchivarErrores() throws IOException {
		FileWriter pr = new FileWriter("Errores.csv",false);
		BufferedWriter bw = new BufferedWriter(pr);
		for (int i = 0; i < Errores.size(); i++) {
			bw.write(Errores.get(i)+"\n");
		}
		bw.close();
		
	}

}

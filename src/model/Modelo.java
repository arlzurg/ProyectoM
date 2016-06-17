package model;

<<<<<<< HEAD
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;



public class Modelo implements ICrud<Persona> {

	private List<Persona> mod = new ArrayList<>();
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	File f = null;
    FileWriter fw = null;
    FileReader fr = null;
    BufferedReader br = null;
    PrintWriter pw = null;
    String archivo = "Personas.txt";
    String temporal = "Temporal.txt";
    String datos = "";
	
	public Modelo() {
		//List<Persona> lista = new ArrayList<>();
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		datos = br.readLine();
		while (datos != null) {
			String d,n,a,s="";
			int edad=0;
			Date f;
			StringTokenizer token = new StringTokenizer(datos, ",");

			d=token.nextToken();
			n=(token.nextToken());
			a=(token.nextToken());
			s=(token.nextToken());
			edad=Integer.parseInt(token.nextToken());
			f=(formato.parse(token.nextToken()));
			Persona p = new Persona(d,n,a,s,edad,f);
				

			mod.add(p));
			datos = br.readLine();
		}
		br.close();
		
	}

=======
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo implements ICrud<Persona> {
	private List<Persona> mod = new ArrayList<>();
            File f = null;
            FileWriter fw = null;
            FileReader fr = null;
             BufferedReader br = null;
            PrintWriter pw = null;
            String archivo = "Personas.txt";
            String temporal = "Temporal.txt";
            String datos = "";
		
>>>>>>> refs/remotes/origin/Hecty
	@Override
	public void create(Persona t) {
		if(find(Integer.parseInt(t.getDni())) == null){
			mod.add(t);
		}
	}

	public void update(Persona t) {
		for(int i=0;i<mod.size();i++){
			if(mod.get(i).getDni().equals(t.getDni())){
				mod.set(i, t);
				break;
			}
			else i++;
		}
	}

	public void delete(Persona t) {
		for(int i=0;i<mod.size();i++){
			if(mod.get(i).getDni().equals(t.getDni())){
				mod.remove(i);
				break;
			}
			else i++;
		}
	}

	@Override
	public Persona find(int t) {
		for( Persona a:mod ){
			if(Integer.parseInt(a.getDni()) == t){
				return a;
			}
		}
		return null;
	}
<<<<<<< HEAD
	
	
	@Override
	public List<Persona> ReadAll() {
		return mod;
	}
	
			
=======
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	@Override
	public List<Persona> ReadAll() {
	List<Persona> lista = new ArrayList<>();
            try {
                //abrir archivo para lectura
                fr = new FileReader(archivo);
                //objeto para leer dato del archivo
                br = new BufferedReader(fr);
                // lee el primer dato del archivo
                datos = br.readLine();
                while (datos != null) {
                    Persona p = new Persona();
                    StringTokenizer token = new StringTokenizer(datos, ",");
                    // asignar valores al objeto 
                    p.setDni(token.nextToken());
                    p.setNombres(token.nextToken());
                    p.setApellidos(token.nextToken());
                    p.setSexo(token.nextToken());
                    p.setEdad(Integer.parseInt(token.nextToken()));
                    p.setFecNac(formato.parse(token.nextToken()));
                    //agregar objeto alu a la coleccion
                    p.setDni(p.getDni().replace("\"", ""));
                    p.setNombres(p.getNombres().replace("\"", ""));
                    p.setApellidos(p.getApellidos().replace("\"", ""));
                    p.setSexo(p.getSexo().replace("\"", ""));
                    lista.add(p);
                    datos = br.readLine();
                }
                br.close();
            } catch (IOException | NumberFormatException e) {
            try {
                throw e;
            } catch (IOException | NumberFormatException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
            } catch (ParseException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            return lista;
            }
>>>>>>> refs/remotes/origin/Hecty

}

package model;

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
                    // asignar valores al objeto alu
                    p.setDni(token.nextToken());
                    p.setNombres(token.nextToken());
                    p.setApellidos(token.nextToken());
                    p.setSexo(token.nextToken());
                    p.setFecNac(formato.parse(token.nextToken()));
                    //agregar objeto alu a la coleccion
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

}

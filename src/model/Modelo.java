package model;

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

	@Override
	public void create(Persona t) {
		if(find(Integer.parseInt(t.getDni())) == null){
			mod.add(t);
		}
	}

	@Override
	public void update(Persona t) {
		for(int i=0;i<mod.size();i++){
			if(mod.get(i).getDni().equals(t.getDni())){
				mod.set(i, t);
				break;
			}
			else i++;
		}
	}

	@Override
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
	
	
	@Override
	public List<Persona> ReadAll() {
		return mod;
	}
	
			

}

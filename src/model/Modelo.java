package model;

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> refs/remotes/origin/alejandro
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
<<<<<<< HEAD
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
>>>>>>> refs/remotes/origin/Hecty
=======
>>>>>>> refs/remotes/origin/alejandro
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo implements ICrud<Persona> {
<<<<<<< HEAD
<<<<<<< HEAD

	private List<Persona> mod = new ArrayList<>();
	
=======
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
=======
    
    private List<Persona> mod = new ArrayList<>();
    File f = null;
    FileReader fr = null;
    BufferedReader br = null;
    String archivo = "Personas.csv";
    String datos = "";
>>>>>>> refs/remotes/origin/alejandro

    public Modelo(String a) {
        this.archivo = a;
    }

    private Persona tokeroo(StringTokenizer token, int a) {
        Persona p = new Persona();
        String[] g = new String[6];

        for (int i = 0; i < 6; i++) {
            if (i == a) {
                g[i] = "";
            } else {
                g[i] = token.nextToken();
            }
        }

        p.setDni(g[0]);
        p.setNombres(g[1]);
        p.setApellidos(g[2]);
        p.setSexo(g[3]);
        p.setEdad(g[4]);
        p.setFecNac(g[5]);
        return p;
    }    

	@Override
<<<<<<< HEAD
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
=======
	public void ReadFile() {
		mod.clear();
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            datos = br.readLine();
            while (datos != null) {                                   
                StringTokenizer token = new StringTokenizer(datos, ",");
                if (token.countTokens()==6) {
                	mod.add(tokeroo(token, -1));
				} else {
					char[] abogada = datos.toCharArray();
					ArrayList<Integer> kangaroo = new ArrayList<Integer>();							
					for (int i = 0; i < abogada.length; i++) {
						if (abogada[i]==',') {
							kangaroo.add(i);
						}
					}
					if (kangaroo.get(4)==abogada.length-1) {
						mod.add(tokeroo(token, 5));
					} else {
						if (kangaroo.get(0)==0) {
							mod.add(tokeroo(token, 0));
						} else {
							for (int j = 0; j < kangaroo.size()-1; j++) {
								if (kangaroo.get(j)+1==kangaroo.get(j+1)) {
									mod.add(tokeroo(token, j+1));
								}
							}
						}							
					}
				}
>>>>>>> refs/remotes/origin/alejandro
                datos = br.readLine();
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
        try {
            throw e;
        } catch (IOException | NumberFormatException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        } finally {
        	try {
        		fr.close();
        	} catch (IOException ex) {
        		Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        	}
        }
     }

    @Override
    public List<Persona> DataSender() {
        return mod;
    }
    
    @Override
    public void OrdenamientoPorNombre() {
        int inner, outer;
        Persona temp = new Persona();
        int h = 1;
        while (h <= mod.size() / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < mod.size(); outer++) {
                temp = mod.get(outer);
                inner = outer;

                while (inner > h - 1 && mod.get(inner - h).getNombres().compareTo(temp.getNombres()) > 0) {
                    mod.set(inner, mod.get(inner - h));
                    inner -= h;
                }
                mod.set(inner, temp);
            }
            h = (h - 1) / 3;
        }
    }

    @Override
    public void OrdenamientoPorDni() {
        int inner, outer;
        Persona temp = new Persona();
        int h = 1;
        while (h <= mod.size() / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < mod.size(); outer++) {
                temp = mod.get(outer);
                inner = outer;

                while (inner > h - 1 && mod.get(inner - h).getDni().compareTo(temp.getDni()) > 0) {
                    mod.set(inner, mod.get(inner - h));
                    inner -= h;
                }
                mod.set(inner, temp);
            }
            h = (h - 1) / 3;
        }
    }

    @Override
    public void OrdenamientoPorApellido() {
        int inner, outer;
        Persona temp = new Persona();
        int h = 1;
        while (h <= mod.size() / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < mod.size(); outer++) {
                temp = mod.get(outer);
                inner = outer;

                while (inner > h - 1 && mod.get(inner - h).getApellidos().compareTo(temp.getApellidos()) > 0) {
                    mod.set(inner, mod.get(inner - h));
                    inner -= h;
                }
                mod.set(inner, temp);
            }
            h = (h - 1) / 3;
        }
    }

    @Override
    public void OrdenamientoPorSexo() {
        int inner, outer;
        Persona temp = new Persona();
        int h = 1;
        while (h <= mod.size() / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < mod.size(); outer++) {
                temp = mod.get(outer);
                inner = outer;

                while (inner > h - 1 && mod.get(inner - h).getSexo().compareTo(temp.getSexo()) > 0) {
                    mod.set(inner, mod.get(inner - h));
                    inner -= h;
                }
                mod.set(inner, temp);
            }
            h = (h - 1) / 3;
        }
    }

    @Override
    public void OrdenamientoPorEdad() {
        int inner, outer;
        Persona temp = new Persona();
        int h = 1;
        while (h <= mod.size() / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < mod.size(); outer++) {
                temp = mod.get(outer);
                inner = outer;

                while (inner > h - 1 && mod.get(inner - h).getEdad().compareTo(temp.getEdad()) > 0) {
                    mod.set(inner, mod.get(inner - h));
                    inner -= h;
                }
                mod.set(inner, temp);
            }
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/Hecty
=======
            h = (h - 1) / 3;
        }
    }
>>>>>>> refs/remotes/origin/alejandro

    @SuppressWarnings("deprecation")
	@Override
    public void OrdenamientoPorFecha() {
		int inner, outer;
		ArrayList<Date> DateP = new ArrayList<>();
		
		for (int i = 0; i < mod.size(); i++) {
			String[] feNa = mod.get(i).getFecNac().split("[-/]");				
			if (feNa[0]=="") {
				DateP.add(new Date(0));
			} else {
				DateP.add(new Date(Integer.parseInt(feNa[2]), Integer.parseInt(feNa[1]), Integer.parseInt(feNa[0])));
			}								
		}
				
		Date tempD = new Date();		
		Persona temp = new Persona();
		 
		int h = 1;
		while (h <= mod.size() / 3) {

		      h = h * 3 + 1;
		    }
	    while (h > 0) {
	      for (outer = h; outer < mod.size(); outer++) {
	        temp = mod.get(outer);
	        tempD = DateP.get(outer);
	        inner = outer;
	 
	        while (inner > h - 1 && DateP.get(inner-h).compareTo(tempD) > 0) {
	          mod.set(inner, mod.get(inner-h));
	          DateP.set(inner, DateP.get(inner-h));
	          
	          inner -= h;
	        }
	        mod.set(inner, temp);
	        DateP.set(inner, tempD);
	      }
	      h = (h - 1) / 3;
	    }		
	}
}
package model;

import java.util.ArrayList;
import java.util.List;

public class Modelo implements ICrud<Persona> {
	private List<Persona> mod = new ArrayList<>();
		
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

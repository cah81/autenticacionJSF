package ejemploDataTable.model;

import java.util.List;

public class Provincia {
	private String id;
	private String nombre;
    private List<Municipio> municipios;
    
    
    public Provincia() {
		super();
	}
    
    
    
    public Provincia(String id, String nombre, List<Municipio> municipios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.municipios = municipios;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Municipio> getMunicipios() {
		return municipios;
	}
	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}
	
	
	
	

}

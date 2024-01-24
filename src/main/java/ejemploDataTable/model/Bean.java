package ejemploDataTable.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Bean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String selectedProvince;
    private String selectedMunicipality;
    private List<Provincia> provincias;
    private String additionalInfo;
	
    public Bean() {
    	provincias = new ArrayList<>();
    	Provincia provincia1 = new Provincia();
    	provincia1.setId("p1");
        provincia1.setNombre("Provincia 1");
        
        List<Municipio> municipiosProvincia1 = new ArrayList<>();
        municipiosProvincia1.add(new Municipio("m1", "Municipio 1"));
        municipiosProvincia1.add(new Municipio("m2", "Municipio 2"));
        
        provincia1.setMunicipios(municipiosProvincia1);
        
        Provincia provincia2 = new Provincia();
        provincia2.setId("p2");
        provincia2.setNombre("Provincia 2");
        
        List<Municipio> municipiosProvincia2 = new ArrayList<>();
        municipiosProvincia2.add(new Municipio("m3", "Municipio 3"));
        municipiosProvincia2.add(new Municipio("m4", "Municipio 4"));
        provincia2.setMunicipios(municipiosProvincia2);

        provincias.add(provincia1);
        provincias.add(provincia2);
	}

	
    
    
    
    
    public String getSelectedProvince() {
		return selectedProvince;
	}

	public void setSelectedProvince(String selectedProvince) {
		this.selectedProvince = selectedProvince;
	}

	public String getSelectedMunicipality() {
		return selectedMunicipality;
	}

	public void setSelectedMunicipality(String selectedMunicipality) {
		this.selectedMunicipality = selectedMunicipality;
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}
	
	
	
	
	//metodos de gestion
	public List<Municipio> getMunicipalities() {
        for (Provincia provincia : provincias) {
            if (provincia.getId().equals(selectedProvince)) {
                return provincia.getMunicipios();
            }
        }
        return new ArrayList<>(); // Retorna una lista vacía si no se encuentra la provincia
    }
	
	  public void provinceChanged() {
	        // Lógica para actualizar otras propiedades o componentes de la interfaz de usuario
	        additionalInfo = "Información adicional para " + selectedProvince;

	        // También podrías imprimir un mensaje en la consola
	        System.out.println("Provincia cambiada a: " + selectedProvince);
	    }

	    // Getter y setter para la propiedad additionalInfo
	    public String getAdditionalInfo() {
	        return additionalInfo;
	    }

	    public void setAdditionalInfo(String additionalInfo) {
	        this.additionalInfo = additionalInfo;
	    }
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
}

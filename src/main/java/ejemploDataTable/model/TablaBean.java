package ejemploDataTable.model;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean  
@RequestScoped
public class TablaBean {
	
	private Persona miPersona;
	
	// se coloca estatica para que este disponible todo el tiempo y no se este inicializando
	// el array
	private static ArrayList<Persona> listaPersonas =new ArrayList<Persona>();
	//lo hacemos estatico para que no se borre y figure como modelo de datos
	
	public TablaBean() {
	
		setMiPersona(new Persona());
	//	listaPersonas = new ArrayList<Persona>();//se inicializan los atributos en el constructor
	//	listaPersonas.add(new Persona("carlos","angulo",23,"abogado",25000,"M"));
	//	listaPersonas.add(new Persona("carlos","angulo",42,"ing",30000,"M"));
	}

	
	//getters and setters
	
	


	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(ArrayList<Persona> listaPersonas) {
		TablaBean.listaPersonas = listaPersonas;
	}
	
	//metodos para manipular dentro del formulario del datatable
	
	public void agregarPersona() {
		listaPersonas.add(miPersona);
		 miPersona=new Persona(); //para limpiar el objeto y tenerlo disponible para la creacion
		// de nuevos objetos
		
		
	}


	public Persona getMiPersona() {
		return miPersona;
	}


	public void setMiPersona(Persona miPersona) {
		this.miPersona = miPersona;
	}
	

}

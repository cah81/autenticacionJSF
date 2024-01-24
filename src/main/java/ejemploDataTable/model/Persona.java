package ejemploDataTable.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean  
@RequestScoped
public class Persona {
	
	private String nombre;
	
	private String apellido;
	private int edad;
	private String profesion;
	private double sueldo;
	private String sexo;
	
	
	
	
	//constructores
	
	
	public Persona() {
		super();
	}
	
	
	
	
	
	public Persona(String nombre, String apellido, int edad, String profesion, double sueldo, String sexo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.profesion = profesion;
		this.sueldo = sueldo;
		this.sexo = sexo;
	}





	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}

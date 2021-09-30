package model;

public class Divipola {

	private int idMunicipioDivipola;
	private String nombreMunicipioDivipola;
	private String nombreDepartamentoDivipola;
	public Divipola(int idMunicipioDivipola, String nombreMunicipioDivipola, String nombreDepartamentoDivipola) {
		super();
		this.idMunicipioDivipola = idMunicipioDivipola;
		this.nombreMunicipioDivipola = nombreMunicipioDivipola;
		this.nombreDepartamentoDivipola = nombreDepartamentoDivipola;
	}
	public int getIdMunicipioDivipola() {
		return idMunicipioDivipola;
	}
	public void setIdMunicipioDivipola(int idMunicipioDivipola) {
		this.idMunicipioDivipola = idMunicipioDivipola;
	}
	public String getNombreMunicipioDivipola() {
		return nombreMunicipioDivipola;
	}
	public void setNombreMunicipioDivipola(String nombreMunicipioDivipola) {
		this.nombreMunicipioDivipola = nombreMunicipioDivipola;
	}
	public String getNombreDepartamentoDivipola() {
		return nombreDepartamentoDivipola;
	}
	public void setNombreDepartamentoDivipola(String nombreDepartamentoDivipola) {
		this.nombreDepartamentoDivipola = nombreDepartamentoDivipola;
	}
	
	
	
}

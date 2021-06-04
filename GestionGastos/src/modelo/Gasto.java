package modelo;

import java.sql.Date;

public class Gasto {
	//Creamos los atributos de Gasto
	
	private String nombre = "";
	private double precio = 0;
	private Date date;
	
	

	
	//Creamos Getters, Setters, Constructor y toString
	public Gasto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}


	public Gasto() {
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Gasto [nombre=" + nombre + ", precio=" + precio + "]";
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
}

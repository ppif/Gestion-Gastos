package modelo;

import java.sql.Date;

public class Gasto {

	private String nombre = "";
	private double precio = 0;
	
	
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


	/*
	public void setValue(double valueGasto) {
		// TODO Auto-generated method stub
		
	}


	public Date getDate() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setDate(java.util.Date dateToUpdate) {
		// TODO Auto-generated method stub
		
	}
	}
	
	/*

package modelo;
import java.util.ArrayList;


public class Usuario {

	private String username;
	private String password;
	private ArrayList<Gasto> gastos;

	
	public ArrayList<Gasto> getGastos() {
		return gastos;
	}


	public void setGastos(ArrayList<Gasto> gastos) {
		this.gastos = gastos;
	}


	public Usuario(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}

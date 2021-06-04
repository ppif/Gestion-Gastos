package controler;


import java.util.Scanner;

import modelo.CreacionUsuario;
import modelo.Usuario;

import java.util.ArrayList;

public class ControlerPrincipal {

	public static ArrayList<Usuario> listOfUsers = new ArrayList<>();


	public static void Start() {

		// Declarar nuevo objeto tipo scanner llamado reader para interactuar con
		// cliente.
		// Declarar nuevo objeto de tipo Arraylist de users.
		// Crear el while
		// String de bienvenida: Dar opciones menÃƒÂº (login, createuser...)
		// Crear los ifs

	
	
		Scanner reader = new Scanner(System.in);
		
		
		while (true) {

			// Menu de Opciones
			System.out.println("BIENVENIDO A TU PLATAFORMA DE GESTION DE GASTOS.");
			System.out.println("Por favor, introduce la opcion que desees llevar a cabo");
			System.out.println("");
			System.out.println("1. Crear Cuenta");
			System.out.println("2.Entrar en mi espacio");
			System.out.println("3.Salir");
			
			
			String respuesta1 = reader.nextLine();

			// Condiciones con sus caminos a metodos
			if (respuesta1.equalsIgnoreCase("1")) {
				System.out.println("¡Vamos a crearte una cuenta!");

				CreacionUsuario.crearCuenta();
				}

			else if (respuesta1.equalsIgnoreCase("2")) {
				System.out.println("¡Entremos en tu espacio personal!");
				LoginControler.login();
			}

			else if (respuesta1.equalsIgnoreCase("3")) {
				break;

			}

			else {
				System.out.println("Disculpa, no te he entendido Puedes repetir?");

			}

		}
		reader.close();

	}
	// Metodos que trabajan con el Arraylist

	public static boolean checkIfUserExist(String user) {
		for (int i = 0; i < listOfUsers.size(); i++) {
			if (listOfUsers.get(i).getUsername().equals(user)) {
				return true;
			}
		}
		return false;
	}

	public static Usuario getUserFromList(String user) {
		for (int i = 0; i < listOfUsers.size(); i++) {
			if (listOfUsers.get(i).getUsername().equals(user)) {
				return listOfUsers.get(i);
			}
		}
		return null;
	}

	public static void registerNewUser(Usuario newUser) {
		listOfUsers.add(newUser);
	}

	public static boolean eliminarUsuario(String usuario) {

		if (checkIfUserExist(usuario)) {
			listOfUsers.remove(getUserFromList(usuario));
			return true;
		} else {
			return false;
		}
	}

	public static boolean cambiarNombreUsuario(String usuario, String newUserName) {
	
		if (checkIfUserExist(usuario)) {
			getUserFromList(usuario).setUsername(newUserName);
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean cambiarContrasenia(String usuario, String nuevaContrasenia) {

		if (checkIfUserExist(usuario)) {
			getUserFromList(usuario).setPassword(nuevaContrasenia);
			return true;
		} else {
			return false;
		}
	}
}
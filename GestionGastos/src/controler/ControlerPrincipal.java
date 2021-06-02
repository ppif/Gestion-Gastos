package controler;


import java.util.Scanner;

import modelo.CreacionUsuario;
import modelo.Usuario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ControlerPrincipal {

	public static ArrayList<Usuario> listOfUsers = new ArrayList<>();

	public static void Start() throws NumberFormatException, IOException {

		// Declarar nuevo objeto tipo scanner llamado reader para interactuar con
		// cliente.
		// Declarar nuevo objeto de tipo Arraylist de users.
		// Crear el while
		// String de bienvenida: Dar opciones menu (login, createuser...)
		// Crear los ifs

		Scanner reader = new Scanner(System.in);
		
		while (true) {

			// Menú de Opciones
			
			//int Salir = 3;
			//int CrearCuenta = 1;
			//int Entrarenmiespacio = 2;

			System.out.println("Bienvenido a tu Plataforma de Gestion de Gastos.\n");
			System.out.println("Por favor, introduce la opcion que desees llevar a cabo.\n");
			System.out.println("1. CrearCuenta");
			System.out.println("2. Entrarenmiespacio");
			System.out.println("3. Salir");
			      
			String respuesta1 = reader.nextLine();

			// Condiciones con sus caminos a metodos
			if (respuesta1.equalsIgnoreCase("Crear cuenta")) {
				System.out.println("�Vamos a crearte una cuenta!");

				CreacionUsuario.crearCuenta();
				// GestionGastos.MenuPrincipalGestionGastos(); // esta llamada a método aquí
				// es provisional, estoy probando
				// que funcione.
			}

			else if (respuesta1.equalsIgnoreCase("Entrar en mi espacio")) {
				System.out.println("¡Entremos en tu espacio personal!");
				LoginControler.login();
			}

			else if (respuesta1.equalsIgnoreCase("Salir")) {
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
package modelo;

import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

import controler.ControlerPrincipal;

public class CreacionUsuario {
	
		//Crear Cuentas Usuario
		public static void crearCuenta() {
			
		String usuario = crearUsuario();
		String password = crearPassword();
		imprimirCuentaUsuario(usuario, password);
		
		// Crear nuevo obj User y asignarle usuario y pasword
		
		Usuario newUser = new Usuario(usuario, password);
		ControlerPrincipal.registerNewUser(newUser);
		
		}
		
		// Crear Usuario
		public static String crearUsuario() {
			
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Introduce tu nombre:");
			String nombre1 = reader.nextLine();
			
		return nombre1;
			
		}
		
		//Crear Password
		public static String crearPassword() {
			
		String password = "";

		password = password + createCharRandom() + createIntRandom(10000) + createCharRandom() + createCharRandom()
				+ createIntRandom(596);

		return password;
		
		
		}
		
		//Imprimir Cuenta Usuario
		public static void imprimirCuentaUsuario(String Usuario, String password) {
			
		System.out.println("User Account: ");
		System.out.println("Usuario : " + Usuario);
		System.out.println("Password: " + password);
		
		}

		//Declara y (Crear)Random (Secuencia numeros aleatorios para contraseña)
		public static int createIntRandom(int top) {
			
		Random rand = new Random();
		
		int intRandom = rand.nextInt(top);
		return intRandom;
		
		}

		public static char createCharRandom() {
	
			String alphabetChars3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/+/";

			// Generar random char con rango entre 0 y 10
			
			char charRandom = alphabetChars3.charAt(createIntRandom(alphabetChars3.length()));

			return charRandom;

		}
	
}
		
		
		
		
		
		
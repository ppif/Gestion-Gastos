package controler;


import modelo.CreacionUsuario;
import modelo.Usuario;
import java.util.Scanner;
import java.util.ArrayList;


public class ControlerPrincipal {

	// Creamos objeto de tipo Arraylist de usuarios.
	public static ArrayList<Usuario> listOfUsers = new ArrayList<>();

	// Creamos metodo de inicio del programa:
	public static void Start() {

		// Declaramos nuevo objeto scanner (reader) para interactuar con cliente.
		Scanner reader = new Scanner(System.in);

		// Creamos Menu Principal con: mensaje de bienvenida y opciones de elección:
		// (crear cuenta, entrar en mi espacio, salir)
		while (true) {

			// Menu Principal:
			System.out.println("BIENVENIDO A TU PLATAFORMA DE GESTION DE GASTOS.");
			System.out.println("Por favor, introduce la opcion que desees llevar a cabo");
			System.out.println("Crear cuenta");
			System.out.println("Entrar en mi espacio");
			System.out.println("Salir");

			String respuesta1 = reader.nextLine();

			// Condiciones con sus caminos a metodos (para ejecutar la eleccion del cliente)
			if (respuesta1.equalsIgnoreCase("Crear cuenta")) {
				System.out.println("¡Vamos a crearte una cuenta!");

				CreacionUsuario.crearCuenta();

			}

			else if (respuesta1.equalsIgnoreCase("Entrar en mi espacio")) {
				System.out.println("Â¡Entremos en tu espacio personal!");
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

	// buscarUsuarioValidado metodo
}

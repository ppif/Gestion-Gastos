package gastos;

import java.util.Scanner;

public class ControlerUsuario {

	public static void menu(String usuario) {

		Scanner reader = new Scanner(System.in);
		while (true) {

			System.out.println("MENU PRINCIPAL:");
			System.out.println("Cambiar nombre del usuario");
			System.out.println("Cambiar contraseña");
			System.out.println("Administrar gastos");
			System.out.println("Eliminar la cuenta");
			System.out.println("Salir");
			System.out.println("--------------------------------\n");
			System.out.println("Por favor, introduce la opción que desees llevar a cabo\n");
			
			String SeleccionMenu = reader.nextLine();
			String nuevoNombreContrasenia = "";

			if (SeleccionMenu.equalsIgnoreCase("Cambiar nombre del usuario")) {

				System.out.println("Introduce nuevo nombre de usuario, por favor");
				nuevoNombreContrasenia = reader.nextLine();
				
				if (Controler.cambiarNombreUsuario(usuario, nuevoNombreContrasenia)) {
					System.out.println("El nombre de usuario fue cambiado con exito");
				} else {
					System.out.println("Error. No existe usuario " + usuario);
				}
				
				// GestionGastos.añadirGastos(usuario)
			}

			else if (SeleccionMenu.equalsIgnoreCase("Cambiar contraseña")) {

				System.out.println("Introduce nueva contraseña, por favor");
				nuevoNombreContrasenia = reader.nextLine();
				
				if (Controler.cambiarNombreUsuario(usuario, nuevoNombreContrasenia)) {
					System.out.println("La contraseña fue cambiada con exito");
				} else {
					System.out.println("Error. No existe usuario " + usuario);
				}
				
				// GestionGastos.modificarGastos(usuario)
			}

			else if (SeleccionMenu.equalsIgnoreCase("Administrar gastos")) {

				ControlerGastos.MenuPrincipalGestionGastos(usuario);
			}

			else if (SeleccionMenu.equalsIgnoreCase("Eliminar la cuenta")) {

				if (Controler.eliminarUsuario(usuario)) {
					System.out.println("La cuenta fue eliminada.");
				} else {
					System.out.println("Error. No existe la cuenta de " + usuario);
				}
			}

			else if (SeleccionMenu.equalsIgnoreCase("Salir")) {
				break;
			}

			else {
				System.out.println(
						"Disculpa, no te he entendido. Selecciona una de las opciones que se muestran en pantalla.\n");

			}
		}

	}

	// public static GestionGastosGenerico () {}
}

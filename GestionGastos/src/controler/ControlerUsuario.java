package controler;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Gasto;
import modelo.Usuario;

public class ControlerUsuario {

	//Creamos el menu principal
	//Con opciones y llamadas a metodos contenidos en sus clases correspondientes

	public static void menu(String usuario) {

		Scanner reader = new Scanner(System.in);
		
		String nuevoNombreContrasenia = "";
		//ArrayList<Gasto> gastos = new ArrayList<Gasto>();
		String SeleccionMenu = "";
		
		
		while (true) {

			System.out.println("MENU PRINCIPAL:");
			System.out.println("1.Cambiar nombre de usuario");
			System.out.println("2.Cambiar contraseña");
			System.out.println("3.Administrar gastos");
			System.out.println("4.Eliminar la cuenta");
			System.out.println("5.Salir");
			System.out.println("--------------------------------\n");
			System.out.println("Por favor, introduce la opción que desees llevar a cabo\n");
			
			SeleccionMenu = reader.nextLine();
			

			if (SeleccionMenu.equalsIgnoreCase("1")) {

				System.out.println("Introduce un nuevo nombre de usuario, por favor");
				nuevoNombreContrasenia = reader.nextLine();
				
				if (ControlerPrincipal.cambiarNombreUsuario(usuario, nuevoNombreContrasenia)) {
					System.out.println("El nombre de usuario fue cambiado con exito");
				} else {
					System.out.println("Error. No existe el usuario: " + usuario);
				}
				
				
			}

			else if (SeleccionMenu.equalsIgnoreCase("2")) {

				System.out.println("Introduce una contraseña nueva, por favor");
				nuevoNombreContrasenia = reader.nextLine();
				
				if (ControlerPrincipal.cambiarNombreUsuario(usuario, nuevoNombreContrasenia)) {
					System.out.println("La contraseña fue cambiada con exito");
				} else {
					System.out.println("Error. No existe el usuario: " + usuario);
				}
				
				
			}

			else if (SeleccionMenu.equalsIgnoreCase("3")) {

				ControlerGastos.MenuPrincipalGestionGastos(usuario);
			}

			else if (SeleccionMenu.equalsIgnoreCase("4")) {

				if (ControlerPrincipal.eliminarUsuario(usuario)) {
					System.out.println("La cuenta fue eliminada con exito.");
				} else {
					System.out.println("Error. No existe la cuenta: " + usuario);
				}
			}

			else if (SeleccionMenu.equalsIgnoreCase("5")) {
				break;
			}

			else {
				System.out.println(
						"Disculpa, no te he entendido. Selecciona una de las opciones que se muestran en pantalla.\n");

			}
		}

	}


}

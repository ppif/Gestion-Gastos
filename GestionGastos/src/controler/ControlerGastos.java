package controler;
import java.util.ArrayList;
import java.util.Scanner;

import clasesconmetodos.GastosManipulador;
import modelo.Usuario;
import modelo.Gasto;

public class ControlerGastos {

	public static void MenuPrincipalGestionGastos(String usuario) {
		Usuario usuarioObject = ControlerPrincipal.getUserFromList(usuario);
		ArrayList<Gasto> gasto = usuarioObject.getGastos();
		String SeleccionMenu = "";
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			// nuevo objeto reader para la respuesta y String para almacenarla
			
			System.out.println("MENU PRINCIPAL: GESTIONA TUS GASTOS");
			System.out.println("Añadir gastos");
			System.out.println("Modificar gastos");
			System.out.println("Borrar gastos");
			System.out.println("Listado de gastos");
			System.out.println("Salir");
			System.out.println("--------------------------------\n");
			System.out.println("Por favor, introduce la opción que desees llevar a cabo\n");
			
			SeleccionMenu = reader.nextLine();


			if (SeleccionMenu.equalsIgnoreCase("Añadir gastos")) {
				GastosManipulador.añadirGasto(usuarioObject, gasto, reader);
			}

			else if (SeleccionMenu.equalsIgnoreCase("Modificar gastos")) {
				GastosManipulador.modificarGastos(usuarioObject, gasto, reader);
			}

			else if (SeleccionMenu.equalsIgnoreCase("Borrar gastos")) {
				GastosManipulador.borrarGastos(usuarioObject, gasto, reader);
			}

			else if (SeleccionMenu.equalsIgnoreCase("Listado de gastos")) {
				GastosManipulador.listarGasto(gasto);
			}

			else if (SeleccionMenu.equalsIgnoreCase("Salir")) {
				break;
			}

			else {
				System.out.println(
						"Disculpa, no te he entendido. Selecciona una de las opciones que se muestran en pantalla.\n");
			}		
		}
		
		reader.close();
	}

}

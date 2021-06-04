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
			System.out.println("1.Añadir gastos");
			System.out.println("2.Modificar gastos");
			System.out.println("3.Borrar gastos");
			System.out.println("4.Listado de gastos");
			System.out.println("5.Gastos Por Dias");
			System.out.println("6.Salir");
			System.out.println("--------------------------------\n");
			System.out.println("Por favor, introduce la opción que desees llevar a cabo\n");
			
			SeleccionMenu = reader.nextLine();


			if (SeleccionMenu.equalsIgnoreCase("1")) {
				GastosManipulador.añadirGasto(usuarioObject, gasto, reader);
			}

			else if (SeleccionMenu.equalsIgnoreCase("2")) {
				GastosManipulador.modificarGastos(usuarioObject, gasto, reader);
			}

			else if (SeleccionMenu.equalsIgnoreCase("3")) {
				GastosManipulador.borrarGastos(usuarioObject, gasto, reader);
			}

			else if (SeleccionMenu.equalsIgnoreCase("4")) {
				GastosManipulador.listarGasto(gasto);
			}

			else if (SeleccionMenu.equalsIgnoreCase("5")) {
				GastosManipulador.listarGasto(gasto);
			}
			
			
			else if (SeleccionMenu.equalsIgnoreCase("6")) {
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

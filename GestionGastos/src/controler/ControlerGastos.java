package controler;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Usuario;
import modelo.Gasto;

public class ControlerGastos {

	// importamos util scanner y arraylist para el futuro array de gastos????????
	// nuevo objeto tipo Arraylist de gastos??????????????
	// ArrayList<Gasto> gastos = new ArrayList<Gasto>();???????????
	
	// creamos metodo menu seleccion: MenuPrincipalGestionGastos
	public static void MenuPrincipalGestionGastos(String usuario) {

		Usuario usuarioObject = ControlerPrincipal.getUserFromList(usuario);
		ArrayList<Gasto> gasto = usuarioObject.getGastos();
		
	//creamos bucle con sus condiciones y llamadas a metodos contenidos en GastosManipulador	
		while (true) {

			System.out.println("MENU PRINCIPAL: GESTIONA TUS GASTOS");
			System.out.println("Añadir gastos");
			System.out.println("Modificar gastos");
			System.out.println("Borrar gastos");
			System.out.println("Listado de gastos");
			System.out.println("Salir");
			System.out.println("--------------------------------\n");
			System.out.println("Por favor, introduce la opción que desees llevar a cabo\n");

			// nuevo objeto reader para la respuesta y String para almacenarla
			Scanner reader = new Scanner(System.in);
			String SeleccionMenu = reader.nextLine();

			if (SeleccionMenu.equalsIgnoreCase("Añadir gastos")) {

				// GastosManipulador.añadirGastos(usuario)
			}

			else if (SeleccionMenu.equalsIgnoreCase("Modificar gastos")) {

				// GastosManipulador.modificarGastos(usuario)
			}

			else if (SeleccionMenu.equalsIgnoreCase("Borrar gastos")) {

				// GastosManipulador.borrarGastos(usuario)
			}

			else if (SeleccionMenu.equalsIgnoreCase("Listado de gastos")) {

				// GastosManipulador.listarGastos(usuario)
			}

			else if (SeleccionMenu.equalsIgnoreCase("Salir")) {
				break;
			}

			else {
				System.out.println(
						"Disculpa, no te he entendido. Selecciona una de las opciones que se muestran en pantalla.\n");

			}
			
			reader.close();

		}

		

	}

}

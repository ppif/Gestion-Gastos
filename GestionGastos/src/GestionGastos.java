import java.util.Scanner;


public class GestionGastos {

	//importar util scanner
	//crear método start: MenuPrincipalGestionGastos
	//crear el while
	//String con las opciones de gestión
	//reader para la respuesta y generar los ifs
	//crear métodos (añadirGastos,modificarGastos,borrarGastos, listarGastos y salir)
	
	
	public static void MenuPrincipalGestionGastos() {
		
		
		while (true) {
		
		System.out.println("MENU PRINCIPAL: GESTIONA TUS GASTOS");
		System.out.println("Añadir gasto");
		System.out.println("Modificar gasto");
		System.out.println("Borrar gasto");
		System.out.println("Listado de gastos");
		System.out.println("Salir");
		System.out.println("--------------------------------\n");
		System.out.println("Por favor, introduce la opción que desees llevar a cabo\n");
		
		Scanner reader = new Scanner(System.in);
		String SeleccionMenu = reader.nextLine();
		
		
		if (SeleccionMenu.equals("Añadir gasto")) {
			
		}
		
		
		else if (SeleccionMenu.equals("Modificar gasto")) {}
		
		else if (SeleccionMenu.equals("Borrar gasto")) {}
		
		else if (SeleccionMenu.equals("Listado de gastos")) {}
		
		else if (SeleccionMenu.equals("Salir")) {
			break;
		}
		
		else {
			System.out.println ("Disculpa, no te he entendido. Selecciona una de las opciones que se muestran en pantalla.\n");
			
		}
		
		
	}
	
	}
	
}

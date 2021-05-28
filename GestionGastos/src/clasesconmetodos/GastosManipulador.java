
/*
package clasesconmetodos;


public class GastosManipulador {


				Scanner reader = new Scanner(System.string);
				System.out.println("Que quiere  ("anadir gasto","salir");
				String userName = reader.nextLine();

			
				
				if (reader.equals("anadir gastos")) {
					
					System.out.println("nombre de gasto");
					
				
				string nombreDeGasto = crearGasto.indexOf(" ");
				
			    String nombreGasto = crearGasto.substring.ArrayList<Gasto> gastos;
				
				return gasto;
			}
			
			
			if (reader.equals("Salir")) break;
			}
	}
	
	*/

package clasesconmetodos;

import modelo.Gasto;
import modelo.Usuario;

import controler.ControlerPrincipal;
import modelo.Gasto;
import modelo.Usuario;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class GastosManipulador {

	public static void añadirGasto(Usuario usuarioObject, ArrayList<Gasto> gastos, Scanner scanner) {

		String nombre;
		double precio;
		Gasto gasto = new Gasto("", 0.0);
		boolean mas = false;
		
		do {
			
			System.out.println("Escribe nombre del gasto, por favor:");
			nombre = scanner.nextLine(); 
			System.out.println("Escribe el precio, por favor:");
			precio = scanner.nextDouble();
			
			gasto.setNombre(nombre);
			gasto.setPrecio(precio);
			gastos.add(gasto);
			usuarioObject.setGastos(gastos);
		 
			System.out.println("El gasto fue añadido" + "\n" +
			"Quiere añadir más gastos?");
			mas = scanner.hasNextBoolean();
		} while (mas);
	}

	public static void listarGasto(ArrayList<Gasto> gastos) {

		System.out.println("\nLista de gastos: \n");

		for (Gasto gasto : gastos) {
			System.out.println(gasto.getNombre() + ": " + gasto.getPrecio());
		}
	}

	public static void borrarGastos(Usuario usuario) {
		usuario.setGastos(new ArrayList<Gasto>());

		System.out.println("Gastos fueron borrados");
	}

	public static void modificarGastos(Usuario usuarioObject, ArrayList<Gasto> gastos, Scanner scanner) {

		String gastoName = "";
		Gasto selectedGasto = new Gasto();
		
		listarGasto(gastos);
		System.out.println("\nElije el gasto que quieres modificar: ");
		gastoName = scanner.nextLine();
		

		for (Gasto gasto: gastos) {
			if (gasto.getNombre().equalsIgnoreCase(gastoName)) {
				
			} else {
				System.out.println("El nombre del gasto no coincide. Comprueba si has escrito el nombre correctamente!");
			}
		}
		
		
		int count = 0;

		System.out.print("¿Quieres actualizar el valor de los gastos? (S / N) ");
		String updateValueAnswer = reader.next();

		if (updateValueAnswer.equalsIgnoreCase("Y")) {
			System.out.println("Ingrese el valor del gasto: ");
			double valueGasto = reader.nextDouble();
			gasto.setValue(valueGasto);
		}

		System.out.print("Fecha de gasto: " + gasto.getDate());
		System.out.print(". Â¿Quieres actualizar la fecha de gastos? (Y/N) ");
		String updateDateAnswer = reader.next();

		if (updateDateAnswer.equalsIgnoreCase("Y")) {
			System.out.println("Ingrese la fecha del gasto (dd/MM/yyyy): ");
			String dateGasto = reader.next();

			java.util.Date dateToUpdate = gasto.getDate();
			;
			try {
				dateToUpdate = new SimpleDateFormat("dd/MM/yyyy").parse(dateGasto);
			} catch (ParseException e) {
				System.out.print("Â¡No actualizado! Formato invÃ¡lido!");
				e.printStackTrace();
			}
			gasto.setDate(dateToUpdate);
		}

		if (usuarioValidated.getGastos().size() == count)
			System.out.println(gastoName + " extraviado ....\n");
	}
}

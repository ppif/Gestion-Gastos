
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
		String gastoName = "";
		double precio = 0.0;
		Gasto gasto = new Gasto("", 0.0);
		boolean mas = false;

		do {
			
			
			
			System.out.println("Escribe nombre del gasto, por favor:");
			gastoName = scanner.nextLine();
			
			System.out.println("Escribe el precio, por favor:");
			precio = Double.parseDouble(scanner.nextLine().replace(",", "."));
			gasto.setNombre(gastoName);
			gasto.setPrecio(precio);
			gastos.add(new Gasto(gastoName, precio));
			usuarioObject.setGastos(gastos);

			System.out.println("El gasto fue añadido" + "\n" + "Quiere añadir más gastos?(y/n)");
			mas = scanner.nextLine().equalsIgnoreCase("y") ? true : false;
		} while (mas);
	}

	public static void listarGasto(ArrayList<Gasto> gastos) {

		System.out.println("\nLista de gastos: \n");

		for (Gasto gasto : gastos) {
			System.out.println(gasto.getNombre() + ": " + gasto.getPrecio());
		}
		
		if (gastos.isEmpty()) {
			System.out.println("No hay gastos!");
		}
		
		System.out.println("");
	}

	public static void borrarGastos(Usuario usuarioObject, ArrayList<Gasto> gastos, Scanner scanner) {
		String gastoName = "";
		Gasto gasto = new Gasto();
		boolean mas = false;

		do {
			listarGasto(gastos);
			System.out.print("Todos");
			System.out.println("\nElije el gasto que quieres borrar: ");
			gastoName = scanner.nextLine();

			if (gastoName.equalsIgnoreCase("todos")) {
				gastos.removeAll(gastos);
				usuarioObject.setGastos(gastos);
				System.out.println("Gastos fueron borrados");
			} else {
				gasto = sacarGastoDeLista(gastos, gastoName);

				if (!sacarGastoDeLista(gastos, gastoName).getNombre().equals("null")) {			
					gastos.remove(gasto);
					usuarioObject.setGastos(gastos);
					System.out.println("El gasto fue borrado" + "\n" + "Quiere borrar otro gasto?(y/n)");
					mas = scanner.nextLine().equalsIgnoreCase("y") ? true : false;
					
				} else {
					System.out.println("El nombre del gasto no coincide. Comprueba si has escrito el nombre correctamente!\n");
				}
			}
			System.out.println("");
		} while (mas);
	}

	public static void modificarGastos(Usuario usuarioObject, ArrayList<Gasto> gastos, Scanner scanner) {
		String gastoName = "";
		Gasto gasto = new Gasto();
		double precio = 0.0;
		boolean mas = false;

		do {
			listarGasto(gastos);
			System.out.println("\nElije el gasto que quieres modificar: ");
			gastoName = scanner.nextLine();
			gasto = sacarGastoDeLista(gastos, gastoName);

			if (!sacarGastoDeLista(gastos, gastoName).equals("null")) {
				System.out
						.println("Precio del gasto es " + gasto.getPrecio() + "\nIntroduce nuevo precio, por favor: ");
				precio = Double.parseDouble(scanner.nextLine().replace(",", "."));
				gasto.setPrecio(precio);
				usuarioObject.setGastos(gastos);

				System.out.println("El gasto fue modificado" + "\n" + "Quiere modificar otro gasto?(y/n)");
				mas = scanner.nextLine().equalsIgnoreCase("y") ? true : false;
			} else {
				System.out
						.println("El nombre del gasto no coincide. Comprueba si has escrito el nombre correctamente!");
			}

		} while (mas);
	}

	public static Gasto sacarGastoDeLista(ArrayList<Gasto> gastos, String gastoName) {
		Gasto gasto = new Gasto("null", 0.0);

		for (Gasto deGasto : gastos) {
			if (deGasto.getNombre().equalsIgnoreCase(gastoName)) {
				return deGasto;
			}
		}
		return gasto;
	}

	public static void DiaGastoMayor(ArrayList<Gasto> gastos){
		
		String gastoName = "";
		double precio = 0.0;
		Gasto gasto = new Gasto("", 0.0);
		boolean mas = false;

Scanner teclado = new Scanner(System.in);

 	// Solicitamos la cantidad de dias a procesar:
	System.out.print("Ingrese la cantidad de dias: ");

	int cantDias = teclado.nextInt();
		 
		        int[] dato = new int[cantDias];
		        int gastomayor = 0, gastoTotal = 0, dia = 0;

	String[] strDias = new String[7];
		        strDias[0] = "Lunes";
		        strDias[1] = "Martes";
		        strDias[2] = "Miercoles";
		        strDias[3] = "Jueves";
		        strDias[4] = "Viernes";
		        strDias[5] = "Sabado";
		        strDias[6] = "Domingo";

	//Creamos un ciclo for para repetir los datos segun la cantidad de dias:
		        for (int i = 0; i < cantDias; i++){
		            System.out.print("Ingrese los gastos del dia " + strDias[i%7] + ": " );
		                dato[i] = teclado.nextInt();
		               
		 
		        }
		 
		        for (int i = 0; i < cantDias; i++){
		            System.out.println(dato[i]);
		            gastoTotal += dato[i];
		             if (dato[i] > gastomayor){
		                gastomayor = dato[i];
		                dia = i;
		             }
		        }
		        System.out.println("");
		        System.out.println("El mayor gasto fue de " + gastomayor + " del dia " + strDias[dia] );
		        System.out.println("El gasto total fue de: " + gastoTotal );
		    
		 
		
	}	
		
		
		
		
		
		
		
		
		
	}
	
	

		
		
		
		
 
       
		
		
		
		
 

        
	


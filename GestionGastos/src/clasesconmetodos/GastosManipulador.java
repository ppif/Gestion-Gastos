package clasesconmetodos;

import controler.ControlerPrincipal;
import modelo.Gasto;
import modelo.Usuario;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class GastosManipulador {

	
	public static void borrarGastos(String usuario) {
		ControlerPrincipal.getUserFromList(usuario).setGastos(new ArrayList<Gasto>());
		
		
		
	}
	
	public static void modificarGastos(Scanner reader, Usuario usuarioValidated) {	

		System.out.println("\n Introduce tu gasto: ");
		String gastoName = reader.next();
		
		int count = 0;
		for (Gasto gasto :usuarioValidated.getGastos()) {

			if (gastoName.equals(gasto.getNombre())) {
				
				System.out.print("Valor del gasto: " + gasto.getPrecio());
				System.out.print(". ¿Quieres actualizar el valor de los gastos? (S / N) ");
				String updateValueAnswer = reader.next();
				
				if (updateValueAnswer.equalsIgnoreCase("Y")) {
					System.out.println("Ingrese el valor del gasto: ");
					double valueGasto = reader.nextDouble();
					gasto.setValue(valueGasto);
				}
				
				System.out.print("Fecha de gasto: " + gasto.getDate());
				System.out.print(". ¿Quieres actualizar la fecha de gastos? (Y/N) ");
				String updateDateAnswer = reader.next();
				
				if (updateDateAnswer.equalsIgnoreCase("Y")) {
					System.out.println("Ingrese la fecha del gasto (dd/MM/yyyy): ");
					String dateGasto = reader.next();
					
					java.util.Date dateToUpdate = gasto.getDate();;
					try {
						dateToUpdate = new SimpleDateFormat("dd/MM/yyyy").parse(dateGasto);
					} catch (ParseException e) {
						System.out.print("¡No actualizado! Formato inválido!");
						e.printStackTrace();
					} 
					gasto.setDate(dateToUpdate);
				}
					
				usuarioValidated.actualizar(count , gasto);
				
				break;
			}
			
			count++;
		}
		
		if (usuarioValidated.getGastos().size() == count) 
			System.out.println(gastoName + " extraviado ....\n");
	}

		public static void modificarGastos(String usuario) {
			// TODO Auto-generated method stub
			
		}

		
			
		}


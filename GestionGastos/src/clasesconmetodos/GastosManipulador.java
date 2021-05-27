package clasesconmetodos;
import java.util.Scanner;
import modelo.Gasto;
import modelo.Usuario;

public class GastosManipulador {
	
	public static void listarGasto (Scanner reader, Usuario usuarioValidated) {
			
				
				int contadorparalistado = 1;
				System.out.println("\nLista de gastos: ");
				
				for (Gasto gasto : usuarioValidated.getGastos()) {

				System.out.println("- " + contadorparalistado + " " + gasto);
				contadorparalistado++;
			
	}

}
}
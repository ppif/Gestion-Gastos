import java.util.Scanner;
import java.util.Scanner;

public class Controler {

	public static void Start () {
	
Scanner reader = new Scanner(System.in);
	
	System.out.println("Bienvenido/a!! Introduce tu nombre:");
	String nombre1 = reader.nextLine();
	
	

		CreacionCuenta.crearCuenta("cuenta");
		//GestionGastos.añadirGastos
		//GestionGastos.modificarGastos
		//GestionGastos.borrarGastos
		//GestionGastos.listarGastos
		//GestionGastos.salir
		reader.close();
	}
}


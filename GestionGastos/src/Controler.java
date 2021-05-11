import java.util.Scanner;
import java.util.Scanner;

public class Controler {

	public static void Start () {
	
	//Crear el while
	//Dar bienvenida. Preguntar si es nuevo/a. Si no lo es, dar paso a Login.
	
	
		
		while (true) {	
	
	Scanner reader = new Scanner(System.in);

	System.out.println("Bienvenido/a a tu espacio de gestión de gastos. ¿Eres nuevo/a aquí? Responde Quit en caso de que quieras salir de él.");
	String respuesta1 = reader.nextLine();
	
	if (respuesta1.equals("Si")){
		
		System.out.println ("¡Pues vamos a crearte una!");
		//CreacionCuenta.crearCuenta();
	}
	
	else if (respuesta1.equals("No")) {
		
		//Login.login();
	}
		
		
	else if (respuesta1.equals("Quit")) {
	
	break;
	
	}
	
	}	
		
	}
}

		//GestionGastos.añadirGastos
		//GestionGastos.modificarGastos
		//GestionGastos.borrarGastos
		//GestionGastos.listarGastos
		//GestionGastos.salir
		//reader.close();
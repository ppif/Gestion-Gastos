import java.util.Scanner;
import java.util.Scanner;

public class Controler {

	public static void Start () {
	

		//Dar bienvenida. Preguntar si es nuevo/a. Si no lo es, dar paso a Login.
		//Crear el while
		
	
	Scanner reader = new Scanner(System.in);

	System.out.println("Bienvenido/a a tu espacio de gestión de gastos. ¿Eres nuevo/aquí?");
	String respuesta1 = reader.nextLine();
	
	if (respuesta1.equals("Si")){
		
		System.out.println ("¡Pues vamos a crearte una!");
		//CreacionCuenta.crearCuenta();
	}
	
	else {
		
		//Login.login();
		System.out.println ("¡Pues vamos a loguearte!");
	}
		
		
	}//GestionGastos.añadirGastos
		//GestionGastos.modificarGastos
		//GestionGastos.borrarGastos
		//GestionGastos.listarGastos
		//GestionGastos.salir
		//reader.close();
}


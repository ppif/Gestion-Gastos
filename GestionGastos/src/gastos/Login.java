package gastos;
import java.util.Scanner;

public class Login {
	
	//pedir al usuario nombre y contraseña
	//con sus mensajes por pantalla
	
	
	//test first commit
	//commit 1
	
	public static void login() {
		Scanner scanner = new Scanner(System.in);
		String usuario = "";
		String password = "";
	
		
		System.out.print("Por favor, escribe su nombre de usuario\n");
		usuario = scanner.nextLine();
		
		System.out.print("Por favor, escribe contraseña\n");
		password = scanner.nextLine();
		
		
		//compare with array of users
		
		if (Controler.checkIfUserExist(usuario) &&
				Controler.getUserFromList(usuario).getPassword().equals(password)) {
			System.out.println("Bienvenido " + usuario);
			//return añadir metodo que te lleva a ControlerUsuario;
			ControlerGastos.MenuPrincipalGestionGastos(usuario);
		} else {
			System.out.println("Your password or login is not correct. Try again please");
			//return "0";
		}
		
	}
	
}

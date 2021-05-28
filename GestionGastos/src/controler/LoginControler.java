package controler;


import java.util.Scanner;

public class LoginControler {
	
	//pedir al usuario nombre y contraseña
	//con sus mensajes por pantalla
	
	
	//test first commit
	//commit 1
	
	//first commit branch2
	
	public static void login() {
		
		Scanner scanner = new Scanner(System.in);
		String usuario = "";
		String password = "";
	
		
		System.out.print("Por favor, escribe su nombre de usuario\n");
		usuario = scanner.nextLine();
		
		System.out.print("Por favor, escribe contraseña\n");
		password = scanner.nextLine();
		
		
		//compare with array of users
		
		if (ControlerPrincipal.checkIfUserExist(usuario) &&
				ControlerPrincipal.getUserFromList(usuario).getPassword().equals(password)) {
			
			System.out.println("Bienvenido " + usuario);
	
			ControlerUsuario.menu(usuario);
			ControlerGastos.MenuPrincipalGestionGastos(usuario);
			
		} else {
			System.out.println("La contraseña o login no es correcto. Prueba otra vez");
		}
		scanner.close();
	}
}
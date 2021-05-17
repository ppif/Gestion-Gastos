import java.util.Scanner;

public class Login {
	
	//pedir al usuario nombre y contraseña
	//con sus mensajes por pantalla
	
	
	//test first commit
	//commit 1
	
	public static void login() {
		Scanner scanner = new Scanner(System.in);
		String login = "";
		String password = "";
	
		
		System.out.print("Por favor, escribe su nombre de usuario\n");
		login = scanner.nextLine();
		
		System.out.print("Por favor, escribe contraseña\n");
		password = scanner.nextLine();
		
		
		//compare with array of users
		
		if (Controler.checkIfUserExist(login) &&
				Controler.getUserFromList(login).getPassword().equals(password)) {
			System.out.println("Bienvenido " + login);
			//return login;
			GestionGastos.MenuPrincipalGestionGastos();
		} else {
			System.out.println("Your password or login is not correct. Try again please");
			//return "0";
		}
		
	}
	
}

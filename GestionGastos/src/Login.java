import java.util.Scanner;

public class Login {
	
	//pedir al usuario nombre y contraseña
	//con sus mensajes por pantalla
	
	
	//test first commit
	//commit 1
	
	public static String login() {
		
		String login = "";
		String password = "";
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Por favor, escribe su nombre de usuario");
		login = scanner.next();
		
		System.out.print("Por favor, escribe contraseña");
		password = scanner.next();
		
		
		//compare with array of users
		
		if (!CreacionCuenta.getUser(login).equals(null) &&
				CreacionCuenta.getPassword(password).equals(password)) {
			System.out.println("Bienvenido" + login);
			return login
		} else {
			System.out.println("Your password or login is not correct. Try again please");
			return "0";
		}
		
	}
	
}


import java.util.Random;

public class CreacionCuenta {
	
		//Crear Cuentas Usuario
		public static void crearCuenta(String porConsola) {
		
			
			
		String usuario = crearUsuario(porConsola);
		String password = crearPassword();
		imprimirCuentaUsuario(usuario, password);
	
		}
		
		// Crear Usuario
		public static String crearUsuario(String crearUsuario) {
			
	
		return crearUsuario;
			
		}
		
		//Crear Password
		public static String crearPassword() {
			
		String password = "";

		password = password + createCharRandom() + createIntRandom(10000) + createCharRandom() + createCharRandom()
				+ createIntRandom(596);

		return password;
		
		
		}
		
		//Imprimir Cuenta Usuario
		public static void imprimirCuentaUsuario(String Usuario, String password) {
			
		System.out.println("User Account: ");
		System.out.println("Usuario : " + Usuario);
		System.out.println("Password: " + password);
		
		}

		//Declara y (Crear)Random (Secuencia numeros aleatorios para contraseña)
		public static int createIntRandom(int top) {
			
		Random rand = new Random();
		
		int intRandom = rand.nextInt(top);
		return intRandom;
		
		}

		public static char createCharRandom() {
	
			String alphabetChars3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/+/";

			// Generar random char con rango entre 0 y 10
			
			char charRandom = alphabetChars3.charAt(createIntRandom(alphabetChars3.length()));

			return charRandom;

		}
	
}
		
		
		
		
		
		
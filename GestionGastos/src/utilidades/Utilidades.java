package utilidades;

import javax.swing.JOptionPane;

public class Utilidades {

	//Metodo para limitar el acceso a un administrador(pepe)
	public static void optionPanel(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "admin";
		
		String pass = "";
		
		
		//si clave no es igual a pass .....
		while (clave.equals(pass)==false){
		
			pass = JOptionPane.showInputDialog("Introduce la contraseña de administrador");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contraseña Incorrecta");
				
			}
		}
		System.out.println("Contraseña correcta. Acceso permitido");
		
		
	}

}
	
	
	
	


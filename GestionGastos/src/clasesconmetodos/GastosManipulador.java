package clasesconmetodos;

import controler.ControlerPrincipal;
import modelo.Gasto;
import modelo.Usuario;
import java.util.ArrayList;

public class GastosManipulador {

	
	public static void borrarGastos(String usuario) {
		ControlerPrincipal.getUserFromList(usuario).setGastos(new ArrayList<Gasto>());
		//no funciona
	}
}

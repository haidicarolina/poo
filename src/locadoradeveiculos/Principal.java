package locadoradeveiculos;

import locadoradeveiculos.controller.Controller;

public class Principal {

	public static void main(String[] args) {		
		Controller controladora = new Controller();
		controladora.exibeMenu();
	}
	
}

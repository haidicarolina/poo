package locadoradeveiculos.view;

import javax.swing.JOptionPane;

public class EntradaSaida {

	public static String solicitaString(String parametro) {
		String input = JOptionPane.showInputDialog("Informe " + parametro); 
		return input;
	}
	
	public static int solicitaInt(String parametro) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Informe " + parametro));
		return input;
	}
}

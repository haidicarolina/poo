package locadoradeveiculos.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaSaida {

	public static String solicitaString(String parametro) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe " + parametro);
		return input.nextLine();
	}
	
	public static int solicitaInt(String parametro) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe " + parametro);
		return input.nextInt();
	}
}

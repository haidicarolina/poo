package locadoradeveiculos.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import locadoradeveiculos.model.Modelo;

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

	public static Boolean solicitaBol(Boolean parametro) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe" + parametro);
		return input.nextBoolean();
	}

	public static Date solicitaData(Date data) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a data no formato dd/MM/yyyy: " );
		String inputData = input.nextLine();

		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			data = dateFormat.parse(inputData);
		} catch (ParseException e ) {
			System.out.println("Formato de data inválido!");
			e.printStackTrace();
		} 

		return data;
	}


	// public static Modelo solicitaModelo(Modelo parametro) {
	// 	Scanner input = new Scanner(System.in);
	// 	System.out.println("Informe" + parametro);
	// 	return input.
	// }
}

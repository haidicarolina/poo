package locadoradeveiculos.controller;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import locadoradeveiculos.model.Cliente;

public class Controller {
	
	private ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
	
	public void exibeMenu() {
		int op = 0;
		 do {
           op = menu();
           System.out.println(op);
           switch (op) {
           	   case 0: break; 
               case 1: 
                        break;	                    
               case 2:  //new VeiculoController().listarVeiculos(con);
	                     break;      
               case 3:  listaDeClientes.add(new ClienteController().createCliente());
	                    break;
               default: break;
	              }
       } while (op > 0 && op < 10); 		
	}
	
    private int menu() {
        System.out.println("--------------------------------------");
        System.out.println(" ");
        System.out.println("VE�CULOS");
        System.out.println("1 - Registrar novo veiculo ");
        System.out.println("2 - Exibir todos os veiculos ");

        System.out.println(" ");
        System.out.println("CLIENTES");
        System.out.println("3 - Registrar novo cliente");
        System.out.println("4 - Exibir todos os clientes");
        
        System.out.println(" ");
        System.out.println("LOCA��O");
        System.out.println("5 - Registrar Locacao ");
        System.out.println("6 - Exibir todas as Locacoes");
        
        System.out.println(" ");
        System.out.println("VE�CULO");
        System.out.println("7 - Registrar ve�culo ");
        System.out.println("8 - Exibir todos os carros ");
        System.out.println("9 - Alterar disponibilidade ");
        
        System.out.println(" ");        
        System.out.println("0 - Sair");
        System.out.println("Digite a op��o: \n");
        Scanner scan = new Scanner(System.in);

        return scan.nextInt();
    }
}

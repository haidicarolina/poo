package locadoradeveiculos.controller;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import locadoradeveiculos.model.Cliente;
import locadoradeveiculos.model.Veiculo;
import locadoradeveiculos.model.Locacao;



public class Controller {
	
	private ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
    private ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
    private ArrayList<Locacao> listaDeLocacao = new ArrayList<Locacao>();


	
	public void exibeMenu() {
		int op = 0;
		 do {
           op = menu();
           System.out.println(op);
           switch (op) {
           	   case 0: break; 
               case 1: 
                        listaDeVeiculos.add(new VeiculoController().createVeiculo());
                        break;	                    
               case 2:  //new VeiculoController().listarVeiculos(con);
	                     break;      
               case 3:  listaDeClientes.add(new ClienteController().createCliente());
                        // listar cliente
	                    break;
               case 5:
                        listaDeLocacao.add(new LocacaoController().createLocacao());
                        break;
               default: break;
	              }
       } while (op > 0 && op < 10); 		
	}
	
    private int menu() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog( "CLIENTES: " + "\n3 - Registrar novo cliente" + "\n4 - Exibir todos os clientes" +
        "\n-----------------------------------\n" +
        "LOCACAO: " + "\n5 - Registrar Locacao" + "\n6 - Exibir todas as Locacoes" +
        "\n-----------------------------------\n" +
        "VEICULO:" + "\n7 - Registrar veiculo" + "\n8 - Exibir todos os carros" + "\n9 - Alterar disponibilidade"));

        return opcao;
        // System.out.println("--------------------------------------");
        // System.out.println(" ");
        // System.out.println("VEICULOS");
        // System.out.println("1 - Registrar novo veiculo ");
        // System.out.println("2 - Exibir todos os veiculos ");

        // System.out.println(" ");
        // System.out.println("CLIENTES");
        // System.out.println("3 - Registrar novo cliente");
        // System.out.println("4 - Exibir todos os clientes");
        
        // System.out.println(" ");
        // System.out.println("LOCACAO");
        // System.out.println("5 - Registrar Locacao ");
        // System.out.println("6 - Exibir todas as Locacoes");

        // System.out.println(" ");
        // System.out.println("VEICULO");
        // System.out.println("7 - Registrar veiculo ");
        // System.out.println("8 - Exibir todos os carros ");
        // System.out.println("9 - Alterar disponibilidade ");
        
        // System.out.println(" ");        
        // System.out.println("0 - Sair");
        // System.out.println("Digite a opcao: \n");
        // Scanner scan = new Scanner(System.in);
    }

    
}

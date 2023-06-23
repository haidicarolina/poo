package locadoradeveiculos.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import locadoradeveiculos.model.Cliente;
import locadoradeveiculos.model.Veiculo;
import locadoradeveiculos.model.Locacao;
import locadoradeveiculos.model.Modelo;

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
            	   listaDeClientes.add(new ClienteController().createCliente());
                   break;                   
               case 2:  
            	   JOptionPane.showMessageDialog(null, verTodosClientes());
       	   		   break;     
               case 3:  
            	   listaDeVeiculos.add(new VeiculoController().createVeiculo());
       	   		   break;	
               case 4: 
            	   JOptionPane.showMessageDialog(null, verTodosOsVeiculos());
       	   		   break;
               case 5:
            	   alterarDisponibilidade();
            	   break;
               case 6: 
            	   listaDeLocacao.add(new LocacaoController().createLocacao());
                   break;
               case 7: 
            	   JOptionPane.showMessageDialog(null, verTodasAsLocacoes());
       	   		   break;   		
               default: break;
	              }
       } while (op > 0 && op < 8); 		
	}
	
    private int menu() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog( "CLIENTES: " + "\n1 - Registrar novo cliente" + "\n2 - Exibir todos os clientes" +
        "\n-----------------------------------\n" +
        "VEICULO:" + "\n3 - Registrar veiculo" + "\n4 - Exibir todos os carros" + "\n5 - Alterar disponibilidade" +
        "\n-----------------------------------\n" +
        "LOCACAO: " + "\n6 - Registrar Locacao" + "\n7 - Exibir todas as Locacoes" +
        "\n-----------------------------------\n" +
        "0 - Sair"));

        return opcao;
    }
    
    public String verTodosClientes() {
		String todosClientes = "Clientes:  \n";
		
		for (Cliente cliente: this.listaDeClientes) {
			todosClientes+= "\nId: " + cliente.getId() + "\nCPF: " + cliente.getCpf() + "\nNome: " + cliente.getNome() + 
			"\nSobrenome: " + cliente.getSobrenome() + "\nTelefone: " + cliente.getTelefone() + "\nE-mail: " + cliente.getEmail() + "\n\n";
		}
		
		return todosClientes;
	}
    
    public String verTodasAsLocacoes() {
		String todasLocacoes = "Locacoes:  \n";
		
		for (Locacao locacao: this.listaDeLocacao) {
			todasLocacoes+= "\nId do cliente: " + locacao.getIdCliente() + "\nId do veículo: " + locacao.getIdVeiculo() + 
			"\nData de início: " + locacao.getDataInicio() + "\nData final: " + locacao.getDataFim() + "\n\n";
		}
		
		return todasLocacoes;
	}
    
    public String verTodosOsVeiculos() {
		String todosVeiculos = "Veiculos:  \n";
		
		for (Veiculo veiculo: this.listaDeVeiculos) {
			Modelo modelo = veiculo.getModelo();
			todosVeiculos+= "\nId do veículo: " + veiculo.getId() + "\nDisponibilidade: " + veiculo.getDisponibilidade() + 
			"\nPlaca: " + veiculo.getPlaca() + "\nCor: " + veiculo.getCor() + "\nId do modelo: " + modelo.getId() + "\nNome do fabricante: "  +  
			modelo.getFabricante() + "\nNome do modelo: " + modelo.getNome() + "\n\n";
		}
		
		return todosVeiculos;
	}
    
    public void alterarDisponibilidade() {    	
    	int i = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do veículo que deseja alterar: "));
    	String novaDisponibilidade = JOptionPane.showInputDialog("Informe a nova disponibilidade: ");
    	
	    for(Veiculo veiculo: this.listaDeVeiculos) {
	        if(veiculo.getId() == i) {
	        	veiculo.setDisponibilidade(novaDisponibilidade);
	        }
	    }
	}
    
    
    
    
    
    
    
    
    
    
    
    

    
}

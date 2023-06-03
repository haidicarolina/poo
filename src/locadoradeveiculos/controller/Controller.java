package locadoradeveiculos.controller;

import java.util.Scanner;

public class Controller {
	
	public void exibeMenu() {
		int op = 0;
		 do {
           op = menu();
	            
           switch (op) {
           	case 0: break; 
               case 1:  //new VeiculoController().createVeiculo(con);
                        break;
	                    
               case 2:  //new VeiculoController().listarVeiculos(con);
	                     break;      
               case 3:  //   new CidadeController().createCidade(con);
	                     break;
               default: break;
	              }
       } while (op > 0 && op < 10); 		
	}
	
    private int menu() {
        System.out.println("--------------------------------------");
        System.out.println(" ");
        System.out.println("VEÍCULOS");
        System.out.println("1 - Registrar novo veiculo ");
        System.out.println("2 - Exibir todos os veiculos ");

        System.out.println(" ");
        System.out.println("CLIENTES");
        System.out.println("3 - Registrar novo cliente");
        System.out.println("4 - Exibir todos os clientes");
        
        System.out.println(" ");
        System.out.println("LOCAÇÃO");
        System.out.println("5 - Registrar Locacao ");
        System.out.println("6 - Exibir todas as Locacoes");
        
        System.out.println(" ");
        System.out.println("VEÍCULO");
        System.out.println("7 - Registrar veículo ");
        System.out.println("8 - Exibir todos os carros ");
        System.out.println("9 - Alterar disponibilidade ");
        
        System.out.println(" ");        
        System.out.println("0 - Sair");
        System.out.println("Digite a opção: \n");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}

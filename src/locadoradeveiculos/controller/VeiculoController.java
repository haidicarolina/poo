package locadoradeveiculos.controller;

import javax.swing.JOptionPane;

import locadoradeveiculos.model.Modelo;
import locadoradeveiculos.model.Veiculo;
import locadoradeveiculos.view.EntradaSaida;

public class VeiculoController {
	
	public Veiculo createVeiculo() {
		System.out.println("teste");
		Veiculo veiculo = new Veiculo();

		int id;
		String placa, cor;
		Boolean disponibilidade;
		Modelo modelo;
		
		id = EntradaSaida.solicitaInt("id do veiculo");
		veiculo.setId(id);
		
		placa = EntradaSaida.solicitaString("placa do veículo");
		veiculo.setPlaca(placa);
		
		cor = EntradaSaida.solicitaString("cor do veículo");
		veiculo.setCor(cor);
		
		disponibilidade = EntradaSaida.solicitaBol(true || false);
		veiculo.alterarDisponibilidade(disponibilidade);
		
		// modelo = EntradaSaida.solicitaModelo("Modelo");
		// veiculo.setModelo(modelo);		
		
		return veiculo;
	}
}

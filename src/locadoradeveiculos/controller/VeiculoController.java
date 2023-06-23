package locadoradeveiculos.controller;

import locadoradeveiculos.model.Modelo;
import locadoradeveiculos.model.Veiculo;
import locadoradeveiculos.view.EntradaSaida;

public class VeiculoController {
	
	public Veiculo createVeiculo() {
		Modelo modelo = new Modelo();
		Veiculo veiculo = new Veiculo();

		int id, idModelo;
		String placa, cor, fabricante, nomeModelo, disponibilidade;
		
		id = EntradaSaida.solicitaInt("id do veiculo");
		veiculo.setId(id);
		
		placa = EntradaSaida.solicitaString("placa do veículo");
		veiculo.setPlaca(placa);
		
		cor = EntradaSaida.solicitaString("cor do veículo");
		veiculo.setCor(cor);
		
		disponibilidade = EntradaSaida.solicitaString("Disponibilidade do veículo (Disponível / Indisponível)");
		veiculo.setDisponibilidade(disponibilidade);
			
		idModelo = EntradaSaida.solicitaInt("id do modelo");
		
		modelo.setId(idModelo);
		
		fabricante = EntradaSaida.solicitaString("nome do fabricante");
		modelo.setFabricante(fabricante);
		
		nomeModelo = EntradaSaida.solicitaString("nome do modelo");
		modelo.setNome(nomeModelo);
		
		veiculo.setModelo(modelo);	
		
		return veiculo;
	}
}

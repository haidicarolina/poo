package locadoradeveiculos.controller;

import locadoradeveiculos.model.Locacao;
import locadoradeveiculos.view.EntradaSaida;

public class LocacaoController {
	
	public Locacao createLocacao() {
		Locacao locacao = new Locacao();

		int idVeiculo, idCliente;
		String dataInicio, dataFim;
		
		idVeiculo = EntradaSaida.solicitaInt("id do veículo");
		locacao.setIdVeiculo(idVeiculo);

		idCliente = EntradaSaida.solicitaInt("id do cliente");
		locacao.setIdCliente(idCliente);
		
		dataInicio = EntradaSaida.solicitaString("a data de início");
		locacao.setDataInicio(dataInicio);
		 
		dataFim = EntradaSaida.solicitaString("a data final");
		locacao.setDataFim(dataFim);
	
		return locacao;
	}
}

package locadoradeveiculos.controller;

import java.sql.Date;

import javax.swing.JOptionPane;

import locadoradeveiculos.model.Locacao;
import locadoradeveiculos.view.EntradaSaida;

public class LocacaoController {
	
	public Locacao createLocacao() {
		System.out.println("teste");
		Locacao locacao = new Locacao();

		int idVeiculo, idCliente;
		Date dataInicio, dataFim;
		
		idVeiculo = EntradaSaida.solicitaInt("id do veículo");
		locacao.setIdVeiculo(idVeiculo);

		idCliente = EntradaSaida.solicitaInt("id do cliente");
		locacao.setIdCliente(idCliente);
		
		// dataInicio = EntradaSaida.solicitaData();
		// locacao.setData(dataInicio);

		// dataFim = EntradaSaida.solicitaData();
		// locacao.setDataFim(dataInicio);

	
		return locacao;
	}
}

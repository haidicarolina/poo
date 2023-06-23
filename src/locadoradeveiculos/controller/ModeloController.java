package locadoradeveiculos.controller;

import locadoradeveiculos.model.Modelo;
import locadoradeveiculos.view.EntradaSaida;

public class ModeloController {
	
	public Modelo createModelo() {
		Modelo modelo = new Modelo();

		int id;
		String fabricante, nome;
		
		id = EntradaSaida.solicitaInt("id do modelo");
		modelo.setId(id);
		
		fabricante = EntradaSaida.solicitaString("fabricante do modelo");
		modelo.setFabricante(fabricante);
		
		nome = EntradaSaida.solicitaString("nome do modelo");
		modelo.setNome(nome);

		return modelo;
	}
}

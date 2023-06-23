package locadoradeveiculos.model;

import locadoradeveiculos.view.EntradaSaida;

public class Veiculo {
    private int id;
	private String disponibilidade;
	private String placa;
    private String cor;
    private Modelo modelo;
 
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public String getDisponibilidade() {
		return disponibilidade;
	}
    
    public void setDisponibilidade(String disponibilidade) {
    	this.disponibilidade = disponibilidade;
    }

    public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

    public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

    public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	public void alterarDisponibilidade() {
    	String disponibilidade = EntradaSaida.solicitaString("Disponibilidade do veículo (Disponível / Indisponível)");
    	this.disponibilidade = disponibilidade;
    }
}
package locadoradeveiculos.model;

public class Locacao {
    private String dataInicio;
    private String dataFim;
	private int idVeiculo;
	private int idCliente;

    public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

    public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

    public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int veiculo) {
		this.idVeiculo = veiculo;
	}

    public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int cliente) {
		this.idCliente = cliente;
	}

    public Object[] todasInformacoes() {
        return new Object[]{getDataInicio(), getDataFim(), getIdVeiculo(), getIdCliente()};
    }
    

    public String visualizarLocacao(String[] arg) {
        Object[] infos = new Locacao().todasInformacoes();
        String teste = "Informacoes do Locacao: \nData Inicio: " +infos[0] + "\nData Fim: " + infos[1] + "\nVeiculo: " + infos[2] + "\nCliente: " + infos[3];
        return teste;
    }
}
package locadoradeveiculos.model;

import java.sql.Date;

import javax.swing.JOptionPane;

public class Locacao {
    private Date dataInicio;
    private Date dataFim;
	private int idVeiculo;
	private int idCliente;

    public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

    public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
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

    public static void  visualizarLocacao(String[] args) {
        Object[] infos = new Locacao().todasInformacoes();
        System.out.println("Informacoes do Locacao: \nData Inicio: " +infos[0] + "\nData Fim: " + infos[1] + "\nVeiculo: " + infos[2] + "\nCliente: " + infos[3]);
        JOptionPane.showMessageDialog(null, "Informacoes do Locacao: \nData Inicio: " +infos[0] + "\nData Fim: " + infos[1] + "\nVeiculo: " + infos[2] + "\nCliente: " + infos[3]);
    }
}
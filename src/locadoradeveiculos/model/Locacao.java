package locadoradeveiculos.model;

import java.sql.Date;

import javax.swing.JOptionPane;

public class Locacao {
    private Date dataInicio;
    private Date dataFim;
	private Veiculo veiculo;
	private Cliente cliente;

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

    public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

    public Object[] todasInformacoes() {
        return new Object[]{getDataInicio(), getDataFim(), getVeiculo(), getCliente()};
    }

    public static void  visualizarLocacao(String[] args) {
        Object[] infos = new Locacao().todasInformacoes();
        System.out.println("Informacoes do Locacao: \nData Inicio: " +infos[0] + "\nData Fim: " + infos[1] + "\nVeiculo: " + infos[2] + "\nCliente: " + infos[3]);
        JOptionPane.showMessageDialog(null, "Informacoes do Locacao: \nData Inicio: " +infos[0] + "\nData Fim: " + infos[1] + "\nVeiculo: " + infos[2] + "\nCliente: " + infos[3]);
    }
}
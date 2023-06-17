package locadoradeveiculos.model;

public class Veiculo {
    private int id;
	private boolean disponibilidade;
	private String placa;
    private String cor;
    private Modelo modelo;

    public void alterarDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public boolean getDisponibilidade() {
		return disponibilidade;
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
    
    public Object[] todasInformacoes() {
        return new Object[]{getId(), getDisponibilidade(), getPlaca(), getCor(), getModelo()};
    }

    // public String visualizarVeiculo() {}

    public static void  visualizarVeiculo(String[] args) {
        Object[] infos = new Veiculo().todasInformacoes();
        System.out.println("Informacoes do Veiculo: \nId: " +infos[0] + "\nDisponibilidade: " + infos[1] + "\nPlaca: " + infos[2] + "\nCor: " + infos[3] + "\nModelo: " + infos[4] );
    }
}
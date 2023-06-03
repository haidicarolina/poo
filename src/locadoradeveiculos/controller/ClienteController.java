package locadoradeveiculos.controller;

import javax.swing.JOptionPane;

import locadoradeveiculos.model.Cliente;
import locadoradeveiculos.view.EntradaSaida;

public class ClienteController {
	
	public Cliente createCliente() {
		System.out.println("teste");
		Cliente cliente = new Cliente();
		
		int id, numero;
		String nome, sobrenome, telefone, email, rua, bairro, cidade;
		
		id = EntradaSaida.solicitaInt("id do cliente");
		cliente.setId(id);
		
		nome = EntradaSaida.solicitaString("nome do cliente");
		cliente.setNome(nome);
		
		sobrenome = EntradaSaida.solicitaString("sobrenome do cliente");
		cliente.setSobrenome(sobrenome);
		
		telefone = EntradaSaida.solicitaString("telefone do cliente");
		cliente.setTelefone(telefone);
		
		email = EntradaSaida.solicitaString("email do cliente");
		cliente.setEmail(email);
		
		cidade = EntradaSaida.solicitaString("informe a cidade do cliente");
		cliente.setCidade(cidade);
		
		bairro = EntradaSaida.solicitaString("bairro do cliente");
		cliente.setBairro(bairro);
		
		rua = EntradaSaida.solicitaString("rua do cliente");
		cliente.setRua(rua);
		
		numero = EntradaSaida.solicitaInt("numero do endereço do cliente");
		cliente.setNumero(numero);		
		
		return cliente;
	}
}

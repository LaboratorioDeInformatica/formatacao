package br.com.labdeinf.cep;

import java.io.IOException;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP {
 
	public static void main(String[] args) {
	ViaCEPClient cliente = new ViaCEPClient();
	
	try {
		ViaCEPEndereco  endereco =cliente.getEndereco("82010340");
		 System.out.println(endereco.getBairro());
		 System.out.println(endereco.getLogradouro());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

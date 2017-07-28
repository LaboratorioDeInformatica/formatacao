package br.com.labdeinf.validator;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoDocumentoCPF {

	public static void main(String[] args) {
		 String cpf="86288366757";
		 CPFValidator validador = new CPFValidator();
		 
		 try {
			 validador.assertValid(cpf);
			 System.out.println("CPF VALIDO");
		} catch (InvalidStateException e) {
			System.out.println("CPF INVÁLIDO : " + e);
		}
	}
}

package br.com.labdeinf.validator;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoDocumentoCNPJ {

	public static void main(String[] args) {
			String cnpj = "82588641000173";	
			CNPJValidator validator =new CNPJValidator();
			try{
				validator.assertValid(cnpj);
				System.out.println("CNPJ - Valido");
			}catch (InvalidStateException e) {
				System.out.println("CNPJ INVALIDO " + e);
			}
	}
}

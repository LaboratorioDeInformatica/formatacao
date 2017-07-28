package br.com.labdeinf.validator;

import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;

public class ValidacaoTituloEleitor {

	public static void main(String[] args) {
		String titulo = "848141140183";
		TituloEleitoralValidator validator = new TituloEleitoralValidator();
		try {
			validator.assertValid(titulo);
			System.out.println("Titulo de eleitor valido");
		} catch (InvalidStateException e) {
			System.out.println("Titulo de eleitor invalido");
		}
	}
}

package br.com.labdeinf.validator;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidaDocumento {
	
	public static void main(String[] args) {
		String cpf = "86288366757";
		CPFValidator validadadorCPF = new CPFValidator();
		try {
			validarDocumentos(validadadorCPF, cpf);
			System.out.println("CPF VALIDO");
		} catch (Exception e) {
			System.out.println("CPF INVALIDO" +e);
		}
		
		String cnpj = "82588641000173";
		CNPJValidator validadorCnpj = new CNPJValidator();
		try{
			validarDocumentos(validadorCnpj, cnpj);
			System.out.println("CNPJ Valido");
		}catch (Exception e) {
			System.out.println("CNPJ INVALIDO" +e);
		}
		
		String titulo = "848141140183";
		TituloEleitoralValidator validatorTitulo = new TituloEleitoralValidator();
		try {
			validarDocumentos(validatorTitulo, titulo);
			System.out.println("Titulo Valido");
		} catch (Exception e) {
			System.out.println("Titulo INVALIDO" +e);
		}
	}
	
	public static void validarDocumentos(Validator<String> validador, String documento ){
		validador.assertValid(documento);
	}
}

package br.com.labdeinf.money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;

import org.javamoney.moneta.function.MonetaryOperators;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class Money {

	public static void main(String[] args) {
		CurrencyUnit currency = Monetary.getCurrency("BRL");
		MonetaryAmount amount = org.javamoney.moneta.Money.of(75, currency);
		System.out.println(amount);
		MonetaryAmount amountTotal = amount.multiply(10);
		System.out.println(amountTotal);
		MonetaryAmount desconto = amountTotal.with(MonetaryOperators.percent(10));
		System.out.println(desconto);
		
		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
		NumberValue descontoSemMoeda = desconto.getNumber();
		String valorPorExtenso = conversor.toWords(descontoSemMoeda.longValue());
		System.out.println(valorPorExtenso);
		
		String cpf = "51720155232";

		CPFValidator validadorCPF = new CPFValidator();
		try{
		    validadorCPF.assertValid(cpf);
		    CurrencyUnit real = Monetary.getCurrency("BRL");
		    MonetaryAmount valorFaturaCartao = null;//Money(900, real);

		    NumberValue valorFaturaCartaoSemMoeda = valorFaturaCartao.getNumber();

		    NumericToWordsConverter conversorA = new NumericToWordsConverter(new FormatoDeReal());
		    String valorFaturaCartaoPorExtenso = conversor.toWords(valorFaturaCartaoSemMoeda.doubleValue());

		    System.out.println("Caro cliente. Sua fatura esse mês chegou no valor de " + valorFaturaCartaoPorExtenso);

		}catch (InvalidStateException e) {
		    System.out.println("Olá cliente, favor entrar no nosso sistema e atualizar seus dados pois seu CPF é inválido." );
		}
	}
}

package br.com.labdeinf.formatadata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormataDatas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatter));
		LocalDateTime agora= LocalDateTime.now();
		System.out.println(agora);
		DateTimeFormatter formatterHour = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println(agora.format(formatterHour));
		DateTimeFormatter formatadorCurto = DateTimeFormatter.
				ofLocalizedDate(FormatStyle.MEDIUM).withLocale(new Locale("pt", "br"));
		System.out.println(agora.format(formatadorCurto));
		System.out.println(agora.minusHours(5));
		System.out.println(agora.plusHours(3));
	}
}

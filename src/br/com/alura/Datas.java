package br.com.alura;

import java.awt.image.AffineTransformOp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo  = Period.between(hoje, olimpiadasRio);

		System.out.println("anos: " + periodo.getYears() +" Meses: "+ periodo.getMonths() +" Dias " + periodo.getDays());

		LocalDate proximaOlimpiadas = olimpiadasRio.plusYears(4);
		
		System.out.println(proximaOlimpiadas);
		
		DateTimeFormatter fomatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximaOlimpiadas.format(fomatador);
		System.out.println(valorFormatado);
		
		DateTimeFormatter fomatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDateTime agora = LocalDateTime.now();
		
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone.format(fomatadorComHoras));
		
	}

}

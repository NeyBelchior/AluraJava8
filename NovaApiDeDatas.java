import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class NovaApiDeDatas {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2025, Month.JUNE, 5);
		
		int anos =olimpiadasRio.getYear()-hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo= Period.between(hoje,olimpiadasRio);
		
		System.out.println(periodo.getDays());
		System.out.println(olimpiadasRio);
		
		LocalDate proximasOlimiedas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimiedas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximasOlimiedas.format(formatador);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora =LocalDateTime.now();
		
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(3,30);
		System.out.println(intervalo);
		
		
		
	}
	
	

}

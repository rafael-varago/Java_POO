import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

				
		//formato ISO 8601
		LocalDate d04 = LocalDate.parse("2023-02-11");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-11T02:30:25");	
		Instant d06 = Instant.parse("2023-02-11T02:30:25Z");
				
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		//somente a data
		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//incluindo horas,min,seg
		DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		//o .withZone(ZoneId.systemDefault()) considera o fuso do computador do usuário
		DateTimeFormatter form3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		//formato pronto que da data-hora local em ISO
		DateTimeFormatter form4 = DateTimeFormatter.ISO_DATE_TIME;
		//formato data-hora para Instant:
		DateTimeFormatter form5 = DateTimeFormatter.ISO_INSTANT;
				
		//printando o d04:	
		System.out.println("d04:");
		//passei o formato que desejo que a data apareça:
		System.out.println("d04: " + d04.format(form1));
		//pode ser chamado assim tambem:
		System.out.println("d04: " + form1.format(d04));
		//ou ainda assim:
		System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println();
		
		//printando o d05:
		System.out.println("d05:");
		//passei o formato 2:
		System.out.println("d05: " + d05.format(form2));
		//porem tambem posso usar o formato 1, se quiser aparecer somente a data:
		System.out.println("d05: " + d05.format(form1));
		//utilizando o formato pronto:
		System.out.println("d05: " + d05.format(form4));
		System.out.println();
		
		//printando o d06:
		System.out.println("d06:");
		//aqui tenho que chamar o form3 antes do d06, pois como o d06 eh do tipo Instant, ele nao aceita o metodo format
		//observe que o horário que era de London ali em cima foi alterado para o fuso do seu computador
		System.out.println("d06: " + form3.format(d06));
		//utilizando o formato pronto:
		System.out.println("d06: " + form5.format(d06));
		
	}
}

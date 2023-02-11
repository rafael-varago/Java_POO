import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//gerando a data-hora atual
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		//formato ISO 8601
		LocalDate d04 = LocalDate.parse("2023-02-11");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-11T02:30:25");	
		Instant d06 = Instant.parse("2023-02-11T02:30:25Z");
		/* perceba que ele armazena o horario local, logo como -03 eh o horario de brasilia,
		 * ele coloca o de londres, que eh 3 horas a mais.
		 * lembre-se que o Instant da o horario de Londres!
		 */
		Instant d07 = Instant.parse("2023-02-11T02:30:25-03:00");
		
		//texto formato customizado
		//tive que criar ali em cima um formato para ler texto customizado. veja o doc da oracle 
		LocalDate d08 = LocalDate.parse("18/08/2023", form1);
		//obs: posso colocar o DateTimeFormatter direto na instanciacao do objeto
		LocalDateTime d09 = LocalDateTime.parse("18/08/2004 03:30:12", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		
		//instanciando ano, mes, data, [hora] isoladamente
		LocalDate d10 = LocalDate.of(2023, 02, 11);
		LocalDateTime d11 = LocalDateTime.of(2023, 02, 11, 17, 38);
		
		
		//printa em ISO 8601
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);	
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);
		System.out.println("d10: " + d10);
		System.out.println("d11: " + d11);
	}
}

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {

	public static void main(String[] args) {

		//OBS: o fuso-horario de Portugal eh GMT+1
		
		//dado os objetos em formato ISO 8601
		LocalDate d04 = LocalDate.parse("2023-02-11");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-11T02:30:25");	
		
		System.out.println("LocalDate:");
		//da o dia do mes do objeto d04
		System.out.println("d04 dia: " + d04.getDayOfMonth());
		//da o mes do objeto d04
		System.out.println("d04 mes: " + d04.getMonthValue());
		//da o ano do objeto d04
		System.out.println("d04 ano: " + d04.getYear());
		System.out.println();
		
		System.out.println("LocalDateTime:");
		//da a hora do objeto d05
		System.out.println("d05 hora: " + d05.getHour());
		//da os minutos do objeto d05
		System.out.println("d05 minutos: " + d05.getMinute());
		
	}
}

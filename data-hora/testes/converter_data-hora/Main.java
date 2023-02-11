import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {

	public static void main(String[] args) {

		//OBS: o fuso-horario de Portugal eh GMT+1
		
		//dado o objeto em formato ISO 8601
		Instant d06 = Instant.parse("2023-02-11T02:30:25Z");
				
		//gerei um objeto de data local a partir do instante d06 e o fuso do meu sistema
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		//agora usando o fuso de um lugar, tipo Portugal
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		//data-hora no meu fuso
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		//data-hora no fuso de Portugal
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		//data global em local no fuso do meu sistema
		System.out.println("r1: " + r1);
		//data global em local no fuso de Portugal
		System.out.println("r2: " + r2);
		//data-hora global em local no fuso do meu sistema
		System.out.println("r3: " + r3);
		//data-hora global em local no fuso de Portugal
		System.out.println("r4: " + r4);
		
	}
}

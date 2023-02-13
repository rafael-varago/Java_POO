import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2023-02-12T21:27:10Z"));
		
		System.out.println("Antes de adicionar 4h:");
		System.out.println(sdf1.format(d));
		System.out.println();
		
		//instanciei o Calendar cal
		Calendar cal = Calendar.getInstance();
		//instanciei minha data em cal de Calendar
		cal.setTime(d);
		//adicionei 4h ao horario dado ao cal
		cal.add(Calendar.HOUR_OF_DAY, 4);
		//d recebe o valor de cal
		d = cal.getTime();
		
		System.out.println("Após adicionar 4h:");
		System.out.println(sdf1.format(d));
		
	}
}

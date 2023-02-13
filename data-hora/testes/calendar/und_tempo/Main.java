import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2023-02-12T21:27:10Z"));
		
		System.out.println("Horário:");
		System.out.println(sdf1.format(d));
		System.out.println();
		
		//instanciei o Calendar cal
		Calendar cal = Calendar.getInstance();
		//instanciei minha data em cal de Calendar
		cal.setTime(d);
		//obtendo as unidades de tempo:
		int minutes = cal.get(Calendar.MINUTE);
		//meses comecam em 0, logo você deve adicionar 1 
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Obtendo minutos e mes:");
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
	}
}

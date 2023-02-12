import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {

		//formato das Dates
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//da a Date atual do sistema
		Date x1 = new Date();
		
		//pega o Instant do sistema, converte para mili e depois forma a data
		Date x2 = new Date(System.currentTimeMillis());
		
		/* passando um numero de milissegundos qualquer, no caso 0, o que gera 
		 * a data inicial de 1 jan de 1970, porém com 3h a menos, fuso de sao paulo
		 */
		Date x3 = new Date(0L);
		
		/* gerando 5h a mais do horário inicial (1 de jan de 1970), sendo L representando o long 
		 * 1seg = 1000 mlseg
		 * 1min = 60seg
		 * 1h = 60min
		 * 5h = 1h*5
		 */
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		//defini as Dates com o .parse()
		Date y1 = sdf1.parse("12/02/2023");
		Date y2 = sdf2.parse("12/02/2023 13:40:15");
		
		Date y3 = Date.from(Instant.parse("2023-02-12T"));
		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
	}
}

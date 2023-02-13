import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws ParseException {

		//formato das Dates
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//criando outro sdf e depois setando para o fuso GMT (aka Londres)
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
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
		
		//printa a Date com o fuso da minha maquina, pois ali esta o de londres. agora criei outro sdf3 para incluir o fuso de londres
		Date y3 = Date.from(Instant.parse("2023-02-12T21:05:10Z"));
		
		System.out.println("Sem formatação:");
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		
		System.out.println("---------------------------");
		
		System.out.println("No fuso da minha maquina:");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		
		System.out.println("---------------------------");
		
		System.out.println("No fuso de GMT (London):");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
	}
}

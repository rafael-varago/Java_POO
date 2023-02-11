import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {

		// OBS: o fuso-horario de Portugal eh GMT+1

		// dado os objetos em formato ISO 8601
		LocalDate d04 = LocalDate.parse("2023-02-11");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-11T02:30:25");
		Instant d06 = Instant.parse("2023-02-11T02:30:25Z");

		// -------------------------------------------------------------------------------------------------------------------------------------------
		// lembre-se que data-hora em java sao imutaveis, logo cria-se outro objeto
		// retirando uma semana de d04
		LocalDate pastWeekLocalDate = d04.minusWeeks(1);
		// adicionando uma semana de d04
		LocalDate nextWeekLocalDate = d04.plusWeeks(1);
		// adicionando 4 anos a data de d04
		LocalDate fourYearsLocalDate = d04.plusYears(4);

		System.out.println("LocalDate:");
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		System.out.println("fourYearsLocalDate: " + fourYearsLocalDate);
		System.out.println();

		// --------------------------------------------------------------------------------------------------------------------------------------------
		// lembre-se que data-hora em java sao imutaveis, logo cria-se outro objeto
		// retirando uma semana de d05
		LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
		// adicionando uma semana de d05
		LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);
		// adicionando 4 horas as horas de d05
		LocalDateTime fourHoursLocalDateTime = d05.plusHours(4);

		System.out.println("LocalDateTime:");
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		System.out.println("fourHoursLocalDateTime: " + fourHoursLocalDateTime);
		System.out.println();

		// --------------------------------------------------------------------------------------------------------------------------------------------
		// lembre-se que data-hora em java sao imutaveis, logo cria-se outro objeto
		//em Instant use o ChronoUnit.tipo para dizer qual tempo você quer alterar
		// retirando uma semana de d06
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		// adicionando uma semana de d06
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		// adicionando 4 horas as horas de d06
		Instant fourHoursInstant = d06.plus(4, ChronoUnit.HOURS);
		
		System.out.println("Instant:");
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		System.out.println("fourHoursInstant: " + fourHoursInstant);

	}
}

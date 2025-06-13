package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {

	public static void main(String[] args) {
		//instanciação
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2025-02-13");
		LocalDateTime d05 = LocalDateTime.parse("2025-02-13T15:37:25");
		Instant d06 = Instant.parse("2025-02-13T15:40:26Z");
		Instant d07 = Instant.parse("2025-02-13T15:40:26-03:00");
		LocalDate d08 = LocalDate.parse("13/02/2025", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("13/02/2025 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2025, 02, 13);
		LocalDateTime d11 = LocalDateTime.of(2025, 02, 13, 15, 52);
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		//Formatação
		System.out.println(d11.format(fmt1));
		System.out.println(d11.format(fmt2));
		System.out.println(fmt3.format(d06)); // fuso-horario
		//converter data global para local
		LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println(d05.getDayOfMonth());
		System.out.println(d05.getMonthValue());
		System.out.println(d05.getYear());
		System.out.println(d05.getHour());
		System.out.println(d05.getMinute());
		//calculo com data-hora
		LocalDate pastWeek = d04.minusDays(7);
		LocalDate nextWeek = d04.plusDays(7);
		System.out.println(pastWeek);
		System.out.println(nextWeek);
		Instant pastWeekInstant = d06.minus(7,ChronoUnit.DAYS); //Instant precisa do ChronoUnit
		Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		Duration t1 = Duration.between(pastWeekInstant, d06);
		Duration t2 = Duration.between(nextWeek.atStartOfDay(), d04.atStartOfDay()); //erro, precisa ser convertido p LocalDateTime
		System.out.println(t1.toDays());
		System.out.println(t2.toDays());
	}

}

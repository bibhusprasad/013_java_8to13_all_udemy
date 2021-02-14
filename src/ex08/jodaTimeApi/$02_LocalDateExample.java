package ex08.jodaTimeApi;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class $02_LocalDateExample {
	public static void main(final String[] args) {
		// creating localDate
		LocalDate localDate = LocalDate.now();
		System.out.println("\nlocalDate = " + localDate);
		// OP: localDate = 2021-02-14

		// using day of the year
		localDate = LocalDate.ofYearDay(2018, 35);
		System.out.println("\nlocalDate = " + localDate);
		// OP: localDate = 2018-02-04

		localDate = LocalDate.of(2018, 05, 23);
		System.out.println("\nlocalDate = " + localDate);
		// localDate = 2018-05-23

		localDate = LocalDate.now();

		// Get Methods
		System.out.println("\nlocalDate.getMonth = " + localDate.getMonth());
		// OP: localDate.getMonth = FEBRUARY
		System.out.println("\nlocalDate.getMonthValue() = " + localDate.getMonthValue());
		// OP: localDate.getMonthValue() = 2
		System.out.println("\nlocalDate.getDayOfWeek() = " + localDate.getDayOfWeek());
		// OP: localDate.getDayOfWeek() = SUNDAY
		System.out.println("\nlocalDate.getD = " + localDate.getDayOfYear());
		// OP: localDate.getD = 45
		System.out.println("\nlocalDate = " + localDate.get(ChronoField.MONTH_OF_YEAR));
		// OP: localDate = 2

	}
}
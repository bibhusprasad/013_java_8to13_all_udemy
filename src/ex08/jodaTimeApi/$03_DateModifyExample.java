package ex08.jodaTimeApi;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class $03_DateModifyExample {
	public static void main(final String[] args) {

		LocalDate localDate = LocalDate.now();
		// 4 days from now
		localDate = localDate.plusDays(4);

		System.out.println("\nlocalDate = " + localDate);
		// OP: localDate = 2021-02-18
		System.out.println("\nlocalDate.plusDays(4) = " + localDate.plusDays(4));
		// OP: localDate.plusDays(4) = 2021-02-22
		localDate = LocalDate.now();
		System.out.println("\nlocalDate = " + localDate);
		// OP:localDate = 2021-02-14
		System.out.println("\nlocalDate.plusMonths(2) = " + localDate.plusMonths(2));
		// OP: localDate.plusMonths(2) = 2021-04-14
		System.out.println("\nlocalDate.plusYears(2) = " + localDate.plusYears(2));
		// OP: localDate.plusYears(2) = 2023-02-14
		System.out.println("\nlocalDate.minusDays(10) = " + localDate.minusDays(10));
		// OP: localDate.minusDays(10) = 2021-02-04
		System.out.println("\nlocalDate.withYear(2023) = " + localDate.withYear(2023));
		// OP: localDate.withYear(2023) = 2023-02-14
		System.out.println("\nlocalDate.with(ChronoField) = " + localDate.with(ChronoField.YEAR, 2025));
		// OP: localDate.with(ChronoField) = 2025-02-14
		System.out
				.println("\nlocalDate.with(TemporalAdjusters) = " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
		// OP: localDate.with(TemporalAdjusters) = 2021-02-28

	}
}

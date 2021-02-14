package ex08.jodaTimeApi;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class $04_LocalTimeExample {
	public static void main(final String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("\nlocalTime = " + localTime);
		// OP: localTime = 20:52:21.101347300

		localTime = LocalTime.of(15, 18);
		System.out.println("\nlocalTime = " + localTime);
		// OP: localTime = 15:18

		localTime = LocalTime.of(15, 18, 22);
		System.out.println("\nlocalTime = " + localTime);
		// OP: localTime = 15:18:22

		localTime = LocalTime.of(15, 18, 23, 22222222);
		System.out.println("\nlocalTime = " + localTime);
		// OP: localTime = 15:18:23.022222222

		// get
		System.out.println("\nlocalTime.getHour() = " + localTime.getHour());
		// OP: localTime.getHour() = 15
		System.out.println("\nlocalTime.getMinute() = " + localTime.getMinute());
		// OP: localTime.getMinute() = 18
		System.out.println("\nlocalTime.getSecond() = " + localTime.getSecond());
		// OP: localTime.getSecond() = 23
		System.out.println("\nlocalTime.getNano() = " + localTime.getNano());
		// op: localTime.getNano() = 22222222
		System.out.println("\nlocalTime.get(ChronoField) = " + localTime.get(ChronoField.SECOND_OF_DAY));
		// OP: localTime.get(ChronoField) = 55103
		System.out.println("\nlocalTime.get(ChronoField) = " + localTime.get(ChronoField.MINUTE_OF_DAY));
		// OP: localTime.get(ChronoField) = 918

	}
}

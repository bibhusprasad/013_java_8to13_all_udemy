package ex08.jodaTimeApi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class $01_DateTimeExample {

	public static void main(final String[] args) {

		// Date and simpleDateformatter
		final Date dateObj = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("\ndf.format(dateObj) = " + df.format(dateObj));
		// OP: df.format(dateObj) = 2021-02-14

		df = new SimpleDateFormat("HH:mm:ss");
		System.out.println("\ndf.format(dateObj) = " + df.format(dateObj));
		// OP: df.format(dateObj) = 20:13:35

		System.out.println("\n");
		System.out.println(Calendar.getInstance().getTime());
		// OP: Sun Feb 14 20:13:35 IST 2021

		// LocalDate
		final LocalDate localDate = LocalDate.now();
		System.out.println("\nlocalDate = " + localDate);
		// OP: localDate = 2021-02-14

		// LocalTime
		final LocalTime localTime = LocalTime.now();
		System.out.println("\nlocalTime = " + localTime);
		// OP: localTime = 20:13:35.605202700

		// LocalDateTime
		final LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("\nlocalDateTime = " + localDateTime);
		// OP: localDateTime = 2021-02-14T20:13:35.605202700

	}
}

package ex04.stream.numericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class $04_NumericStreamAggregateExample {

	public static void main(final String[] args) {

		// sum
		System.out.println("\n");
		final int sum = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).sum();
		System.out.println(sum); // OP: 45

		System.out.println("\n");
		final OptionalInt max = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max();
		max.ifPresent(System.out::println); // OP: 9

		System.out.println("\n");
		final OptionalInt min = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min();
		min.ifPresent(System.out::println); // OP: 1

		System.out.println("\n");
		final OptionalDouble average = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).average();
		average.ifPresent(System.out::println); // OP: 5.0
	}
}

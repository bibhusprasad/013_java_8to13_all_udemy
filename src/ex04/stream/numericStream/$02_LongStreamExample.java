package ex04.stream.numericStream;

import java.util.Random;
import java.util.stream.LongStream;

public class $02_LongStreamExample {

	public static void main(final String[] args) {

		System.out.println("\n");
		final LongStream longStream = LongStream.of(1, 2, 3, 4, 5);
		longStream.forEach(System.out::println);
		// OP: 1, 2, 3, 4, 5

		System.out.println("\n");
		final LongStream limit = LongStream.iterate(0, i -> i + 2)
				.limit(5);
		limit.forEach(System.out::println);
		// OP: 0, 2, 4, 6, 8

		System.out.println("\n");
		final LongStream limit1 = LongStream.generate(new Random()::nextLong)
				.limit(5);
		limit1.forEach(System.out::println);
		// OP: 5 Random number like 1797627203786556677, -8404567519450467787, ...

		System.out.println("\n");
		final LongStream range = LongStream.range(1, 5);
		range.forEach(System.out::println);
		// OP: 1, 2, 3, 4

		System.out.println("\n");
		final LongStream rangeClosed = LongStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::println);
		// OP: 1, 2, 3, 4, 5
	}
}

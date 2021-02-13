package ex04.stream.numericStream;

import java.util.Random;
import java.util.stream.IntStream;

public class $01_IntStreamExample {

	public static void main(final String[] args) {

		System.out.println("\n");
		final IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
		intStream.forEach(System.out::println);
		// OP: 1, 2, 3, 4, 5

		System.out.println("\n");
		final IntStream limit = IntStream.iterate(0, i -> i + 2)
				.limit(5);
		limit.forEach(System.out::println);
		// OP: 0, 2, 4, 6, 8

		System.out.println("\n");
		final IntStream limit1 = IntStream.generate(new Random()::nextInt)
				.limit(5);
		limit1.forEach(System.out::println);
		// OP: 5 Random number like 1665660965, -606990549, ...

		System.out.println("\n");
		final IntStream range = IntStream.range(1, 5);
		range.forEach(System.out::println);
		// OP: 1, 2, 3, 4

		System.out.println("\n");
		final IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::println);
		// OP: 1, 2, 3, 4, 5
	}
}

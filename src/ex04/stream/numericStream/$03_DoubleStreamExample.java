package ex04.stream.numericStream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class $03_DoubleStreamExample {

	public static void main(final String[] args) {

		System.out.println("\n");
		final DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5);
		doubleStream.forEach(System.out::println);
		// OP: 1.1, 2.2, 3.3, 4.4, 5.5

		System.out.println("\n");
		final DoubleStream limit = DoubleStream.iterate(0.0, i -> i + 2.1)
				.limit(5);
		limit.forEach(System.out::println);
		// OP: 0.0, 2.1, 4.2, 6.3, 8.4

		System.out.println("\n");
		final DoubleStream limit1 = DoubleStream.generate(new Random()::nextDouble)
				.limit(5);
		limit1.forEach(System.out::println);
		// OP: 5 Random number like 0.5066212002690724, 0.08364727351066725, ...

		System.out.println("\n");
		final DoubleStream range = LongStream.range(1, 5)
				.asDoubleStream();
		range.forEach(System.out::println);
		// OP: 1.0, 2.0, 3.0, 4.0

		System.out.println("\n");
		final DoubleStream rangeClosed = LongStream.rangeClosed(1, 5)
				.asDoubleStream();
		rangeClosed.forEach(System.out::println);
		// OP: 1.0, 2.0, 3.0, 4.0, 5.0
	}
}

package ex04.stream;

import java.util.Random;
import java.util.stream.Stream;

public class $14_StreamFactoryMethodExample {

	public static void main(final String[] args) {

		// of
		System.out.println("\n");
		final Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream1.forEach(System.out::println);
		// OP: 1, 2, 3, 4, 5, 6, 7, 8, 9

		System.out.println("\n");
		final Stream<Integer> stream2 = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
		stream2.forEach(System.out::println);
		// OP: 1, 2, 3, 4, 5, 6, 7, 8, 9

		// iterator first 10 even number
		System.out.println("\n");
		final Stream<Integer> stream3 = Stream.iterate(0, i -> i + 2)
				.limit(10);
		stream3.forEach(System.out::println);
		// OP: 0, 2, 4, 6, 8, 10, 12, 14, 16, 18

		// Generate 10 Random number
		System.out.println("\n");
		final Stream<Integer> stream4 = Stream.generate(new Random()::nextInt)
				.limit(10);
		stream4.forEach(System.out::println);
		// OP: 10 Random number like 1665660965, -606990549, ...
	}
}

package ex04.stream.numericStream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class $05_BoxingUnBoxingExample {

	public static void main(final String[] args) {

		final List<Integer> numbers;

		System.out.println("\n");
		final IntStream intStream = IntStream.rangeClosed(0, 100);
		numbers = intStream
				.boxed()
				.collect(Collectors.toList());
		System.out.println(numbers);
		// OP: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ... to 100]

		System.out.println("\n");
		final Optional<Integer> sum = numbers.stream()
				.reduce((a, b) -> a + b);
		sum.ifPresent(System.out::println);
		// OP: 5050

		System.out.println("\n");
		final int sum1 = numbers.stream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println(sum1);
		// OP: 5050

	}
}

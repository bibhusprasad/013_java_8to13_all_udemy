package ex04.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class $11_StreamMinReduceExample {

	public static void main(final String[] args) {

		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		final Optional<Integer> min1 = numbers.stream()
				.min(Integer::compareTo);
		min1.ifPresent(System.out::println); // OP: 1

		final int min2 = numbers.stream()
				.reduce(1, (a, b) -> a < b ? a : b);
		System.out.println(min2);// OP: 1

		final Optional<Integer> min3 = numbers.stream()
				.reduce((a, b) -> a < b ? a : b);
		min3.ifPresent(System.out::println);// OP: 1

		final Optional<Integer> min4 = numbers.stream()
				.reduce(Integer::min);
		min4.ifPresent(System.out::println);// OP: 1
	}
}

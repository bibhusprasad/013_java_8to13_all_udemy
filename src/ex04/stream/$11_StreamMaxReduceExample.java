package ex04.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class $11_StreamMaxReduceExample {

	public static void main(final String[] args) {

		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		final Optional<Integer> max1 = numbers.stream()
				.max(Integer::compareTo);
		max1.ifPresent(System.out::println); // OP: 9

		final int max2 = numbers.stream()
				.reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(max2);// OP: 9

		final Optional<Integer> max3 = numbers.stream()
				.reduce((a, b) -> a > b ? a : b);
		max3.ifPresent(System.out::println);// OP: 9

		final Optional<Integer> max4 = numbers.stream()
				.reduce(Integer::max);
		max4.ifPresent(System.out::println);// OP: 9
	}
}

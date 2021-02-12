package ex04.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class $08_StreamReduceExample {

	public static void main(final String[] args) {
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 6, 7, 9, 9);

		final int sum = numbers.stream()
				.reduce(0, Integer::sum);
		System.out.println("\nSum is : " + sum); // OP: 42

		final int multiply = numbers.stream()
				.reduce(1, (a, b) -> a * b);
		System.out.println("\nMultiple : " + multiply); // OP: 102060

		System.out.println("\nEmpty Optional test");
		final List<Integer> emptyOptionalTest = Arrays.asList();
		final Optional<Integer> o1 = emptyOptionalTest.stream()
				.reduce(Integer::sum);
		o1.ifPresent(System.out::println);// OP: Empty Optional test

		System.out.println("\nOptional test");
		final List<Integer> optionalTest = Arrays.asList(1, 2, 3, 5, 6, 7, 9, 9);
		final Optional<Integer> o2 = optionalTest.stream()
				.reduce(Integer::sum);
		o2.ifPresent(System.out::println); // OP: 42
	}
}

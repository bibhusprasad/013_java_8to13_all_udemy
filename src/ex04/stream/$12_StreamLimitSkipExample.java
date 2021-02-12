package ex04.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class $12_StreamLimitSkipExample {

	public static void main(final String[] args) {

		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		final List<Integer> limit5Number = numbers.stream()
				.limit(5)
				.collect(Collectors.toList());
		System.out.println(limit5Number);// OP: [1, 2, 3, 4, 5]

		final List<Integer> skip5Number = numbers.stream()
				.skip(5)
				.collect(Collectors.toList());
		System.out.println(skip5Number);// OP: [6, 7, 8, 9]

	}
}

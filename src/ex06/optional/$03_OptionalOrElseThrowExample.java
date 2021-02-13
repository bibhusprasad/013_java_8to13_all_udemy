package ex06.optional;

import java.util.Optional;

public class $03_OptionalOrElseThrowExample {

	public static void main(final String[] args) {

		// orElse
		final Integer[] numbers = new Integer[10];
		numbers[0] = 1;
		final Optional<Integer> number = Optional.ofNullable(numbers[0]);
		int result = number.orElse(-1);
		System.out.println("result = " + result);
		// OP:
		// result = 1

		// orElseGet
		result = number.orElseGet(() -> -1);
		System.out.println("result - orElseGet = " + result);
		// OP:
		// result - orElseGet = 1

		// orElseThrow
		try {
			result = number.orElseThrow(Exception::new);
			System.out.println("result orElseThrow = " + result);
			// OP:
			// result orElseThrow = 1
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}

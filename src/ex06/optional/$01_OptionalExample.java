package ex06.optional;

import java.util.Optional;

public class $01_OptionalExample {

	public static void main(final String[] args) {

		final Integer[] numbers = new Integer[10];
	 // final int value = numbers[1].intValue();
	 // System.out.println(value);
		//OP:
		// Exception in thread "main" java.lang.NullPointerException
		// 		at ex06.optional.$01_OptionalExample.main($01_OptionalExample.java:8)

		final Optional<Integer> optional = Optional.ofNullable(numbers[1]);
		final int result = optional.isPresent() ? optional.get() : -1;
		System.out.println(result);
		// OP: -1
	}
}

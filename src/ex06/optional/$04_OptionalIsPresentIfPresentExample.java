package ex06.optional;

import java.util.Optional;

public class $04_OptionalIsPresentIfPresentExample {
	public static void main(final String[] args) {

		final Optional<String> optionalString = Optional.of("Hello World");
		if (optionalString.isPresent()) {
			System.out.println(optionalString);
			// OP: Optional[Hello World]
		}
		optionalString.ifPresent(System.out::println);
		// OP: Hello World

	}

}

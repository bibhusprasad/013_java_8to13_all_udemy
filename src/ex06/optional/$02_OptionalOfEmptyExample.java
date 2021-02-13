package ex06.optional;

import java.util.Optional;

public class $02_OptionalOfEmptyExample {

	public static Optional<String> getWords() {
		final String[] words = new String[10];
		final Optional<String> optionalS = Optional.ofNullable(words[1]);
		return optionalS;
	}

	public static void main(final String[] args) {
		final Optional<String> optionalString = Optional.of("Hello World");
		System.out.println("optionalString = " + optionalString);
		System.out.println("getWords: " + getWords());
		// OP:
		// optionalString = Optional[Hello World]
		// getWords: Optional.empty
	}
}

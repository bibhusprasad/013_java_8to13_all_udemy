package ex04.stream.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class $01_JoiningOperationExample {

	public static void main(final String[] args) {

		System.out.println("\n");
		final String joining1 = Stream.of("A", "B", "C", "D", "E")
				.collect(Collectors.joining());
		System.out.println(joining1); // OP: ABCDE

		System.out.println("\n");
		final String joining2 = Stream.of("A", "B", "C", "D", "E")
				.collect(Collectors.joining(","));
		System.out.println(joining2); // OP: A,B,C,D,E

		System.out.println("\n");
		final String joining3 = Stream.of("A", "B", "C", "D", "E")
				.collect(Collectors.joining(",", "{", "}"));
		System.out.println(joining3); // OP: {A,B,C,D,E}
	}
}

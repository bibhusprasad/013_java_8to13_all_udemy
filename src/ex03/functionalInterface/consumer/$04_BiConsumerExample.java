package ex03.functionalInterface.consumer;

import java.util.function.BiConsumer;

public class $04_BiConsumerExample {

	public static void main(final String[] args) {
		System.out.println("\nPrinting two number");
		final BiConsumer<Integer, Integer> bc1 = (x, y) -> System.out.println("x : " + x + " y : " + y);
		bc1.accept(4, 5);
		// OP:
		// Printing two number
		// x : 4 y : 5

		System.out.println("\nAdding two number");
		final BiConsumer<Integer, Integer> bc2 = (x, y) -> System.out.println(x + y);
		bc2.accept(4, 5);
		// OP:
		// Adding two number
		// 9

		System.out.println("\nConcatenate two String");
		final BiConsumer<String, String> bc3 = (x, y) -> System.out.println(x + " " + y);
		bc3.accept("bibhu", "samal");
		// OP:
		// Concatenate two String
		// bibhu samal
	}
}

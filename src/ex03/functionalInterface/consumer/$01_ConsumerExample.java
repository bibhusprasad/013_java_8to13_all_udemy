package ex03.functionalInterface.consumer;

import java.util.function.Consumer;

public class $01_ConsumerExample {

	public static void main(final String[] args) {
		final Consumer<String> consumer = x -> System.out.println(x.length() + " is the length of " + x);
		consumer.accept("Bibhu Prasad Samal"); // OP: 18 is the length of Bibhu Prasad Samal

		// Consumer with block of statement
		final Consumer<Integer> consumer1 = x -> {
			System.out.println("x*x : " + x * x);
			System.out.println("x+x : " + (x + x));
		};
		consumer1.accept(10);
		// OP:
		// x*x : 100
		// x+x : 20
	}
}

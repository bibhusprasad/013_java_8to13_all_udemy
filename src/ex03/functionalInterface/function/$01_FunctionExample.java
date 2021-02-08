package ex03.functionalInterface.function;

import java.util.function.Function;

public class $01_FunctionExample {

	public static void main(final String[] args) {

		final Function<Integer, Double> sqrt = n -> Math.sqrt(n);
		System.out.println("Print Square root of 64 is : " + sqrt.apply(64));
		// OP: Print Square root of 64 is : 8.0

		final Function<String, String> lowerCase = s -> s.toLowerCase();
		System.out.println("Lower case of PROGRAMMING is : " + lowerCase.apply("PROGRAMMING"));
		// OP: Lower case of PROGRAMMING is : programming

		final Function<String, String> concate = s -> s.concat(" In Java");
		System.out.println(lowerCase.andThen(concate).apply("PROGRAMMING")); // OP: programming In Java
		System.out.println(lowerCase.compose(concate).apply("PROGRAMMING")); // OP: programming in java
	}
}

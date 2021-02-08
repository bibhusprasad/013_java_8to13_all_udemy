package ex03.functionalInterface.references;

import java.util.function.Function;

public class $01_MethodReferencesExample {

	public static void main(final String[] args) {

		final Function<Integer, Double> sqrt = Math::sqrt;
		System.out.println("Print Square root of 64 is : " + sqrt.apply(64));
		// OP: Print Square root of 64 is : 8.0

		final Function<String, String> lowerCase = String::toLowerCase;
		System.out.println("Lower case of PROGRAMMING is : " + lowerCase.apply("PROGRAMMING"));
		// OP: Lower case of PROGRAMMING is : programming
	}
}

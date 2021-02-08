package ex03.functionalInterface.predicate;

import java.util.function.Predicate;

public class $01_PredicateExample {

	public static void main(final String[] args) {

		// i>10 then return true
		final Predicate<Integer> p1 = i -> i > 10;
		System.out.println(p1.test(10)); // OP: false

		// i>10 && number is even then return true
		final Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println(p1.and(p2).test(20)); // OP: true

		// i>10 || number is even then return true
		System.out.println(p1.or(p2).test(21)); // OP: true

		// i>10 && number is odd then return true
		System.out.println(p1.and(p2.negate()).test(21)); // OP: true
	}
}

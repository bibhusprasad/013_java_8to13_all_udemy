package ex03.functionalInterface.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class $03_PredicateSpecialExample {

	public static void main(final String[] args) {

		final IntPredicate ip = i -> i > 100;
		System.out.println(ip.test(100)); // OP: false

		final LongPredicate lp = i -> i > 100L;
		System.out.println(lp.test(101L)); // OP true

		final DoublePredicate dp = i -> i > 5.0;
		System.out.println(dp.test(5.1)); // OP: true
	}
}

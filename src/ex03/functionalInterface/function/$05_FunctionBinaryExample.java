package ex03.functionalInterface.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class $05_FunctionBinaryExample {

	public static void main(final String[] args) {

		final BinaryOperator<Integer> bo = (a, b) -> a * b;
		System.out.println(bo.apply(10, 10)); // OP: 100

		final Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
		System.out.println(comparator.compare(10, 11)); // OP: -1

		final BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
		System.out.println(maxBi.apply(7, 8)); // OP: 8

		final BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);
		System.out.println(minBi.apply(7, 8)); // OP: 7

		final IntBinaryOperator ibc = (a, b) -> a + b;
		System.out.println(ibc.applyAsInt(2, 4)); // OP: 6

		final LongBinaryOperator lbc = (a, b) -> a + b;
		System.out.println(lbc.applyAsLong(2L, 4L)); // OP: 6

		final DoubleBinaryOperator dbc = (a, b) -> a + b;
		System.out.println(dbc.applyAsDouble(2.3, 4.7));// OP: 7.0
	}
}

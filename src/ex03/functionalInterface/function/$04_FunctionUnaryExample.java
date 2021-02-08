package ex03.functionalInterface.function;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class $04_FunctionUnaryExample {

	public static void main(final String[] args) {

		final UnaryOperator<Integer> up = i -> i * 10;
		System.out.println(up.apply(100)); // OP: 1000

		final Function<Integer, Integer> f = i -> i * 10;
		System.out.println(f.apply(100)); // OP: 1000

		final IntUnaryOperator iuo = i -> i * 10;
		System.out.println(iuo.applyAsInt(100)); // OP: 1000

		final LongUnaryOperator luo = i -> i * 10;
		System.out.println(luo.applyAsLong(100L)); // OP: 1000

		final DoubleUnaryOperator duo = i -> i * 10;
		System.out.println(duo.applyAsDouble(100)); // OP: 1000.0
	}
}

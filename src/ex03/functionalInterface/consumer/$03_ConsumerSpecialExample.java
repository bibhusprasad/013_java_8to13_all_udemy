package ex03.functionalInterface.consumer;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class $03_ConsumerSpecialExample {

	public static void main(final String[] args) {

		final IntConsumer ic = i -> System.out.println(i * 10);
		ic.accept(10); // OP: 100

		final LongConsumer lc = i -> System.out.println(i * 10L);
		lc.accept(10); // OP: 100

		final DoubleConsumer dc = i -> System.out.println(i * 10.05);
		dc.accept(10); // OP: 100.5
	}
}

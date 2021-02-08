package ex03.functionalInterface.supplier;

import java.util.function.Supplier;

public class $01_SupplierExample {

	public static void main(final String[] args) {
		final Supplier<Integer> s = () -> (int) (Math.random() * 1000);
		System.out.println(s.get()); // OP: 309
		System.out.println(s.get()); // OP: 779
	}
}

package ex05.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class $01_ParallelStreamPerformanceExample {

	public static int sumSequentialStream() {
		return IntStream.rangeClosed(0, 50000)
				.sum();
	}

	public static int sumParallelStream() {
		return IntStream.rangeClosed(0, 50000)
				.parallel()
				.sum();
	}

	public static long measurePerformance(final Supplier<Integer> supplier, final int numberOfTimes) {
		final long startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfTimes; i++) {
			supplier.get();
		}
		return System.currentTimeMillis() - startTime;
	}

	public static void main(final String[] args) {
		final int loop = 100;
		long result = measurePerformance($01_ParallelStreamPerformanceExample::sumSequentialStream, loop);
		System.out.println("Time Taken to process sum in sequential: " + result + " in msecs");
		result = measurePerformance($01_ParallelStreamPerformanceExample::sumParallelStream, loop);
		System.out.println("Time Takes to process sum in Parallel: " + result + " in msecs");
		// OP:
		// Time Taken to process sum in sequential: 22 in msecs
		// Time Takes to process sum in Parallel: 16 in msecs

	}

}

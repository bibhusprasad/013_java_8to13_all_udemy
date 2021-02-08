package ex02.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class $11_SumOfNumbersUsingCallable {

	public static final int[] array = IntStream.rangeClosed(0, 5000).toArray();
	public static final int total = IntStream.rangeClosed(0, 5000).sum();

	public static void main(final String[] args) throws InterruptedException, ExecutionException {
		final Callable<Integer> callable1 = () -> {
			int sum = 0;
			for (int i = 0; i < array.length / 2; i++) {
				sum = sum + array[i];
			}
			return sum;
		};

		final Callable<Integer> callable2 = () -> {
			int sum = 0;
			for (int i = array.length / 2; i < array.length; i++) {
				sum = sum + array[i];
			}
			return sum;
		};

		final ExecutorService executorService = Executors.newFixedThreadPool(2);
		final List<Callable<Integer>> taskList = Arrays.asList(callable1, callable2);
		final List<Future<Integer>> results = executorService.invokeAll(taskList);

		int i = 0, sum = 0;
		for (final Future<Integer> future : results) {
			sum = sum + future.get();
			System.out.println("Sum of " + ++i + " results " + future.get());
		}

		// OP:
		// Sum of 1 results 3123750
		// Sum of 2 results 9378750

		System.out.println("Total Sum of Callable is " + sum);
		System.out.println("Total Sum of IntStream is " + total);

		// OP:
		// Total Sum of Callable is 12502500
		// Total Sum of IntStream is 12502500

		executorService.shutdown();

	}
}

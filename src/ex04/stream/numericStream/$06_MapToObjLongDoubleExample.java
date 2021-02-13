package ex04.stream.numericStream;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class $06_MapToObjLongDoubleExample {

	public static void main(final String[] args) {

		System.out.println("\n");
		final List<RandomIds> randomIds = IntStream.rangeClosed(0, 5)
				.mapToObj((i) -> {
			return new RandomIds(i, ThreadLocalRandom.current().nextInt(100));
		}).collect(Collectors.toList());
		randomIds.forEach(System.out::println);
		// OP:
		// RandomIds{id=0, randomNumbers=75}
		// RandomIds{id=1, randomNumbers=68}
		// RandomIds{id=2, randomNumbers=29}
		// RandomIds{id=3, randomNumbers=24}
		// RandomIds{id=4, randomNumbers=51}
		// RandomIds{id=5, randomNumbers=39}

		System.out.println("\n");
		final LongStream longStream = IntStream.rangeClosed(0, 5)
				.mapToLong(i -> (long) i);
		longStream.forEach(System.out::println);
		// OP: 0, 1, 2, 3, 4, 5

		System.out.println("\n");
		final DoubleStream doubleStream = LongStream.rangeClosed(0, 5)
				.mapToDouble(i -> (double) i);
		doubleStream.forEach(System.out::println);
		// OP: 0.0, 1.0, 2.0, 3.0, 4.0, 5.0
	}
}

class RandomIds {
	int id;
	int randomNumbers;

	public RandomIds(final int id, final int randomNumbers) {
		this.id = id;
		this.randomNumbers = randomNumbers;
	}

	@Override
	public String toString() {
		return "RandomIds{" + "id=" + this.id + ", randomNumbers=" + this.randomNumbers + '}';
	}
}

package ex04.stream.collectors;

import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $05_SummingIntAverageIntInstructorExample {

	public static void main(final String[] args) {

		final Integer sum = Instructors.getAll().stream()
				.collect(Collectors.summingInt(Instructor::getYearOfExperience));
		System.out.println(sum); // OP: 51

		final Double avg = Instructors.getAll().stream()
				.collect(Collectors.averagingInt(Instructor::getYearOfExperience));
		System.out.println(avg); // OP: 10.2
	}
}

package ex04.stream.collectors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $04_MinByMaxByInstructorExample {

	public static void main(final String[] args) {

		System.out.println("\n");
		final Optional<Instructor> min = Instructors.getAll().stream()
				.min(Comparator.comparing(Instructor::getYearOfExperience));
		min.ifPresent(System.out::println);
		// OP:
		// Instructor{name='Jenny', yearOfExperience=5, title='Engineer', gender='F', onlineCourses=false, courses=[Multi-Threaded Programming, CI/CD, Unit Testing]}

		System.out.println("\n");
		final Optional<Instructor> minBy = Instructors.getAll().stream()
				.collect(Collectors.minBy(Comparator.comparing(Instructor::getYearOfExperience)));
		minBy.ifPresent(System.out::println);
		// OP:
		// Instructor{name='Jenny', yearOfExperience=5, title='Engineer', gender='F', onlineCourses=false, courses=[Multi-Threaded Programming, CI/CD, Unit Testing]}

		System.out.println("\n");
		final Optional<Instructor> max = Instructors.getAll().stream()
				.max(Comparator.comparing(Instructor::getYearOfExperience));
		max.ifPresent(System.out::println);
		// OP:
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]}

		System.out.println("\n");
		final Optional<Instructor> maxBy = Instructors.getAll().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearOfExperience)));
		maxBy.ifPresent(System.out::println);
		// OP:
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]}

	}
}

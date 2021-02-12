package ex04.stream;

import java.util.Optional;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $13_StreamFindFirstAndFindAnyInstructorExample {

	public static void main(final String[] args) {

		final Optional<Instructor> findAny = Instructors.getAll().stream().findAny();
		findAny.ifPresent(System.out::println);
		// OP:
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]}

		final Optional<Instructor> findFirst = Instructors.getAll().stream().findFirst();
		findFirst.ifPresent(System.out::println);
		// OP:
		// Instructor{name='Mike', yearOfExperience=10, title='Software Developer', gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]}

	}
}

package ex04.stream;

import java.util.Optional;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $09_StreamReduceInstructorExample {
	public static void main(final String[] args) {

		System.out.println("\nFind the Instructor having highest years of experience.");
		final Optional<Instructor> instructor = Instructors.getAll().stream()
				.reduce((i1, i2) -> i1.getYearOfExperience() > i2.getYearOfExperience() ? i1 : i2);
		instructor.ifPresent(System.out::println);
		// OP:
		// Find the Instructor having highest years of experience.
		// Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}
	}
}

package ex04.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $07_StreamFilterInstructorExample {

	public static void main(final String[] args) {

		final List<Instructor> instructorList = Instructors.getAll();

		System.out.println("\nPrint all Instructor having more than 10 years of experience sort by name.");
		final List<Instructor> instructors = instructorList.stream()
				.filter(i -> i.getYearOfExperience() > 10)
				.sorted(Comparator.comparing(Instructor::getName))
				.collect(Collectors.toList());
		instructors.forEach(System.out::println);

		// OP:
		// Print all Instructor having more than 10 years of experience sort by name.
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]}
		// Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}
	}
}

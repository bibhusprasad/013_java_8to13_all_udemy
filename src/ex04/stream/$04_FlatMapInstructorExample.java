package ex04.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $04_FlatMapInstructorExample {
	public static void main(final String[] args) {
		final List<Instructor> instructorList = Instructors.getAll();

		System.out.println("\nPrint all instructor course name");
		final Set<String> courses = instructorList.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.collect(Collectors.toSet());
		System.out.println(courses);
		// OP:
		// Print all instructor course name
		// [Unit Testing, Angular Programming, Java Programming, CI/CD, Java Multi-Threaded Programming, C++ Programming, Multi-Threaded Programming, React Native, Python Programming, C Programming]
	}
}

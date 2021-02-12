package ex04.stream;

import java.util.List;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $05_StreamOperationsInstructorExample {

	public static void main(final String[] args) {
		final List<Instructor> instructorList = Instructors.getAll();

		// count
		System.out.println("\nCount the numbers of Courses.");
		final Long count = instructorList.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.count();
		System.out.println(count); // OP: 15

		// distinct
		System.out.println("\nCount the numbers of distinct Courses.");
		final Long distinctCount = instructorList.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream).distinct()
				.count();
		System.out.println(distinctCount); // OP: 10

		// sorted
		System.out.println("\nPrint the numbers of distinct Courses in sorted order.");
		final List<String> courses = instructorList.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(courses);
		// OP: [Angular Programming, C Programming, C++ Programming, CI/CD, Java
		// Multi-Threaded Programming, Java Programming, Multi-Threaded Programming,
		// Python Programming, React Native, Unit Testing]

		// anyMatch
		System.out.println("\nIs a course start with 'J'");
		final boolean isAnyMatch = instructorList.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.anyMatch(c -> c.startsWith("J"));
		System.out.println(isAnyMatch); // OP: true

		// allMatch
		System.out.println("\nIs all course start with 'J'");
		final boolean isAllMatch = instructorList.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.allMatch(c -> c.startsWith("J"));
		System.out.println(isAllMatch); // OP: false

		// allMatch
		System.out.println("\nIs no course start with 'J'");
		final boolean isNoneMatch = instructorList.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.noneMatch(c -> c.startsWith("J"));
		System.out.println(isNoneMatch); // OP: false
	}
}

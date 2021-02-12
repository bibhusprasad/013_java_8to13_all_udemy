package ex04.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $06_StreamComparatorInstructorExample {

	public static void main(final String[] args) {

		final List<Instructor> instructorList = Instructors.getAll();

		System.out.println("\nPrint all courses on reverse order.");
		final List<String> courses = instructorList.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.sorted((s1, s2) -> s2.compareTo(s1))
				.collect(Collectors.toList());
		System.out.println(courses);
		// OP:
		// Print all courses on reverse order.
		// [Unit Testing, React Native, React Native, React Native, Python Programming, Multi-Threaded Programming, Java Programming, Java Programming, Java Programming, Java Multi-Threaded Programming, CI/CD, C++ Programming, C++ Programming, C Programming, Angular Programming]

		System.out.println("\nPrint all instructors with there name in reverse order");
		final List<Instructor> instructors = instructorList.stream()
				.sorted(Comparator.comparing(Instructor::getName).reversed())
				.collect(Collectors.toList());
		instructors.forEach(System.out::println);
		// OP:
		// Print all instructors with there name in reverse order
		// Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}
		// Instructor{name='Mike', yearOfExperience=10, title='Software Developer', gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]}
		// Instructor{name='Jenny', yearOfExperience=5, title='Engineer', gender='F', onlineCourses=false, courses=[Multi-Threaded Programming, CI/CD, Unit Testing]}
		// Instructor{name='Gene', yearOfExperience=6, title='Manager', gender='M', onlineCourses=false, courses=[C++ Programming, C Programming, React Native]}
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]}

	}
}

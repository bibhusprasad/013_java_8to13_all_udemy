package ex04.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $06_GroupingInstructorExample {
	public static void main(final String[] args) {

		System.out.println("\n");
		final List<String> names = Arrays.asList("Syed", "Mike", "Jenny", "Gene", "Rajeev");
		final Map<Integer, List<String>> collect = Instructors.getAll().stream()
				.map(Instructor::getName)
				.collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
		// OP: {4=[Mike, Gene, Syed], 5=[Jenny], 7=[Anthony]}

		System.out.println("\n");
		final Map<String, List<Instructor>> collect1 = Instructors.getAll().stream()
				.collect(Collectors.groupingBy(Instructor::getGender));
		System.out.println(collect1);
		// OP:
		// {F=[Instructor{name='Jenny', yearOfExperience=5, title='Engineer', gender='F', onlineCourses=false, courses=[Multi-Threaded Programming, CI/CD, Unit Testing]}],
		//  M=[Instructor{name='Mike', yearOfExperience=10, title='Software Developer', gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]},
		//     Instructor{name='Gene', yearOfExperience=6, title='Manager', gender='M', onlineCourses=false, courses=[C++ Programming, C Programming, React Native]},
		//     Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]},
		//     Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}]}

		System.out.println("\n");
		final Map<String, List<Instructor>> collect2 = Instructors.getAll().stream()
				.collect(Collectors.groupingBy(instructor -> instructor.getYearOfExperience() > 10 ? "SENIOR" : "JUNIOR"));
		System.out.println(collect2);
		// OP:
		// {JUNIOR=[Instructor{name='Mike', yearOfExperience=10, title='Software Developer', gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]},
		//          Instructor{name='Jenny', yearOfExperience=5, title='Engineer', gender='F', onlineCourses=false, courses=[Multi-Threaded Programming, CI/CD, Unit Testing]},
		//          Instructor{name='Gene', yearOfExperience=6, title='Manager', gender='M', onlineCourses=false, courses=[C++ Programming, C Programming, React Native]}],
		//  SENIOR=[Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]},
		//  		Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}]}

	}
}

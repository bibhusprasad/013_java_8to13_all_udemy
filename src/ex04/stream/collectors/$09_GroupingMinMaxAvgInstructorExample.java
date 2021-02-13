package ex04.stream.collectors;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $09_GroupingMinMaxAvgInstructorExample {

	public static void main(final String[] args) {

		// Grouping instructor based on online and offline mode of teaches and find max
		// years of experience
		System.out.println("\n");
		final Map<Boolean, Optional<Instructor>> max = Instructors.getAll().stream().collect(Collectors.groupingBy(
				Instructor::isOnlineCourses, Collectors.maxBy(Comparator.comparing(Instructor::getYearOfExperience))));
		System.out.println(max);
		// OP:
		// {false=Optional[Instructor{name='Gene', yearOfExperience=6, title='Manager', gender='M', onlineCourses=false, courses=[C++ Programming, C Programming, React Native]}],
		//   true=Optional[Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]}]}

		// Grouping instructor based on online and offline mode of teaches and find min
		// years of experience
		System.out.println("\n");
		final Map<Boolean, Optional<Instructor>> min = Instructors.getAll().stream().collect(Collectors.groupingBy(
				Instructor::isOnlineCourses, Collectors.minBy(Comparator.comparing(Instructor::getYearOfExperience))));
		System.out.println(min);
		// OP:
		// {false=Optional[Instructor{name='Jenny', yearOfExperience=5, title='Engineer', gender='F', onlineCourses=false, courses=[Multi-Threaded Programming, CI/CD, Unit Testing]}],
		//   true=Optional[Instructor{name='Mike', yearOfExperience=10, title='Software Developer', gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]}]}

		// Grouping instructor based on online and offline mode of teaches and find min
		// years of experience
		System.out.println("\n");
		final Map<Boolean, Double> avg = Instructors.getAll().stream().collect(Collectors
				.groupingBy(Instructor::isOnlineCourses, Collectors.averagingInt(Instructor::getYearOfExperience)));
		System.out.println(avg);
		// OP:
		// {false=5.5, true=13.333333333333334}
	}
}

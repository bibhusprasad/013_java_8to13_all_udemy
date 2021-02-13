package ex04.stream.collectors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $08_GroupingInstructorExample {

	public static void main(final String[] args) {

		System.out.println("\nGroup Instructor name if name contains 'e'");
		final Map<Integer, List<String>> nameGroup = Instructors.getAll().stream()
				.map(Instructor::getName)
				.collect(Collectors.groupingBy(String::length, LinkedHashMap::new, Collectors.filtering(s -> s.contains("e"), Collectors.toList())));
		System.out.println(nameGroup);
		// OP:
		// Group Instructor name if name contains 'e'
		// {4=[Mike, Gene, Syed], 5=[Jenny], 7=[]}

		System.out.println("\nGroup Instructor based on experience and filter by online trainer");
		final Map<String, List<Instructor>> collect = Instructors.getAll().stream()
				.collect(Collectors.groupingBy(i -> i.getYearOfExperience() > 10 ? "SENIOR" : "JUNIOR", LinkedHashMap::new, Collectors.filtering(Instructor::isOnlineCourses, Collectors.toList())));
		System.out.println(collect);
		// OP:
		// {JUNIOR=[Instructor{name='Mike', yearOfExperience=10, title='Software Developer', gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]}],
		//  SENIOR=[Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]},
		//          Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}]}

	}
}

package ex04.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $01_StreamInstructorExample {

	public static void main(final String[] args) {

		final List<Instructor> instructorList = Instructors.getAll();
		System.out.println(
				"\nPrint all Instructor name and courses who teaches online and having more than 10 years of experience in map.");

		final Predicate<Instructor> p1 = Instructor::isOnlineCourses;
		final Predicate<Instructor> p2 = i -> i.getYearOfExperience() > 10;
		final Map<String, List<String>> map = instructorList.stream()
				.filter(p1)
				.filter(p2)
				.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		System.out.println(map);

		// OP:
		// Print all Instructor name and courses who teaches online and having more than 10 years of experience in map.
		// {Syed=[Java Programming, Java Multi-Threaded Programming, React Native], Anthony=[Java Programming, Angular Programming, React Native]}
	}
}

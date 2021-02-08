package ex03.functionalInterface.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $02_FunctionInstructorExample {

	public static void main(final String[] args) {

		final List<Instructor> instructorList = Instructors.getAll();

		// Map of Instructors with name and years of Experience
		// Function which will take List<Instructor> and return Map<String, Integer>
		System.out.println("\nPrint all Instructors name and years of Experience in Map");
		final Function<List<Instructor>, Map<String, Integer>> function1 = instructors -> {
			final Map<String, Integer> map = new HashMap<>();
			instructors.forEach(instructor -> {
				map.put(instructor.getName(), instructor.getYearOfExperience());
			});
			return map;
		};
		System.out.println(function1.apply(instructorList));
		// OP: Print all Instructors name and years of Experience in Map
		// OP: {Mike=10, Syed=15, Gene=6, Anthony=15, Jenny=5}

		System.out.println("\nPrint all Instructors name and years of Experience in Map who teaches online");
		final Predicate<Instructor> p = i -> i.isOnlineCourses();
		final Function<List<Instructor>, Map<String, Integer>> function2 = instructors -> {
			final Map<String, Integer> map = new HashMap<>();
			instructors.forEach(instructor -> {
				if (p.test(instructor)) {
					map.put(instructor.getName(), instructor.getYearOfExperience());
				}
			});
			return map;
		};
		System.out.println(function2.apply(instructorList));
		// OP: Print all Instructors name and years of Experience in Map who teaches
		// online
		// OP: {Mike=10, Syed=15, Anthony=15}
	}
}

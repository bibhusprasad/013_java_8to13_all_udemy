package ex03.functionalInterface.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $03_BiFunctionExample {

	public static void main(final String[] args) {

		// BiFunction2 inputs List<Instructor> and Predicate which will filter
		// instructor has online courses and return a Map<String, Integer>

		System.out.println("\nPrint all Instructors name and years of Experience in Map who teaches online");
		final BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> biFunction = (instructors, online) -> {
			final Map<String, Integer> map = new HashMap<>();
			instructors.forEach(instructor -> {
				if (online.test(instructor)) {
					map.put(instructor.getName(), instructor.getYearOfExperience());
				}
			});
			return map;
		};
		System.out.println(biFunction.apply(Instructors.getAll(), o -> o.isOnlineCourses()));
		// OP:
		// Print all Instructors name and years of Experience in Map who teaches online
		// {Mike=10, Syed=15, Anthony=15}
	}
}

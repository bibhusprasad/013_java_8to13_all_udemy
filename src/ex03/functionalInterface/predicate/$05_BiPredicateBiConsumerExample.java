package ex03.functionalInterface.predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $05_BiPredicateBiConsumerExample {

	public static void main(final String[] args) {

		final List<Instructor> instructorList = Instructors.getAll();
		final BiPredicate<Boolean, Integer> biPredicate = (online, experience) -> online == true && experience > 10;

		System.out.println(
				"\nBiConsumer Print name and courses of Instructors who teaches online and having more than 10 years of experience");
		final BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out
				.println("Name is " + name + " and Courses are " + courses);
		instructorList.forEach(instructor -> {
			if (biPredicate.test(instructor.isOnlineCourses(), instructor.getYearOfExperience())) {
				biConsumer.accept(instructor.getName(), instructor.getCourses());
			}
		});
		// OP:
		// BiConsumer Print name and courses of Instructors who teaches online and
		// having more than 10 years of experience
		//
		// Name is Anthony and Courses are [Java Programming, Angular Programming, React
		// Native]
		// Name is Syed and Courses are [Java Programming, Java Multi-Threaded
		// Programming, React Native]
	}
}

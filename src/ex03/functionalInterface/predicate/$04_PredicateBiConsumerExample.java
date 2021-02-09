package ex03.functionalInterface.predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $04_PredicateBiConsumerExample {

	public static void main(final String[] args) {

		final List<Instructor> instructorList = Instructors.getAll();
		final Predicate<Instructor> p1 = i -> i.isOnlineCourses();
		final Predicate<Instructor> p2 = i -> i.getYearOfExperience() > 10;

		System.out.println(
				"\nBiConsumer Print name and courses of Instructors who teaches online and having more than 10 years of experience");
		final BiConsumer<String, List<String>> biConsumer =
				(name, courses) -> System.out.println("Name is " + name + " and Courses are " + courses);
		instructorList.forEach(instructor -> {
			if ((p1.and(p2)).test(instructor)) {
				biConsumer.accept(instructor.getName(), instructor.getCourses());
			}
		});
		// OP:
		// BiConsumer Print name and courses of Instructors who teaches online and having more than 10 years of experience
		// Name is Anthony and Courses are [Java Programming, Angular Programming, React Native]
		// Name is Syed and Courses are [Java Programming, Java Multi-Threaded Programming, React Native]
	}
}

package ex03.functionalInterface.predicate;

import java.util.List;
import java.util.function.Predicate;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $02_PredicateInstructorExample {

	public static void main(final String[] args) {
		final List<Instructor> instructorList = Instructors.getAll();

		final Predicate<Instructor> p1 = i -> i.isOnlineCourses();
		final Predicate<Instructor> p2 = i -> i.getYearOfExperience() > 10;

		System.out.println("\nPrint Instructors who teaches online");
		instructorList.forEach(instructor -> {
			if (p1.test(instructor)) {
				System.out.println(instructor);
			}
		});
		// OP:
		// Print Instructors who teaches online
		// Instructor{name='Mike', yearOfExperience=10, title='Software Developer',
		// gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming,
		// Python Programming]}
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer',
		// gender='M', onlineCourses=true, courses=[Java Programming, Angular
		// Programming, React Native]}
		// Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer',
		// gender='M', onlineCourses=true, courses=[Java Programming, Java
		// Multi-Threaded Programming, React Native]}

		System.out.println("\nPrint Instructors who teaches online having more than 10 years of experience");
		instructorList.forEach(instructor -> {
			if ((p1.and(p2)).test(instructor)) {
				System.out.println(instructor);
			}
		});
		// OP
		// Print Instructors who teaches online having more than 10 years of experience
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer',
		// gender='M', onlineCourses=true, courses=[Java Programming, Angular
		// Programming, React Native]}
		// Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer',
		// gender='M', onlineCourses=true, courses=[Java Programming, Java
		// Multi-Threaded Programming, React Native]}
	}
}

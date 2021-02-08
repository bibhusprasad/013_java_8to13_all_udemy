package ex03.functionalInterface.references;

import java.util.Arrays;

import ex01.basic.Instructor;
import ex01.basic.InstructorFactory;

public class $03_ConstructorReferencesExample {

	public static void main(final String[] args) {

		final InstructorFactory instructorFactory = Instructor::new;
		final Instructor instructor1 = instructorFactory.getInstructor("Mike", 10, "Software Developer", "M", true,
				Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
		System.out.println(instructor1);
		// OP:
		// Instructor{name='Mike', yearOfExperience=10, title='Software Developer',
		// gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming,
		// Python Programming]}
	}
}

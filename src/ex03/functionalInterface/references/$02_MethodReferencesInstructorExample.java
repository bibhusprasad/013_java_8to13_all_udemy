package ex03.functionalInterface.references;

import java.util.function.Consumer;
import java.util.function.Predicate;

import ex01.basic.Instructor;

public class $02_MethodReferencesInstructorExample {

	public static void main(final String[] args) {

		final Predicate<Instructor> p = Instructor::isOnlineCourses;
		final Consumer<Instructor> c1 = System.out::println;
	}
}

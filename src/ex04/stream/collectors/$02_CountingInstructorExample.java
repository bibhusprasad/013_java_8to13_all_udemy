package ex04.stream.collectors;

import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $02_CountingInstructorExample {

	public static void main(final String[] args) {

		System.out.println("\nCount the instructors who teaches online.");
		final long count = Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses).count();
		System.out.println(count);

		final Long count1 = Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses)
				.collect(Collectors.counting());
		System.out.println(count1);

	}
}

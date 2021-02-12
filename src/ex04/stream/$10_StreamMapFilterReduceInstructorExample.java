package ex04.stream;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $10_StreamMapFilterReduceInstructorExample {

	public static void main(final String[] args) {

		System.out.println("\nPrint total years of experience instructors who teaches online.");
		final int totalYearsOfExperience = Instructors.getAll().stream()
				.filter(Instructor::isOnlineCourses)
				.map(Instructor::getYearOfExperience)
				.reduce(0, Integer::sum);
		System.out.println(totalYearsOfExperience); // OP: 40

	}
}

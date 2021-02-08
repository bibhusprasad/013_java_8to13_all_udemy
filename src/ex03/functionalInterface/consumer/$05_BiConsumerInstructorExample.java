package ex03.functionalInterface.consumer;

import java.util.List;
import java.util.function.BiConsumer;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $05_BiConsumerInstructorExample {

	public static void main(final String[] args) {

		final List<Instructor> instructorList = Instructors.getAll();

		System.out.println("\nPrint name and gender of Instructors");
		final BiConsumer<String, String> bc1 = (name, gender) -> System.out
				.println("Name : " + name + " and Gender : " + gender);
		instructorList.forEach(instructor -> {
			bc1.accept(instructor.getName(), instructor.getGender());
		});
		// OP:
		// Print name and gender of Instructors
		// Name : Mike and Gender : M
		// Name : Jenny and Gender : F
		// Name : Gene and Gender : M
		// Name : Anthony and Gender : M
		// Name : Syed and Gender : M

		System.out.println("\nPrint name and courses of Instructors");
		final BiConsumer<String, List<String>> bc2 = (name, courses) -> System.out
				.println("Name : " + name + " and Courses : " + courses);
		instructorList.forEach(instructor -> {
			bc2.accept(instructor.getName(), instructor.getCourses());
		});
		// OP:
		// Print name and courses of Instructors
		// Name : Mike and Courses : [Java Programming, C++ Programming, Python
		// Programming]
		// Name : Jenny and Courses : [Multi-Threaded Programming, CI/CD, Unit Testing]
		// Name : Gene and Courses : [C++ Programming, C Programming, React Native]
		// Name : Anthony and Courses : [Java Programming, Angular Programming, React
		// Native]
		// Name : Syed and Courses : [Java Programming, Java Multi-Threaded Programming,
		// React Native]

		System.out.println("\nPrint name and gender of Instructors who teaches online");
		instructorList.forEach(instructor -> {
			if (instructor.isOnlineCourses()) {
				bc1.accept(instructor.getName(), instructor.getGender());
			}
		});
		// OP:
		// Print name and gender of Instructors who teaches online
		// Name : Mike and Gender : M
		// Name : Anthony and Gender : M
		// Name : Syed and Gender : M

	}
}

package ex04.stream;

import java.util.List;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $03_MapInstructorExample {
	public static void main(final String[] args) {
		final List<Instructor> instructorList = Instructors.getAll();

		System.out.println("\nPrint all instructor name");
		final List<String> names1 = instructorList.stream()
				.map(Instructor::getName)
				.collect(Collectors.toList());
		System.out.println(names1);
		// OP:
		// Print all instructor name
		// [Mike, Jenny, Gene, Anthony, Syed]

		final List<String> names2 = instructorList.stream()
				.map(Instructor::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(names2);
		// OP:
		// [MIKE, JENNY, GENE, ANTHONY, SYED]
	}
}

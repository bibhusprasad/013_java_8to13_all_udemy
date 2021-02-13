package ex04.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $03_MappingInstructorExample {

	public static void main(final String[] args) {

		System.out.println("\n");
		final List<String> nameList = Instructors.getAll().stream()
				.map(Instructor::getName)
				.collect(Collectors.toList());
		System.out.println(nameList);
		// OP: [Mike, Jenny, Gene, Anthony, Syed]

		System.out.println("\n");
		final List<String> nameList1 = Instructors.getAll().stream()
				.collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
		System.out.println(nameList1);
		// OP: [Mike, Jenny, Gene, Anthony, Syed]

		System.out.println("\n");
		final Map<Integer, List<String>> map = Instructors.getAll().stream()
				.collect(Collectors.groupingBy(Instructor::getYearOfExperience, Collectors.mapping(Instructor::getName, Collectors.toList())));
		map.forEach((key, value) -> {
			System.out.println("Key : " + key + " Value : " + value);
		});
		// OP:
		// Key : 5 Value : [Jenny]
		// Key : 6 Value : [Gene]
		// Key : 10 Value : [Mike]
		// Key : 15 Value : [Anthony, Syed]
	}
}

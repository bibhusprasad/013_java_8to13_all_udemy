package ex04.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $10_PartitioningByInstructorExample {

	public static void main(final String[] args) {

		final Predicate<Instructor> predicate = instructor -> instructor.getYearOfExperience() > 10;

		System.out.println("\n");
		final Map<Boolean, List<Instructor>> collect = Instructors.getAll().stream()
				.collect(Collectors.partitioningBy(predicate));
		System.out.println(collect);
		// OP:
		// {false=[Instructor{name='Mike', yearOfExperience=10, title='Software Developer', gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]},
		//         Instructor{name='Jenny', yearOfExperience=5, title='Engineer', gender='F', onlineCourses=false, courses=[Multi-Threaded Programming, CI/CD, Unit Testing]},
		//         Instructor{name='Gene', yearOfExperience=6, title='Manager', gender='M', onlineCourses=false, courses=[C++ Programming, C Programming, React Native]}],
		//   true=[Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]},
		//         Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}]}

		System.out.println("\n");
		final Map<Boolean, Set<Instructor>> collect1 = Instructors.getAll().stream()
				.collect(Collectors.partitioningBy(predicate, Collectors.toSet()));
		System.out.println(collect1);
		// OP:
		// {false=[Instructor{name='Gene', yearOfExperience=6, title='Manager', gender='M', onlineCourses=false, courses=[C++ Programming, C Programming, React Native]},
		//         Instructor{name='Jenny', yearOfExperience=5, title='Engineer', gender='F', onlineCourses=false, courses=[Multi-Threaded Programming, CI/CD, Unit Testing]},
		//         Instructor{name='Mike', yearOfExperience=10, title='Software Developer', gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]}],
		//   true=[Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]},
		//         Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}]}
	}
}
